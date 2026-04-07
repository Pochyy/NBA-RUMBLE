/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nba.rumble;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author lario
 */
public class CharacterSelectScreen extends javax.swing.JFrame {
    
    public void showModePanel(String mode){
        pnlPVE.setVisible(false);
        pnlArcade.setVisible(false);
        pnlPVP.setVisible(false);
        
        switch(mode){
            case"PVP" -> pnlPVP.setVisible(true);
            case"PVE" -> pnlPVE.setVisible(true);
            case"Arcade" -> pnlArcade.setVisible(true);
        }
    }
    
    
    
    private void setupCharacterButtons(javax.swing.JButton btn, String characterPath){
        ImageIcon icon = new ImageIcon(getClass().getResource(characterPath));
        Image img = icon.getImage().getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_DEFAULT);
        btn.setIcon(new ImageIcon(img));
    }
    
    private void setupCharacterButtons(){
        
         //PVP
        setupCharacterButtons(btnJordan,"/Characters/Jordan/jordanplayercard.png");
        setupCharacterButtons(btnKobe,"/Characters/Kobe/kobeplayercard.png");
        setupCharacterButtons(btnLarry,"/Characters/LarryBird/larrybirdplayercard.png");
        setupCharacterButtons(btnShack,"/Characters/ShackONiel/shackplayercard.png");
        setupCharacterButtons(btnSteph,"/Characters/StephenCurry/stephencurryplayercard.png");
        setupCharacterButtons(btnLebron,"/Characters/Lebron/lebronplayercard.png");
        setupCharacterButtons(btnLuca,"/Characters/Luca/lucaplayercard.png");
        setupCharacterButtons(btnWemba,"/Characters/Wembayama/wembayamaplayercard.png");
        
        //PVE
        setupCharacterButtons(btnJordan1,"/Characters/Jordan/jordanplayercard.png");
        setupCharacterButtons(btnKobe1,"/Characters/Kobe/kobeplayercard.png");
        setupCharacterButtons(btnLarry1,"/Characters/LarryBird/larrybirdplayercard.png");
        setupCharacterButtons(btnShack1,"/Characters/ShackONiel/shackplayercard.png");
        setupCharacterButtons(btnSteph1,"/Characters/StephenCurry/stephencurryplayercard.png");
        setupCharacterButtons(btnLebron1,"/Characters/Lebron/lebronplayercard.png");
        setupCharacterButtons(btnLuca1,"/Characters/Luca/lucaplayercard.png");
        setupCharacterButtons(btnWemba1,"/Characters/Wembayama/wembayamaplayercard.png");
        
        //Arcade
        setupCharacterButtons(btnJordan2,"/Characters/Jordan/jordanplayercard.png");
        setupCharacterButtons(btnKobe2,"/Characters/Kobe/kobeplayercard.png");
        setupCharacterButtons(btnLarry2,"/Characters/LarryBird/larrybirdplayercard.png");
        setupCharacterButtons(btnShack2,"/Characters/ShackONiel/shackplayercard.png");
        setupCharacterButtons(btnSteph2,"/Characters/StephenCurry/stephencurryplayercard.png");
        setupCharacterButtons(btnLebron2,"/Characters/Lebron/lebronplayercard.png");
        setupCharacterButtons(btnLuca2,"/Characters/Luca/lucaplayercard.png");
        setupCharacterButtons(btnWemba2,"/Characters/Wembayama/wembayamaplayercard.png");
        
    }


    /**
     * Creates new form CharacterSelectScreen
     */
    public CharacterSelectScreen() {
        initComponents();
        
       setupCharacterButtons();
        
        ImageIcon pic = new ImageIcon(getClass().getResource("/Backgrounds/SelectScreenCharacters.png"));
        Image img = pic.getImage().getScaledInstance(lblCharacterSelectScreen.getWidth(), lblCharacterSelectScreen.getHeight(), Image.SCALE_DEFAULT);
        lblCharacterSelectScreen.setIcon(new ImageIcon(img));
        
        //Character Picks placeholders
        lblChc1.setBackground(new java.awt.Color(0, 0, 0, 150));
        lblChc2.setBackground(new java.awt.Color(0, 0, 0, 150));
        
            
     /*   
        //character Cards*
        ImageIcon Jordan = new ImageIcon(getClass().getResource("/Characters/Jordan/jordanplayercard.png"));
        Image jordan = Jordan.getImage().getScaledInstance(btnJordan.getWidth(), btnJordan.getHeight(), Image.SCALE_DEFAULT);
        btnJordan.setIcon(new ImageIcon(jordan));
        
                
        ImageIcon Kobe = new ImageIcon(getClass().getResource("/Characters/Kobe/kobeplayercard.png"));
        Image kobe = Kobe.getImage().getScaledInstance(btnKobe.getWidth(), btnKobe.getHeight(), Image.SCALE_DEFAULT);
        btnKobe.setIcon(new ImageIcon(kobe));      
        
        
        ImageIcon Larry = new ImageIcon(getClass().getResource("/Characters/LarryBird/larrybirdplayercard.png"));
        Image larry = Larry.getImage().getScaledInstance(btnLarry.getWidth(), btnLarry.getHeight(), Image.SCALE_DEFAULT);
        btnLarry.setIcon(new ImageIcon(larry));
        
        
        ImageIcon Lebron = new ImageIcon(getClass().getResource("/Characters/Lebron/lebronplayercard.png"));
        Image lebron = Lebron.getImage().getScaledInstance(btnLebron.getWidth(), btnLebron.getHeight(), Image.SCALE_DEFAULT);
        btnLebron.setIcon(new ImageIcon(lebron));        
                
        
        ImageIcon Luca = new ImageIcon(getClass().getResource("/Characters/Luca/lucaplayercard.png"));
        Image luca = Luca.getImage().getScaledInstance(btnLuca.getWidth(), btnLuca.getHeight(), Image.SCALE_DEFAULT);
        btnLuca.setIcon(new ImageIcon(luca));  
        
        
        ImageIcon Shack = new ImageIcon(getClass().getResource("/Characters/ShackONiel/shackplayercard.png"));
        Image shack = Shack.getImage().getScaledInstance(btnShack.getWidth(), btnShack.getHeight(), Image.SCALE_DEFAULT);
        btnShack.setIcon(new ImageIcon(shack)); 
        
        
       
               
        ImageIcon Steph = new ImageIcon(getClass().getResource("/Characters/StephenCurry/stephencurryplayercard.png"));
        Image steph = Steph.getImage().getScaledInstance(btnSteph.getWidth(), btnSteph.getHeight(), Image.SCALE_DEFAULT);
        btnSteph.setIcon(new ImageIcon(steph)); 
        
        
        
      
        ImageIcon Wemba = new ImageIcon(getClass().getResource("/Characters/Wembayama/wembayamaplayercard.png"));
        Image wemba = Wemba.getImage().getScaledInstance(btnWemba.getWidth(), btnWemba.getHeight(), Image.SCALE_DEFAULT);
        btnWemba.setIcon(new ImageIcon(wemba)); 
        
        
        */
                
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPVP = new javax.swing.JPanel();
        btnJordan = new javax.swing.JButton();
        btnKobe = new javax.swing.JButton();
        btnLarry = new javax.swing.JButton();
        btnLebron = new javax.swing.JButton();
        btnShack = new javax.swing.JButton();
        btnLuca = new javax.swing.JButton();
        btnSteph = new javax.swing.JButton();
        btnWemba = new javax.swing.JButton();
        txtPlayer2 = new javax.swing.JLabel();
        txtPlayer1 = new javax.swing.JLabel();
        txtVS = new javax.swing.JLabel();
        lblChc1 = new javax.swing.JLabel();
        lblChc2 = new javax.swing.JLabel();
        lblCharacterSelectScreen = new javax.swing.JLabel();
        pnlPVE = new javax.swing.JPanel();
        btnJordan1 = new javax.swing.JButton();
        btnKobe1 = new javax.swing.JButton();
        btnLarry1 = new javax.swing.JButton();
        btnShack1 = new javax.swing.JButton();
        btnSteph1 = new javax.swing.JButton();
        btnLebron1 = new javax.swing.JButton();
        btnLuca1 = new javax.swing.JButton();
        btnWemba1 = new javax.swing.JButton();
        txtPlayer3 = new javax.swing.JLabel();
        txtPlayer4 = new javax.swing.JLabel();
        txtVS1 = new javax.swing.JLabel();
        lblChc3 = new javax.swing.JLabel();
        lblChc4 = new javax.swing.JLabel();
        lblCharacterSelectScreen1 = new javax.swing.JLabel();
        pnlArcade = new javax.swing.JPanel();
        btnJordan2 = new javax.swing.JButton();
        btnKobe2 = new javax.swing.JButton();
        btnLebron2 = new javax.swing.JButton();
        btnLarry2 = new javax.swing.JButton();
        btnShack2 = new javax.swing.JButton();
        btnSteph2 = new javax.swing.JButton();
        btnLuca2 = new javax.swing.JButton();
        btnWemba2 = new javax.swing.JButton();
        txtPlayer6 = new javax.swing.JLabel();
        lblChc6 = new javax.swing.JLabel();
        lblCharacterSelectScreen2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPVP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJordan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/Jordan/jordanplayercard.png"))); // NOI18N
        btnJordan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnJordan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJordanActionPerformed(evt);
            }
        });
        pnlPVP.add(btnJordan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 730, 170, 260));

        btnKobe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/Kobe/kobeplayercard.png"))); // NOI18N
        btnKobe.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnKobe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKobeActionPerformed(evt);
            }
        });
        pnlPVP.add(btnKobe, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 730, 170, 260));

        btnLarry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/LarryBird/larrybirdplayercard.png"))); // NOI18N
        btnLarry.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnLarry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLarryActionPerformed(evt);
            }
        });
        pnlPVP.add(btnLarry, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 730, 170, 260));

        btnLebron.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/Lebron/lebronplayercard.png"))); // NOI18N
        btnLebron.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnLebron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLebronActionPerformed(evt);
            }
        });
        pnlPVP.add(btnLebron, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 730, 170, 260));

        btnShack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/ShackONiel/shackplayercard.png"))); // NOI18N
        btnShack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnShack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShackActionPerformed(evt);
            }
        });
        pnlPVP.add(btnShack, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 730, 170, 260));

        btnLuca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/Luca/lucaplayercard.png"))); // NOI18N
        btnLuca.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnLuca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLucaActionPerformed(evt);
            }
        });
        pnlPVP.add(btnLuca, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 730, 170, 260));

        btnSteph.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/StephenCurry/stephencurryplayercard.png"))); // NOI18N
        btnSteph.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnSteph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStephActionPerformed(evt);
            }
        });
        pnlPVP.add(btnSteph, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 730, 170, 260));

        btnWemba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/Wembayama/wembayamaplayercard.png"))); // NOI18N
        btnWemba.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnWemba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWembaActionPerformed(evt);
            }
        });
        pnlPVP.add(btnWemba, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 730, 170, 260));

        txtPlayer2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        txtPlayer2.setForeground(new java.awt.Color(0, 0, 0));
        txtPlayer2.setText("Player 2");
        pnlPVP.add(txtPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 200, 180, 110));

        txtPlayer1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        txtPlayer1.setForeground(new java.awt.Color(0, 0, 0));
        txtPlayer1.setText("Player 1");
        pnlPVP.add(txtPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 180, 110));

        txtVS.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        txtVS.setForeground(new java.awt.Color(0, 0, 0));
        txtVS.setText("VS");
        pnlPVP.add(txtVS, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 110, 110));

        lblChc1.setBackground(new java.awt.Color(68, 68, 68));
        lblChc1.setForeground(new java.awt.Color(0, 0, 0));
        lblChc1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        lblChc1.setOpaque(true);
        pnlPVP.add(lblChc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 290, 330, 370));

        lblChc2.setBackground(new java.awt.Color(68, 68, 68));
        lblChc2.setForeground(new java.awt.Color(0, 0, 0));
        lblChc2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        lblChc2.setOpaque(true);
        pnlPVP.add(lblChc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 330, 370));

        lblCharacterSelectScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/SelectScreenCharacters.png"))); // NOI18N
        pnlPVP.add(lblCharacterSelectScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -40, 1980, 1120));

        getContentPane().add(pnlPVP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pnlPVE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJordan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/Jordan/jordanplayercard.png"))); // NOI18N
        btnJordan1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnJordan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJordan1ActionPerformed(evt);
            }
        });
        pnlPVE.add(btnJordan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 730, 170, 260));

        btnKobe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/Kobe/kobeplayercard.png"))); // NOI18N
        btnKobe1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnKobe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKobe1ActionPerformed(evt);
            }
        });
        pnlPVE.add(btnKobe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 730, 170, 260));

        btnLarry1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/LarryBird/larrybirdplayercard.png"))); // NOI18N
        btnLarry1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnLarry1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLarry1ActionPerformed(evt);
            }
        });
        pnlPVE.add(btnLarry1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 730, 170, 260));

        btnShack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/ShackONiel/shackplayercard.png"))); // NOI18N
        btnShack1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnShack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShack1ActionPerformed(evt);
            }
        });
        pnlPVE.add(btnShack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 730, 170, 260));

        btnSteph1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/StephenCurry/stephencurryplayercard.png"))); // NOI18N
        btnSteph1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnSteph1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSteph1ActionPerformed(evt);
            }
        });
        pnlPVE.add(btnSteph1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 730, 170, 260));

        btnLebron1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/Lebron/lebronplayercard.png"))); // NOI18N
        btnLebron1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnLebron1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLebron1ActionPerformed(evt);
            }
        });
        pnlPVE.add(btnLebron1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 730, 170, 260));

        btnLuca1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/Luca/lucaplayercard.png"))); // NOI18N
        btnLuca1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnLuca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuca1ActionPerformed(evt);
            }
        });
        pnlPVE.add(btnLuca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 730, 170, 260));

        btnWemba1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/Wembayama/wembayamaplayercard.png"))); // NOI18N
        btnWemba1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnWemba1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWemba1ActionPerformed(evt);
            }
        });
        pnlPVE.add(btnWemba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 730, 170, 260));

        txtPlayer3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        txtPlayer3.setForeground(new java.awt.Color(0, 0, 0));
        txtPlayer3.setText("Bot");
        pnlPVE.add(txtPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 200, 180, 110));

        txtPlayer4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        txtPlayer4.setForeground(new java.awt.Color(0, 0, 0));
        txtPlayer4.setText("Player 1");
        pnlPVE.add(txtPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 180, 110));

        txtVS1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        txtVS1.setForeground(new java.awt.Color(0, 0, 0));
        txtVS1.setText("VS");
        pnlPVE.add(txtVS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 110, 110));

        lblChc3.setBackground(new java.awt.Color(68, 68, 68));
        lblChc3.setForeground(new java.awt.Color(0, 0, 0));
        lblChc3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        lblChc3.setOpaque(true);
        pnlPVE.add(lblChc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 290, 330, 370));

        lblChc4.setBackground(new java.awt.Color(68, 68, 68));
        lblChc4.setForeground(new java.awt.Color(0, 0, 0));
        lblChc4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        lblChc4.setOpaque(true);
        pnlPVE.add(lblChc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 330, 370));

        lblCharacterSelectScreen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/SelectScreenCharacters.png"))); // NOI18N
        pnlPVE.add(lblCharacterSelectScreen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -40, 1980, 1120));

        getContentPane().add(pnlPVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pnlArcade.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJordan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/Jordan/jordanplayercard.png"))); // NOI18N
        btnJordan2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnJordan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJordan2ActionPerformed(evt);
            }
        });
        pnlArcade.add(btnJordan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 730, 170, 260));

        btnKobe2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/Kobe/kobeplayercard.png"))); // NOI18N
        btnKobe2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnKobe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKobe2ActionPerformed(evt);
            }
        });
        pnlArcade.add(btnKobe2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 730, 170, 260));

        btnLebron2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/Lebron/lebronplayercard.png"))); // NOI18N
        btnLebron2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnLebron2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLebron2ActionPerformed(evt);
            }
        });
        pnlArcade.add(btnLebron2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 730, 170, 260));

        btnLarry2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/LarryBird/larrybirdplayercard.png"))); // NOI18N
        btnLarry2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnLarry2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLarry2ActionPerformed(evt);
            }
        });
        pnlArcade.add(btnLarry2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 730, 170, 260));

        btnShack2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/ShackONiel/shackplayercard.png"))); // NOI18N
        btnShack2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnShack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShack2ActionPerformed(evt);
            }
        });
        pnlArcade.add(btnShack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 730, 170, 260));

        btnSteph2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/StephenCurry/stephencurryplayercard.png"))); // NOI18N
        btnSteph2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnSteph2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSteph2ActionPerformed(evt);
            }
        });
        pnlArcade.add(btnSteph2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 730, 170, 260));

        btnLuca2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/Luca/lucaplayercard.png"))); // NOI18N
        btnLuca2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnLuca2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuca2ActionPerformed(evt);
            }
        });
        pnlArcade.add(btnLuca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 730, 170, 260));

        btnWemba2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/Wembayama/wembayamaplayercard.png"))); // NOI18N
        btnWemba2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        btnWemba2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWemba2ActionPerformed(evt);
            }
        });
        pnlArcade.add(btnWemba2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 730, 170, 260));

        txtPlayer6.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        txtPlayer6.setForeground(new java.awt.Color(0, 0, 0));
        txtPlayer6.setText("Player");
        pnlArcade.add(txtPlayer6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 180, 110));

        lblChc6.setBackground(new java.awt.Color(68, 68, 68));
        lblChc6.setForeground(new java.awt.Color(0, 0, 0));
        lblChc6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        lblChc6.setOpaque(true);
        pnlArcade.add(lblChc6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 330, 370));

        lblCharacterSelectScreen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/SelectScreenCharacters.png"))); // NOI18N
        pnlArcade.add(lblCharacterSelectScreen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -40, 1980, 1120));

        getContentPane().add(pnlArcade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJordanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJordanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJordanActionPerformed

    private void btnKobeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKobeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKobeActionPerformed

    private void btnLebronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLebronActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLebronActionPerformed

    private void btnLucaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLucaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLucaActionPerformed

    private void btnWembaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWembaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnWembaActionPerformed

    private void btnJordan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJordan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJordan1ActionPerformed

    private void btnKobe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKobe1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKobe1ActionPerformed

    private void btnLebron1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLebron1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLebron1ActionPerformed

    private void btnLuca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuca1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLuca1ActionPerformed

    private void btnWemba1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWemba1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnWemba1ActionPerformed

    private void btnJordan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJordan2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJordan2ActionPerformed

    private void btnKobe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKobe2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKobe2ActionPerformed

    private void btnLebron2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLebron2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLebron2ActionPerformed

    private void btnLuca2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuca2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLuca2ActionPerformed

    private void btnWemba2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWemba2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnWemba2ActionPerformed

    private void btnLarryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLarryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLarryActionPerformed

    private void btnShackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShackActionPerformed

    private void btnStephActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStephActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStephActionPerformed

    private void btnLarry2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLarry2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLarry2ActionPerformed

    private void btnShack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShack2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShack2ActionPerformed

    private void btnSteph2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSteph2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSteph2ActionPerformed

    private void btnLarry1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLarry1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLarry1ActionPerformed

    private void btnShack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShack1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShack1ActionPerformed

    private void btnSteph1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSteph1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSteph1ActionPerformed

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
            java.util.logging.Logger.getLogger(CharacterSelectScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CharacterSelectScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CharacterSelectScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CharacterSelectScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CharacterSelectScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJordan;
    private javax.swing.JButton btnJordan1;
    private javax.swing.JButton btnJordan2;
    private javax.swing.JButton btnKobe;
    private javax.swing.JButton btnKobe1;
    private javax.swing.JButton btnKobe2;
    private javax.swing.JButton btnLarry;
    private javax.swing.JButton btnLarry1;
    private javax.swing.JButton btnLarry2;
    private javax.swing.JButton btnLebron;
    private javax.swing.JButton btnLebron1;
    private javax.swing.JButton btnLebron2;
    private javax.swing.JButton btnLuca;
    private javax.swing.JButton btnLuca1;
    private javax.swing.JButton btnLuca2;
    private javax.swing.JButton btnShack;
    private javax.swing.JButton btnShack1;
    private javax.swing.JButton btnShack2;
    private javax.swing.JButton btnSteph;
    private javax.swing.JButton btnSteph1;
    private javax.swing.JButton btnSteph2;
    private javax.swing.JButton btnWemba;
    private javax.swing.JButton btnWemba1;
    private javax.swing.JButton btnWemba2;
    private javax.swing.JLabel lblCharacterSelectScreen;
    private javax.swing.JLabel lblCharacterSelectScreen1;
    private javax.swing.JLabel lblCharacterSelectScreen2;
    private javax.swing.JLabel lblChc1;
    private javax.swing.JLabel lblChc2;
    private javax.swing.JLabel lblChc3;
    private javax.swing.JLabel lblChc4;
    private javax.swing.JLabel lblChc6;
    private javax.swing.JPanel pnlArcade;
    private javax.swing.JPanel pnlPVE;
    private javax.swing.JPanel pnlPVP;
    private javax.swing.JLabel txtPlayer1;
    private javax.swing.JLabel txtPlayer2;
    private javax.swing.JLabel txtPlayer3;
    private javax.swing.JLabel txtPlayer4;
    private javax.swing.JLabel txtPlayer6;
    private javax.swing.JLabel txtVS;
    private javax.swing.JLabel txtVS1;
    // End of variables declaration//GEN-END:variables
}
