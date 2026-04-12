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
    public String useSkill1(Character target) {
        
        // Deduct stamina and advance turn counter
        this.stamina -= getSkill1Stamina();
        incrementTurnCounter();
        
        // Build the attack announcement
        String attackMsg = "[Turn " + turnCounter + "] " + name + " uses Deadeye Jumper!\n";
        
        // Calculate damage and get the target's reaction string
        int damage = 55 + random.nextInt(26);
        String damageMsg = target.takeDamage(damage);
        
        return attackMsg + damageMsg;
        
//        OLD CODE
//        if (!useStamina(45)) return;
//        incrementTurnCounter();
//        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses Deadeye Jumper!");
//        int damage = 55 + random.nextInt(26);
//        target.takeDamage(damage);
    }

    @Override
    public String useSkill2(Character target) {
        
        this.stamina -= getSkill2Stamina();
        incrementTurnCounter();
        
        String attackMsg = "[Turn " + turnCounter + "] " + name + " uses Court Vision!\n";
        
        int damage = 40 + random.nextInt(21);
        String damageMsg = target.takeDamage(damage);
        
        return attackMsg + damageMsg;
        
//        OLD CODE
//        if (!useStamina(35)) return;
//        incrementTurnCounter();
//        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses Court Vision!");
//        int damage = 40 + random.nextInt(21);
//        target.takeDamage(damage);
    }

    @Override
    public String useSkill3(Character target) {
        
        this.stamina -= getSkill3Stamina();
        incrementTurnCounter();
        
        String attackMsg = "[Turn " + turnCounter + "] " + name + " uses Clutch Assassin!\n";
        
        int damage = 90 + random.nextInt(41);
        String clutchMsg = ""; // Empty by default
        
        // Check if Larry's HP is below 30% to trigger the Clutch multiplier
        if (this.hp < (this.maxHp * 0.3)) {
            damage = (int)(damage * 1.5);
            clutchMsg = "🎯 CLUTCH ACTIVATED! Damage increased by 1.5x!\n";
        }
        
        // Apply the final calculated damage
        String damageMsg = target.takeDamage(damage);
        
        // Stack the messages: Attack -> Clutch Trigger (if any) -> Damage Dealt
        return attackMsg + clutchMsg + damageMsg;
        
//        OLD CODE
//        if (!useStamina(70)) return;
//        incrementTurnCounter();
//        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses Clutch Assassin!");
//        int damage = 90 + random.nextInt(41);
//        
//        if (hp < maxHp * 0.3) {
//            damage = (int)(damage * 1.5);
//            System.out.println(" CLUTCH ACTIVATED! Damage increased by 1.5x!");
//        }
//        
//        target.takeDamage(damage);
    }

    @Override 
    public String getSkill1Name() { 
        return "Deadeye Jumper"; 
        //return "Deadeye Jumper (Damage 45-70)"; 
    }
    
    @Override 
    public String getSkill2Name() { 
        return "Court Vision"; 
        //return "Court Vision (Damage 35-55)"; 
    }
    
    @Override 
    public String getSkill3Name() { 
        return "Clutch Assassin"; 
        //return "Clutch Assassin (Damage 90-130, 1.5x if HP < 30%)"; 
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