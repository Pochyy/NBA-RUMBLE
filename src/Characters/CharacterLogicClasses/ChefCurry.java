package Characters.CharacterLogicClasses;

import java.util.Random;

public class ChefCurry extends Character {
    private final Random random = new Random();

    public ChefCurry() {
        super("Chef Curry", "Chef Curry", 500, 580);
    }
    
    @Override
    public String getImagePath(){
        return "/Characters/StephenCurry/stephcurry.gif";
    }
    //C:\Users\lario\OneDrive\Documents\NetBeansProjects\NBA RUMBLE\src\Characters\StephenCurry\stephcurry.gif
    
    @Override
    public void useSkill1(Character target) {
        if (!useStamina(35)) return;
        incrementTurnCounter();
        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses Three Pointer!");
        int damage = 40 + random.nextInt(26);
        target.takeDamage(damage);
    }

    @Override
    public void useSkill2(Character target) {
        if (!useStamina(50)) return;
        incrementTurnCounter();
        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses Step Back!");
        int damage = 55 + random.nextInt(26);
        target.takeDamage(damage);
    }

    @Override
    public void useSkill3(Character target) {
        if (!useStamina(85)) return;
        incrementTurnCounter();
        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses God Mode!");
        int damage = 75 + random.nextInt(36);
        
        if (random.nextInt(100) < 35) {
            damage += 40;
            System.out.println(" CRITICAL HIT! +40 bonus damage!");
        }
        
        target.takeDamage(damage);
    }

    @Override 
    public String getSkill1Name() { 
        return "Three Pointer"; 
        //return "Three Pointer (Damage 40-65)"; 
    }
    
    @Override 
    public String getSkill2Name() { 
        return "Step Back"; 
        //return "Step Back (Damage 55-80)"; 
    }
    
    @Override 
    public String getSkill3Name() { 
        return "God Mode"; 
        // return "God Mode (Damage 75-110, 35% chance +40 damage)"; 
    }
    
    @Override 
    public int getSkill1Stamina() { return 35; }
    @Override 
    public int getSkill2Stamina() { return 50; }
    @Override 
    public int getSkill3Stamina() { return 85; }

    @Override
    public String getBackstory() {
        return "Undersized and doubted coming into the league, Curry changed basketball forever.\n" +
               "With limitless range and unmatched off-ball movement, he stretched defenses beyond reason.\n" +
               "What he lacks in size, he makes up for in skill, confidence, and explosive scoring runs.";
    }
}