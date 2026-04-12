package Characters.CharacterLogicClasses;

import java.util.Random;

public class ShakeroNiel extends Character {
    private final Random random = new Random();
    private int groundbreakerTurns = 0;
    private boolean groundbreakerActive = false;

    public ShakeroNiel() {
        super("ShakeroNiel", "Diesel", 685, 410);
    }
    
    @Override
    public String getImagePath(){
        return "/Characters/ShackONiel/shaq.gif";
    }
    
    @Override
    public String getSkill1Gif(){
        return "/Characters/ShackONiel/shaq_skill1.gif";
    }
    
    @Override
    public String getSkill2Gif(){
        return "/Characters/ShackONiel/shaq_skill2.gif";
    }
    
    @Override
    public String getSkill3Gif(){
        return "/Characters/ShackONiel/shaq_ult.gif";
    }

    @Override
    public String useSkill1(Character target) {
        
        this.stamina -= getSkill1Stamina();
        incrementTurnCounter();
        
        String attackMsg = "[Turn " + turnCounter + "] " + name + " uses Power Dunk!\n";
        int damage = 30 + random.nextInt(21);
        String bonusMsg = "";
        
        if (groundbreakerActive && groundbreakerTurns > 0) {
            damage += 20;
            bonusMsg = "💥 Groundbreaker bonus: +20 damage!\n";
            groundbreakerTurns--;
            if (groundbreakerTurns == 0) {
                groundbreakerActive = false;
                bonusMsg += "🛑 Groundbreaker Mode ends!\n";
            }
        }
        
        String damageMsg = target.takeDamage(damage);
        
        return attackMsg + bonusMsg + damageMsg;
        
//        OLD CODE
//        if (!useStamina(65)) return;
//        incrementTurnCounter();
//        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses Power Dunk!");
//        int damage = 30 + random.nextInt(21);
//        
//        if (groundbreakerActive && groundbreakerTurns > 0) {
//            damage += 20;
//            System.out.println(" Groundbreaker bonus: +20 damage!");
//            groundbreakerTurns--;
//            if (groundbreakerTurns == 0) {
//                groundbreakerActive = false;
//                System.out.println(" Groundbreaker Mode ends!");
//            }
//        }
//        
//        target.takeDamage(damage);
    }

    @Override
    public String useSkill2(Character target) {
        
        this.stamina -= getSkill2Stamina();
        incrementTurnCounter();
        
        String attackMsg = "[Turn " + turnCounter + "] " + name + " uses Earthquake Slam!\n";
        int damage = 30 + random.nextInt(35);
        String bonusMsg = "";
        
        if (groundbreakerActive && groundbreakerTurns > 0) {
            damage += 15;
            bonusMsg = "💥 Groundbreaker bonus: +15 damage!\n";
            groundbreakerTurns--;
            if (groundbreakerTurns == 0) {
                groundbreakerActive = false;
                bonusMsg += "🛑 Groundbreaker Mode ends!\n";
            }
        }
        
        String damageMsg = target.takeDamage(damage);
        
        return attackMsg + bonusMsg + damageMsg;
        
//        OLD CODE
//        if (!useStamina(55)) return;
//        incrementTurnCounter();
//        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses Earthquake Slam!");
//        int damage = 30 + random.nextInt(35);
//        
//        if (groundbreakerActive && groundbreakerTurns > 0) {
//            damage += 15;
//            System.out.println(" Groundbreaker bonus: +15 damage!");
//            groundbreakerTurns--;
//            if (groundbreakerTurns == 0) {
//                groundbreakerActive = false;
//                System.out.println(" Groundbreaker Mode ends!");
//            }
//        }
//        
//        target.takeDamage(damage);
    }

    @Override
    public String useSkill3(Character target) {
        
        this.stamina -= getSkill3Stamina();
        incrementTurnCounter();
        
        String attackMsg = "[Turn " + turnCounter + "] " + name + " activates Groundbreaker Mode!\n";
        
        groundbreakerActive = true;
        groundbreakerTurns = 3;
        
        int damage = 100 + random.nextInt(61);
        String damageMsg = target.takeDamage(damage) + "\n";
        
        // Because heal() returns a string now, we catch it!
        String healMsg = heal(60) + "\n";
        String buffMsg = "💥 Groundbreaker Mode activated! Bonus damage active for 3 turns!";
        
        return attackMsg + damageMsg + healMsg + buffMsg;
        
//        OLD CODE
//        if (!useStamina(130)) return;
//        incrementTurnCounter();
//        System.out.println("\n[Turn " + turnCounter + "] " + name + " activates Groundbreaker Mode!");
//        
//        groundbreakerActive = true;
//        groundbreakerTurns = 3;
//        
//        int damage = 100 + random.nextInt(61);
//        target.takeDamage(damage);
//        
//        heal(60);
//        System.out.println(" Groundbreaker Mode activated for 3 turns!");
//        System.out.println(" +45 Damage bonus active for 3 turns!");
    }

    @Override 
    public String getSkill1Name() { 
        return "Power Dunk"; 
        //return "Power Dunk (Damage 30-50)"; 
    }
    
    @Override 
    public String getSkill2Name() { 
        return "Earthquake Slam";
        //return "Earthquake Slam (Damage 35-60)"; 
    }
    
    @Override 
    public String getSkill3Name() { 
        return "Groundbreaker Mode"; 
        //return "Groundbreaker Mode (Damage 100-160, +45 Damage for 3 turns, Heal 60)"; 
    }
    
    @Override 
    public int getSkill1Stamina() { return 65; }
    @Override 
    public int getSkill2Stamina() { return 55; }
    @Override 
    public int getSkill3Stamina() { return 130; }

    @Override
    public String getBackstory() {
        return "He was unstoppable. Years of intense training built a body so massive that every step felt like a tremor through the ground.\n" +
               "When he unleashes a full-force slam, it doesn't just crush opponents... it shakes the arena,\n" +
               "as if the earth itself is reacting to his power.";
    }
}