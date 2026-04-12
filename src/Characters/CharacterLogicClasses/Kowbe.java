package Characters.CharacterLogicClasses;

import java.util.Random;

public class Kowbe extends Character {
    private final Random random = new Random();
    private int bonusDamageTurns = 0;

    public Kowbe() {
        super("Kowbe", "Black Mamba", 590, 620);
    }
    
    @Override
    public String getImagePath(){
        return "/Characters/Kobe/kowbe.gif";
    }

    @Override
    public String useSkill1(Character target) {
        
        // Deduct stamina and advance turn counter
        this.stamina -= getSkill1Stamina();
        incrementTurnCounter();
        
        String attackMsg = "[Turn " + turnCounter + "] " + name + " uses Post Up Smack!\n";
        int damage = 45 + random.nextInt(26);
        String bonusMsg = "";
        
        // Handle the active buff
        if (bonusDamageTurns > 0) {
            damage += 35;
            bonusMsg = "🐍 MAMBA MENTALITY: +35 Bonus damage applied!\n";
            bonusDamageTurns--;
        }
        
        String damageMsg = target.takeDamage(damage);
        
        return attackMsg + bonusMsg + damageMsg;
        
//        OLD CODE
//        if (!useStamina(40)) return;
//        incrementTurnCounter();
//        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses Post Up Smack!");
//        int damage = 45 + random.nextInt(26);
//        
//        if (bonusDamageTurns > 0) {
//            damage += 35;
//            System.out.println(" Bonus damage: +35!");
//            bonusDamageTurns--;
//        }
//        
//        target.takeDamage(damage);
    }

    @Override
    public String useSkill2(Character target) {
        
        this.stamina -= getSkill2Stamina();
        incrementTurnCounter();
        
        String attackMsg = "[Turn " + turnCounter + "] " + name + " uses Post Up Tackle!\n";
        int damage = 70 + random.nextInt(21);
        String bonusMsg = "";
        
        // Handle the active buff
        if (bonusDamageTurns > 0) {
            damage += 35;
            bonusMsg = "🐍 MAMBA MENTALITY: +35 Bonus damage applied!\n";
            bonusDamageTurns--;
        }
        
        String damageMsg = target.takeDamage(damage);
        
        return attackMsg + bonusMsg + damageMsg;
        
//        OLD CODE
//        if (!useStamina(60)) return;
//        incrementTurnCounter();
//        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses Post Up Tackle!");
//        int damage = 70 + random.nextInt(21);
//        
//        if (bonusDamageTurns > 0) {
//            damage += 35;
//            System.out.println(" Bonus damage: +35!");
//            bonusDamageTurns--;
//        }
//        
//        target.takeDamage(damage);
    }

    @Override
    public String useSkill3(Character target) {
        
        this.stamina -= getSkill3Stamina();
        incrementTurnCounter();
        
        String attackMsg = "[Turn " + turnCounter + "] " + name + " uses InYoFace Fadeaway!\n";
        int damage = 110 + random.nextInt(81);
        String bonusMsg = "";
        
        // Check if he ALREADY had the buff active before doing this move
        if (bonusDamageTurns > 0) {
            damage += 35;
            bonusMsg = "🐍 MAMBA MENTALITY: +35 Bonus damage applied!\n";
            bonusDamageTurns--;
        }
        
        String damageMsg = target.takeDamage(damage) + "\n";
        
        // Apply the new buff for future turns
        bonusDamageTurns = 2;
        String buffMsg = "🐍 Mamba Mentality activated! +35 Damage bonus to next 2 attacks!";
        
        // Return everything stacked together cleanly
        return attackMsg + bonusMsg + damageMsg + buffMsg;
        
//        OLD CODE
//        if (!useStamina(120)) return;
//        incrementTurnCounter();
//        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses InYoFace Fadeaway!");
//        int damage = 110 + random.nextInt(81);
//        
//        if (bonusDamageTurns > 0) {
//            damage += 35;
//            System.out.println(" Bonus damage: +35!");
//            bonusDamageTurns--;
//        }
//        
//        target.takeDamage(damage);
//        
//        bonusDamageTurns = 2;
//        System.out.println(" +35 Damage bonus applied to next 2 attacks!");
    }

    @Override 
    public String getSkill1Name() { 
        return "Post Up Smack"; 
        //return "Post Up Smack"; 
    }
    
    @Override 
    public String getSkill2Name() { 
        return "Post Up Tackle"; 
        //return "Post Up Tackle (Damage 70-90)"; 
    }
    
    @Override 
    public String getSkill3Name() { 
        return "InYoFace Fadeaway"; 
        //return "InYoFace Fadeaway (Damage 110-190, +35 damage to next 2 attacks)"; 
    }
    
    @Override 
    public int getSkill1Stamina() { return 40; }
    @Override 
    public int getSkill2Stamina() { return 60; }
    @Override 
    public int getSkill3Stamina() { return 120; }

    @Override
    public String getBackstory() {
        return "Played ball in France in his youth, Kowbe was a young warrior in the court who knew many languages to communicate with overseas teammates.\n" +
               "A born leader in and off the court, he knew how to lead with bravery, courage, and wits!\n" +
               "As he goes out to the world he becomes the Black Mamba who'll strike.";
    }
}