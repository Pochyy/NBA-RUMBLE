package Characters.CharacterLogicClasses;

import java.util.Random;

public class AirJordan extends Character {
    private final Random random = new Random();

    public AirJordan() {
        super("AirJordan", "The GOAT", 575, 540);
    }
    
    @Override
    public String getImagePath(){
        return "/Characters/Jordan/jordan.gif";
    }

    @Override
    public String useSkill1(Character target) {
        // 1. Deduct Stamina (FightScreen already checked if we had enough)
        this.stamina -= getSkill1Stamina();
        incrementTurnCounter();
        
        // 2. Build the attack announcement
        String attackMsg = "[Turn " + turnCounter + "] " + name + " uses Floating Jumper!\n";
        
        // 3. Calculate damage and catch the result string from the target
        int damage = 50 + random.nextInt(21);
        String damageMsg = target.takeDamage(damage); 
        
        // 4. Return the combined story!
        return attackMsg + damageMsg;
        
        
//        OLD CODE
//        if (!useStamina(35)) return;
//        incrementTurnCounter();
//        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses Floating Jumper!");
//        int damage = 50 + random.nextInt(21);
//        target.takeDamage(damage);
    }

    @Override
    public String useSkill2(Character target) {
        
        this.stamina -= getSkill2Stamina();
        incrementTurnCounter();
        
        String attackMsg = "[Turn " + turnCounter + "] " + name + " uses Air Dunk!\n";
        
        int damage = 75 + random.nextInt(26);
        String damageMsg = target.takeDamage(damage);
        
        return attackMsg + damageMsg;
          
//        OLD CODE
//        if (!useStamina(60)) return;
//        incrementTurnCounter();
//        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses Air Dunk!");
//        int damage = 75 + random.nextInt(26);
//        target.takeDamage(damage);
    }

    @Override
    public String useSkill3(Character target) {
        
        this.stamina -= getSkill3Stamina();
        incrementTurnCounter();
        
        String attackMsg = "[Turn " + turnCounter + "] " + name + " uses Goated Staredown!\n";
        
        int damage = 140 + random.nextInt(61);
        String damageMsg = target.takeDamage(damage) + "\n";
        
        // Handle the Goated Bonus chance
        String bonusMsg = "";
        if (random.nextInt(100) < 65) {
            // Because restoreStamina returns a String now, we just catch it!
            bonusMsg = "GOATED BONUS: " + this.restoreStamina(70);
            
//        if (!useStamina(125)) return;
//        incrementTurnCounter();
//        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses Goated Staredown!");
//        int damage = 140 + random.nextInt(61);
//        target.takeDamage(damage);
//        
//        if (random.nextInt(100) < 65) {
//            restoreStamina(70);
//            System.out.println(" GOATED BONUS: +70 Stamina!");
        }
        
        return attackMsg + damageMsg + bonusMsg;
    }

    @Override 
    public String getSkill1Name() { 
        return "Floating Jumper"; 
        //return "Floating Jumper (Damage 50-70)"; 
    }
    
    @Override 
    public String getSkill2Name() { 
        return "Air Dunk"; 
        //return "Air Dunk (Damage 75-100)"; 
    }
    
    @Override 
    public String getSkill3Name() { 
        return "Goated Staredown"; 
        //return "Goated Staredown (Damage 140-200, 65% chance: +70 Stamina)"; 
    }
    
    @Override 
    public int getSkill1Stamina() { return 35; }
    @Override 
    public int getSkill2Stamina() { return 60; }
    @Override 
    public int getSkill3Stamina() { return 125; }

    @Override
    public String getBackstory() {
        return "A varsity who got cut in his high school team in the goatland, AirJordan persevered, trained,\n" +
               "and used anger as his motivation to cut off all the obstacles that got in his way.\n" +
               "He became the greatest of all time after he won 6 GOATED rings.";
    }
}