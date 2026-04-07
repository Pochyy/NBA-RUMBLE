package Characters.CharacterLogicClasses;

import java.util.Random;

public class LarryBird extends Character {
    private final Random random = new Random();

    public LarryBird() {
        super("Larry Bird", "Larry Legend", 520, 420);
    }
    
    @Override
    public String getImagePath(){
        return "/Characters/LarryBird/larrybird.gif";
    }

    @Override
    public void useSkill1(Character target) {
        if (!useStamina(45)) return;
        incrementTurnCounter();
        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses Deadeye Jumper!");
        int damage = 55 + random.nextInt(26);
        target.takeDamage(damage);
    }

    @Override
    public void useSkill2(Character target) {
        if (!useStamina(35)) return;
        incrementTurnCounter();
        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses Court Vision!");
        int damage = 40 + random.nextInt(21);
        target.takeDamage(damage);
    }

    @Override
    public void useSkill3(Character target) {
        if (!useStamina(70)) return;
        incrementTurnCounter();
        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses Clutch Assassin!");
        int damage = 90 + random.nextInt(41);
        
        if (hp < maxHp * 0.3) {
            damage = (int)(damage * 1.5);
            System.out.println(" CLUTCH ACTIVATED! Damage increased by 1.5x!");
        }
        
        target.takeDamage(damage);
    }

    @Override 
    public String getSkill1Name() { 
        return "Deadeye Jumper (Damage 45-70)"; 
    }
    
    @Override 
    public String getSkill2Name() { 
        return "Court Vision (Damage 35-55)"; 
    }
    
    @Override 
    public String getSkill3Name() { 
        return "Clutch Assassin (Damage 90-130, 1.5x if HP < 30%)"; 
    }
    
    @Override 
    public int getSkill1Stamina() { return 45; }
    @Override 
    public int getSkill2Stamina() { return 35; }
    @Override 
    public int getSkill3Stamina() { return 70; }

    @Override
    public String getBackstory() {
        return "Raised in French Lick, Indiana, Larry Bird built his game on grit, confidence, and pure skill.\n" +
               "He wasn't the fastest or most athletic but his IQ, shooting, and clutch mentality made him a nightmare.\n" +
               "He backed up every word he said and dominated the 80s with cold-blooded precision.";
    }
}