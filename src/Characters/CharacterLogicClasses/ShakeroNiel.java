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
    public void useSkill1(Character target) {
        if (!useStamina(65)) return;
        incrementTurnCounter();
        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses Power Dunk!");
        int damage = 30 + random.nextInt(21);
        
        if (groundbreakerActive && groundbreakerTurns > 0) {
            damage += 20;
            System.out.println(" Groundbreaker bonus: +20 damage!");
            groundbreakerTurns--;
            if (groundbreakerTurns == 0) {
                groundbreakerActive = false;
                System.out.println(" Groundbreaker Mode ends!");
            }
        }
        
        target.takeDamage(damage);
    }

    @Override
    public void useSkill2(Character target) {
        if (!useStamina(55)) return;
        incrementTurnCounter();
        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses Earthquake Slam!");
        int damage = 30 + random.nextInt(35);
        
        if (groundbreakerActive && groundbreakerTurns > 0) {
            damage += 15;
            System.out.println(" Groundbreaker bonus: +15 damage!");
            groundbreakerTurns--;
            if (groundbreakerTurns == 0) {
                groundbreakerActive = false;
                System.out.println(" Groundbreaker Mode ends!");
            }
        }
        
        target.takeDamage(damage);
    }

    @Override
    public void useSkill3(Character target) {
        if (!useStamina(130)) return;
        incrementTurnCounter();
        System.out.println("\n[Turn " + turnCounter + "] " + name + " activates Groundbreaker Mode!");
        
        groundbreakerActive = true;
        groundbreakerTurns = 3;
        
        int damage = 100 + random.nextInt(61);
        target.takeDamage(damage);
        
        heal(60);
        System.out.println(" Groundbreaker Mode activated for 3 turns!");
        System.out.println(" +45 Damage bonus active for 3 turns!");
    }

    @Override 
    public String getSkill1Name() { 
        return "Power Dunk (Damage 30-50)"; 
    }
    
    @Override 
    public String getSkill2Name() { 
        return "Earthquake Slam (Damage 35-60)"; 
    }
    
    @Override 
    public String getSkill3Name() { 
        return "Groundbreaker Mode (Damage 100-160, +45 Damage for 3 turns, Heal 60)"; 
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