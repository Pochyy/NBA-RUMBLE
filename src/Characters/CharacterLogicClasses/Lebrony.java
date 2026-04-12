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
    public String getSkill1Gif(){
        return "/Characters/Lebron/lebron_skill1.gif";
    }
    
    @Override
    public String getSkill2Gif(){
        return "/Characters/Lebron/lebron_skill2.gif";
    }
    
    @Override
    public String getSkill3Gif(){
        return "/Characters/Lebron/lebron_ult.gif";
    }

    @Override
    public String useSkill1(Character target) {
        
        this.stamina -= getSkill1Stamina();
        incrementTurnCounter();
        
        String attackMsg = "[Turn " + turnCounter + "] " + name + " uses Playmaker Prodigy!\n";
        
        int damage = 55 + random.nextInt(26);
        String damageMsg = target.takeDamage(damage);
        
        return attackMsg + damageMsg;
        
//        OLD CODE
//        if (!useStamina(45)) return;
//        incrementTurnCounter();
//        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses Playmaker Prodigy!");
//        int damage = 55 + random.nextInt(26);
//        target.takeDamage(damage);
    }

    @Override
    public String useSkill2(Character target) {
        
        this.stamina -= getSkill3Stamina();
        incrementTurnCounter();
        
        String attackMsg = "[Turn " + turnCounter + "] " + name + " uses The Crowned Dime!\n";
        
        int damage = 95 + random.nextInt(46);
        String damageMsg = target.takeDamage(damage);
        
        String followUpMsg = "";
        
        // Handle the 65% chance for a Follow-Up Attack
        if (random.nextInt(100) < 65) {
            int followUpDamage = 45 + random.nextInt(31);
            // Notice we call takeDamage AGAIN to calculate the second hit!
            followUpMsg = "\n👑 FOLLOW-UP ATTACK TRIGGERED!\n" + target.takeDamage(followUpDamage);
        }
        
        return attackMsg + damageMsg + followUpMsg;
        
//        OLD CODE
//        if (!useStamina(70)) return;
//        incrementTurnCounter();
//        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses King's Iron Block!");
//        int damage = 80 + random.nextInt(31);
//        target.takeDamage(damage);
    }

    @Override
    public String useSkill3(Character target) {
        
        this.stamina -= getSkill2Stamina();
        incrementTurnCounter();
        
        String attackMsg = "[Turn " + turnCounter + "] " + name + " uses King's Iron Block!\n";
        
        int damage = 80 + random.nextInt(31);
        String damageMsg = target.takeDamage(damage);
        
        return attackMsg + damageMsg;
        
//        OLD CODE
//        if (!useStamina(125)) return;
//        incrementTurnCounter();
//        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses The Crowned Dime!");
//        int damage = 95 + random.nextInt(46);
//        target.takeDamage(damage);
//        
//        if (random.nextInt(100) < 65) {
//            System.out.println(" FOLLOW-UP ATTACK TRIGGERED!");
//            int followUpDamage = 45 + random.nextInt(31);
//            target.takeDamage(followUpDamage);
//        }
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