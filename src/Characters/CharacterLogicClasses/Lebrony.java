package Characters.CharacterLogicClasses;

import java.util.Random;

public class Lebrony extends Character {
    private final Random random = new Random();

    public Lebrony() {
        super("Lebrony", "The King", 620, 520);
    }
    
    @Override
    public String getImagePath(){
        return "/Characters/Lebron/lebron.gif";
    }

    @Override
    public void useSkill1(Character target) {
        if (!useStamina(45)) return;
        incrementTurnCounter();
        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses Playmaker Prodigy!");
        int damage = 55 + random.nextInt(26);
        target.takeDamage(damage);
    }

    @Override
    public void useSkill2(Character target) {
        if (!useStamina(70)) return;
        incrementTurnCounter();
        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses King's Iron Block!");
        int damage = 80 + random.nextInt(31);
        target.takeDamage(damage);
    }

    @Override
    public void useSkill3(Character target) {
        if (!useStamina(125)) return;
        incrementTurnCounter();
        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses The Crowned Dime!");
        int damage = 95 + random.nextInt(46);
        target.takeDamage(damage);
        
        if (random.nextInt(100) < 65) {
            System.out.println(" FOLLOW-UP ATTACK TRIGGERED!");
            int followUpDamage = 45 + random.nextInt(31);
            target.takeDamage(followUpDamage);
        }
    }

    @Override 
    public String getSkill1Name() { 
        return "Playmaker Prodigy"; 
        //return "Playmaker Prodigy (Damage 55-80)"; 
    }
    
    @Override 
    public String getSkill2Name() { 
        return "King's Iron Block"; 
        //return "King's Iron Block (Damage 80-110)"; 
    }
    
    @Override 
    public String getSkill3Name() { 
        return "The Crowned Dime"; 
        //return "The Crowned Dime (Damage 95-140, 65% chance for follow-up attack)"; 
    }
    
    @Override 
    public int getSkill1Stamina() { return 45; }
    @Override 
    public int getSkill2Stamina() { return 70; }
    @Override 
    public int getSkill3Stamina() { return 125; }

    @Override
    public String getBackstory() {
        return "Born beneath the roaring crowds and stadium, Lebrony was whispered to be the prophesied child of the ancient King of Basketball,\n" +
               "a bloodline said to carry the strength of giants, the vision of prophets, and the will of warriors.\n" +
               "Though he grew up not in humble streets, he was blessed with the crown that found him.\n" +
               "Earned in struggle and desperation, he rises up to the kingdom of court, where he should belong.";
    }
}