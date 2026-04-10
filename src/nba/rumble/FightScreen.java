/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nba.rumble;

import java.awt.Image;
import javax.swing.ImageIcon;
import Characters.CharacterLogicClasses.Character;
/**
 *
 * @author lario
 */
public class FightScreen extends javax.swing.JFrame {
    
    private int p1RoundWins = 0; //Round Counters
    private int p2RoundWins = 0;
    
    private Character player1Character;
    private Character player2Character;
    
    public FightScreen(Character p1, Character p2){
        initComponents();
        
        this.player1Character = p1;
        this.player2Character = p2;
        
        setCharacterImages();
        setSkillNames();
        
        //Player 1 stats.
        //Set Health value for the Health Bar
        pbHealthPlayer1.setMaximum(player1Character.getMaxHp());
        pbHealthPlayer1.setValue(player1Character.getHp());
        
        //Set Stamina value for the Stamina Bar
        pbStaminaPlayer1.setMaximum(player1Character.getMaxStamina());
        pbStaminaPlayer1.setValue(player1Character.getStamina());

        //Player 2 stats.
        //Set Health value for the Health Bar
        pbHealthPlayer2.setMaximum(player2Character.getMaxHp());
        pbHealthPlayer2.setValue(player2Character.getHp());
        
        //Set Stamina value for the Stamina Bar
        pbStaminaPlayer2.setMaximum(player2Character.getMaxStamina());
        pbStaminaPlayer2.setValue(player2Character.getStamina());
        
        
        toggleButtons(); // Ensures P1 starts enabled and P2 starts disabled
   
    }
    
    public FightScreen() {
        initComponents();

    }
    
    /**
     * Creates new form FightScreen
     */
    
    private void setSkillNames() {
    // Player 1 buttons
    btnSkill1Player1.setText(player1Character.getSkill1Name());
    btnSkill2Player1.setText(player1Character.getSkill2Name());
    btnSkill3Player1.setText(player1Character.getSkill3Name());

    // Player 2 buttons
    btnSkill1Player2.setText(player2Character.getSkill1Name());
    btnSkill2Player2.setText(player2Character.getSkill2Name());
    btnSkill3Player2.setText(player2Character.getSkill3Name());
}
    
    private boolean isPlayer1Turn = true;
    
    
    private void updateBars(){
        
        //player 1 update GUI bar
        pbHealthPlayer1.setValue(player1Character.getHp());
        pbStaminaPlayer1.setValue(player1Character.getStamina());
        
        
        //player 2 update GUI bar
        pbHealthPlayer2.setValue(player2Character.getHp());
        pbStaminaPlayer2.setValue(player2Character.getStamina());
        
        // CHECK IF SOMEONE DIED
        checkGameOver();
        
    }
    private void setCharacterImages() {
        // Player 1
        ImageIcon icon1 = new ImageIcon(getClass().getResource(player1Character.getImagePath()));
        lblPlayer1Character.setIcon(icon1); // JLabel for Player 1

        // Player 2
        ImageIcon icon2 = new ImageIcon(getClass().getResource(player2Character.getImagePath()));
        lblPlayer2Character.setIcon(icon2); // JLabel for Player 2
    }
    
    
    private void toggleButtons() {
        // Player 1's buttons are active ONLY if it is Player 1's turn
        btnSkill1Player1.setEnabled(isPlayer1Turn);
        btnSkill2Player1.setEnabled(isPlayer1Turn);
        btnSkill3Player1.setEnabled(isPlayer1Turn);

        // Player 2's buttons are active ONLY if it is NOT Player 1's turn
        btnSkill1Player2.setEnabled(!isPlayer1Turn);
        btnSkill2Player2.setEnabled(!isPlayer1Turn);
        btnSkill3Player2.setEnabled(!isPlayer1Turn);
    }
    
    private void checkGameOver() {
        if (player1Character.getHp() <= 0) {
            p2RoundWins++;
            processRoundEnd("PLAYER 2 WINS THE ROUND!");
        } else if (player2Character.getHp() <= 0) {
            p1RoundWins++;
            processRoundEnd("PLAYER 1 WINS THE ROUND!");
        }
    }

    private void processRoundEnd(String message) {
        // 1. Show who won the round
        javax.swing.JOptionPane.showMessageDialog(this, message + "\nScore: P1 [" + p1RoundWins + "] - P2 [" + p2RoundWins + "]");

        // 2. Check if someone won the whole Match (Best of 3 = 2 wins)
        if (p1RoundWins == 2) {
            javax.swing.JOptionPane.showMessageDialog(this, "CONGRATULATIONS: PLAYER 1 IS THE CHAMPION!");
            endMatch();
        } else if (p2RoundWins == 2) {
            javax.swing.JOptionPane.showMessageDialog(this, "CONGRATULATIONS: PLAYER 2 IS THE CHAMPION!");
            endMatch();
        } else {
            // 3. If no one has 2 wins, reset for the next round
            resetRound();
        }
    }
    
    private void resetRound() {
        // Restore HP and Stamina to max
        player1Character.resetStats();
        player2Character.resetStats();

        // Refresh the progress bars
        updateBars();

        // Optional: Reset turn to Player 1 every new round
        isPlayer1Turn = true;
        toggleButtons();      // Apply button states
        updateBars();
    }

    
    private void endMatch() {
        // This takes the player back to the selection screen or menu
        new MenuScreen().setVisible(true);
        this.dispose();
    }
    
    // if ganahan mo mag disable ug controls, turn off comments and use this
//    private void disableControls() {
//    btnSkill1Player1.setEnabled(false);
//    btnSkill2Player1.setEnabled(false);
//    btnSkill3Player1.setEnabled(false);
//    btnSkill1Player2.setEnabled(false);
//    btnSkill2Player2.setEnabled(false);
//    btnSkill3Player2.setEnabled(false);
//}
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPVPScreen = new javax.swing.JPanel();
        lblPlayer1HealthBar = new javax.swing.JLabel();
        lblPlayer2HealthBar = new javax.swing.JLabel();
        lblPlayer1StaminaBar = new javax.swing.JLabel();
        lblPlayer2StaminaBar = new javax.swing.JLabel();
        pbHealthPlayer1 = new javax.swing.JProgressBar();
        pbStaminaPlayer1 = new javax.swing.JProgressBar();
        pbStaminaPlayer2 = new javax.swing.JProgressBar();
        pbHealthPlayer2 = new javax.swing.JProgressBar();
        btnSkill1Player1 = new javax.swing.JButton();
        btnSkill3Player1 = new javax.swing.JButton();
        btnSkill2Player1 = new javax.swing.JButton();
        btnSkill1Player2 = new javax.swing.JButton();
        btnSkill2Player2 = new javax.swing.JButton();
        btnSkill3Player2 = new javax.swing.JButton();
        lblPlayer1Character = new javax.swing.JLabel();
        lblPlayer2Character = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpPVPScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPlayer1HealthBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Objects/healthBarNStaminaBar.png"))); // NOI18N
        jpPVPScreen.add(lblPlayer1HealthBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 400, 60));

        lblPlayer2HealthBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Objects/healthBarNStaminaBar.png"))); // NOI18N
        jpPVPScreen.add(lblPlayer2HealthBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 50, 400, 60));

        lblPlayer1StaminaBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Objects/healthBarNStaminaBar.png"))); // NOI18N
        jpPVPScreen.add(lblPlayer1StaminaBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 400, 60));

        lblPlayer2StaminaBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Objects/healthBarNStaminaBar.png"))); // NOI18N
        jpPVPScreen.add(lblPlayer2StaminaBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 120, 400, 60));

        pbHealthPlayer1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pbHealthPlayer1.setForeground(new java.awt.Color(255, 255, 255));
        pbHealthPlayer1.setString("Health");
        pbHealthPlayer1.setStringPainted(true);
        jpPVPScreen.add(pbHealthPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 400, 60));

        pbStaminaPlayer1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pbStaminaPlayer1.setForeground(new java.awt.Color(255, 255, 255));
        pbStaminaPlayer1.setString("Stamina");
        pbStaminaPlayer1.setStringPainted(true);
        jpPVPScreen.add(pbStaminaPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 400, 60));

        pbStaminaPlayer2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pbStaminaPlayer2.setForeground(new java.awt.Color(255, 255, 255));
        pbStaminaPlayer2.setString("Stamina");
        pbStaminaPlayer2.setStringPainted(true);
        jpPVPScreen.add(pbStaminaPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 120, 400, 60));

        pbHealthPlayer2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pbHealthPlayer2.setForeground(new java.awt.Color(255, 255, 255));
        pbHealthPlayer2.setString("Health");
        pbHealthPlayer2.setStringPainted(true);
        jpPVPScreen.add(pbHealthPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 50, 400, 60));

        btnSkill1Player1.setBackground(new java.awt.Color(255, 255, 255));
        btnSkill1Player1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSkill1Player1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Objects/skillplaceholder.png"))); // NOI18N
        btnSkill1Player1.setText("Skill 1");
        btnSkill1Player1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSkill1Player1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkill1Player1ActionPerformed(evt);
            }
        });
        jpPVPScreen.add(btnSkill1Player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 830, 140, 110));

        btnSkill3Player1.setBackground(new java.awt.Color(255, 255, 255));
        btnSkill3Player1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSkill3Player1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Objects/skillplaceholder.png"))); // NOI18N
        btnSkill3Player1.setText("Skill 3");
        btnSkill3Player1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSkill3Player1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkill3Player1ActionPerformed(evt);
            }
        });
        jpPVPScreen.add(btnSkill3Player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 830, 140, 110));

        btnSkill2Player1.setBackground(new java.awt.Color(255, 255, 255));
        btnSkill2Player1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSkill2Player1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Objects/skillplaceholder.png"))); // NOI18N
        btnSkill2Player1.setText("Skill 2");
        btnSkill2Player1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSkill2Player1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkill2Player1ActionPerformed(evt);
            }
        });
        jpPVPScreen.add(btnSkill2Player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 830, 140, 110));

        btnSkill1Player2.setBackground(new java.awt.Color(255, 255, 255));
        btnSkill1Player2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSkill1Player2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Objects/skillplaceholder.png"))); // NOI18N
        btnSkill1Player2.setText("Skill 1");
        btnSkill1Player2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSkill1Player2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkill1Player2ActionPerformed(evt);
            }
        });
        jpPVPScreen.add(btnSkill1Player2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 830, 140, 110));

        btnSkill2Player2.setBackground(new java.awt.Color(255, 255, 255));
        btnSkill2Player2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSkill2Player2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Objects/skillplaceholder.png"))); // NOI18N
        btnSkill2Player2.setText("Skill 2");
        btnSkill2Player2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSkill2Player2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkill2Player2ActionPerformed(evt);
            }
        });
        jpPVPScreen.add(btnSkill2Player2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 830, 140, 110));

        btnSkill3Player2.setBackground(new java.awt.Color(255, 255, 255));
        btnSkill3Player2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSkill3Player2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Objects/skillplaceholder.png"))); // NOI18N
        btnSkill3Player2.setText("Skill 3");
        btnSkill3Player2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSkill3Player2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkill3Player2ActionPerformed(evt);
            }
        });
        jpPVPScreen.add(btnSkill3Player2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 830, 140, 110));

        lblPlayer1Character.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jpPVPScreen.add(lblPlayer1Character, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 440, 430));

        lblPlayer2Character.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jpPVPScreen.add(lblPlayer2Character, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 260, 440, 430));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/SelectScreenCharacters.png"))); // NOI18N
        jpPVPScreen.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        getContentPane().add(jpPVPScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSkill1Player1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkill1Player1ActionPerformed
        // TODO add your handling code here:
        player1Character.useSkill1(player2Character);
        updateBars();
        
        isPlayer1Turn = false; // Switch to Player 2
        toggleButtons();       // Update the buttons
    }//GEN-LAST:event_btnSkill1Player1ActionPerformed

    private void btnSkill3Player1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkill3Player1ActionPerformed
        // TODO add your handling code here:
       player1Character.useSkill3(player2Character);
        updateBars();
        
        isPlayer1Turn = false; // Switch to Player 2
        toggleButtons();       // Update the buttons
    }//GEN-LAST:event_btnSkill3Player1ActionPerformed

    private void btnSkill2Player1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkill2Player1ActionPerformed
        // TODO add your handling code here:
        player1Character.useSkill2(player2Character);
        updateBars();
        
        isPlayer1Turn = false; // Switch to Player 2
        toggleButtons();       // Update the buttons
    }//GEN-LAST:event_btnSkill2Player1ActionPerformed

    private void btnSkill1Player2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkill1Player2ActionPerformed
        // TODO add your handling code here:
        player2Character.useSkill1(player1Character);
        updateBars();
        
        isPlayer1Turn = true; // Switch to Player 1
        toggleButtons();       // Update the buttons
    }//GEN-LAST:event_btnSkill1Player2ActionPerformed

    private void btnSkill2Player2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkill2Player2ActionPerformed
        // TODO add your handling code here:
        player2Character.useSkill2(player1Character);
        updateBars();
        
        isPlayer1Turn = true; // Switch to Player 1
        toggleButtons();       // Update the buttons
    }//GEN-LAST:event_btnSkill2Player2ActionPerformed

    private void btnSkill3Player2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkill3Player2ActionPerformed
        // TODO add your handling code here:
        player2Character.useSkill3(player1Character);
        updateBars();
        
        isPlayer1Turn = true; // Switch to Player 1
        toggleButtons();       // Update the buttons
    }//GEN-LAST:event_btnSkill3Player2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FightScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FightScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FightScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FightScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FightScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSkill1Player1;
    private javax.swing.JButton btnSkill1Player2;
    private javax.swing.JButton btnSkill2Player1;
    private javax.swing.JButton btnSkill2Player2;
    private javax.swing.JButton btnSkill3Player1;
    private javax.swing.JButton btnSkill3Player2;
    private javax.swing.JPanel jpPVPScreen;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblPlayer1Character;
    private javax.swing.JLabel lblPlayer1HealthBar;
    private javax.swing.JLabel lblPlayer1StaminaBar;
    private javax.swing.JLabel lblPlayer2Character;
    private javax.swing.JLabel lblPlayer2HealthBar;
    private javax.swing.JLabel lblPlayer2StaminaBar;
    private javax.swing.JProgressBar pbHealthPlayer1;
    private javax.swing.JProgressBar pbHealthPlayer2;
    private javax.swing.JProgressBar pbStaminaPlayer1;
    private javax.swing.JProgressBar pbStaminaPlayer2;
    // End of variables declaration//GEN-END:variables
}
