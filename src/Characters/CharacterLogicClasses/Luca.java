package Characters.CharacterLogicClasses;

import java.util.Random;

public class Luca extends Character {
    private final Random random = new Random();
    private int bonusDamageTurns = 0;

    public Luca() {
        super("Luca", "Magic", 590, 500);
    }
    
    @Override
    public String getImagePath(){
        return "/Characters/Luca/luka.gif"; 
        
    }
    
    @Override
    public String getSkill1Gif(){
        return "/Characters/Luca/luka_skill1.gif";
    }
    
    @Override
    public String getSkill2Gif(){
        return "/Characters/Luca/luka_skill2.gif";
    }
    
    @Override
    public String getSkill3Gif(){
        return "/Characters/Luca/luka_ult.gif";
    }

    @Override
    public String useSkill1(Character target) {
        
        this.stamina -= getSkill1Stamina();
        incrementTurnCounter();
        
        String attackMsg = "[Turn " + turnCounter + "] " + name + " uses Stepback Dagger!\n";
        int damage = 50 + random.nextInt(26);
        String bonusMsg = "";
        
        if (bonusDamageTurns > 0) {
            damage += 40;
            bonusMsg = "🪄 LUKA MAGIC: +40 Bonus damage applied!\n";
            bonusDamageTurns--;
        }
        
        String damageMsg = target.takeDamage(damage);
        
        return attackMsg + bonusMsg + damageMsg;
        
//        OLD CODE
//        if (!useStamina(40)) return;
//        incrementTurnCounter();
//        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses Stepback Dagger!");
//        int damage = 50 + random.nextInt(26);
//        
//        if (bonusDamageTurns > 0) {
//            damage += 40;
//            System.out.println(" Bonus damage: +40!");
//            bonusDamageTurns--;
//        }
//        
//        target.takeDamage(damage);
    }

    @Override
    public String useSkill2(Character target) {
        
        this.stamina -= getSkill2Stamina();
        incrementTurnCounter();
        
        String attackMsg = "[Turn " + turnCounter + "] " + name + " uses No-Look Nightmare!\n";
        int damage = 65 + random.nextInt(26);
        String bonusMsg = "";
        
        if (bonusDamageTurns > 0) {
            damage += 40;
            bonusMsg = "🪄 LUKA MAGIC: +40 Bonus damage applied!\n";
            bonusDamageTurns--;
        }
        
        String damageMsg = target.takeDamage(damage);
        
        return attackMsg + bonusMsg + damageMsg;
        
//        OLD CODE
//        if (!useStamina(55)) return;
//        incrementTurnCounter();
//        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses No-Look Nightmare!");
//        int damage = 65 + random.nextInt(26);
//        
//        if (bonusDamageTurns > 0) {
//            damage += 40;
//            System.out.println(" Bonus damage: +40!");
//            bonusDamageTurns--;
//        }
//        
//        target.takeDamage(damage);
    }

    @Override
    public String useSkill3(Character target) {
        
        this.stamina -= getSkill3Stamina();
        incrementTurnCounter();
        
        String attackMsg = "[Turn " + turnCounter + "] " + name + " uses Too Small Finisher!\n";
        int damage = 125 + random.nextInt(61);
        String bonusMsg = "";
        
        if (bonusDamageTurns > 0) {
            damage += 40;
            bonusMsg = "🪄 LUKA MAGIC: +40 Bonus damage applied!\n";
            bonusDamageTurns--;
        }
        
        String damageMsg = target.takeDamage(damage) + "\n";
        
        bonusDamageTurns = 2;
        String buffMsg = "🪄 Magic activated! +40 Damage bonus to next 2 attacks!";
        
        return attackMsg + bonusMsg + damageMsg + buffMsg;
        
//        OLD CODE
//        if (!useStamina(120)) return;
//        incrementTurnCounter();
//        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses Too Small Finisher!");
//        int damage = 125 + random.nextInt(61);
//        
//        if (bonusDamageTurns > 0) {
//            damage += 40;
//            System.out.println(" Bonus damage: +40!");
//            bonusDamageTurns--;
//        }
//        
//        target.takeDamage(damage);
//        
//        bonusDamageTurns = 2;
//        System.out.println(" +40 Damage bonus applied to next 2 attacks!");
    }

    @Override 
    public String getSkill1Name() { 
        return "Stepback Dagger"; 
        //return "Stepback Dagger (Damage 50-75)"; 
    }
    
    @Override 
    public String getSkill2Name() { 
        return "No-Look Nightmare"; 
        //return "No-Look Nightmare (Damage 65-90)";
    }
    
    @Override 
    public String getSkill3Name() { 
        return "Too Small Finisher"; 
        //return "Too Small Finisher (Damage 125-185, +40 damage to next 2 attacks)"; 
    }
    
    @Override 
    public int getSkill1Stamina() { return 40; }
    @Override 
    public int getSkill2Stamina() { return 55; }
    @Override 
    public int getSkill3Stamina() { return 120; }

    @Override
    public String getBackstory() {
        return "Hailing from Ljubljana, Slovenia, Luka was a prodigy who dominated Europe before even stepping onto an NBA court.\n" +
               "With elite footwork, deceptive pace, and unreal shot-making, he controls the game like a chess master.\n" +
               "He may not outrun you but he'll outthink you, outplay you, and hit the dagger in your face with a smirk.";
    }
}