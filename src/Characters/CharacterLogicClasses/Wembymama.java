package Characters.CharacterLogicClasses;

import java.util.Random;

public class Wembymama extends Character {
    private final Random random = new Random();

    public Wembymama() {
        super("Wembymama", "The Unicorn", 600, 560);
    }
    
    @Override
    public String getImagePath(){
        return "/Characters/Wembayama/wembyra.gif";
    }

    @Override
    public String useSkill1(Character target) {
        
        this.stamina -= getSkill1Stamina();
        incrementTurnCounter();
        
        String attackMsg = "[Turn " + turnCounter + "] " + name + " uses Deep Range Three!\n";
        int damage = 45 + random.nextInt(26);
        String damageMsg = target.takeDamage(damage);
        
        return attackMsg + damageMsg;
        
//        OLD CODE
//        if (!useStamina(40)) return;
//        incrementTurnCounter();
//        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses Deep Range Three!");
//        int damage = 45 + random.nextInt(26);
//        target.takeDamage(damage);
    }

    @Override
    public String useSkill2(Character target) {
        
        this.stamina -= getSkill2Stamina();
        incrementTurnCounter();
        
        String attackMsg = "[Turn " + turnCounter + "] " + name + " uses One-Hand Slam!\n";
        int damage = 70 + random.nextInt(31);
        String damageMsg = target.takeDamage(damage);
        
        return attackMsg + damageMsg;
        
//        OLD CODE
//        if (!useStamina(70)) return;
//        incrementTurnCounter();
//        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses One-Hand Slam!");
//        int damage = 70 + random.nextInt(31);
//        target.takeDamage(damage);
    }

    @Override
    public String useSkill3(Character target) {
        
        this.stamina -= getSkill3Stamina();
        incrementTurnCounter();
        
        String attackMsg = "[Turn " + turnCounter + "] " + name + " uses Celestial Slam!\n";
        int damage = 100 + random.nextInt(61);
        String critMsg = "";
        
        // Handle the 30% Critical Impact chance
        if (random.nextInt(100) < 30) {
            damage += 25;
            critMsg = "☄️ MASSIVE CRITICAL IMPACT! +25 bonus damage!\n";
        }
        
        String damageMsg = target.takeDamage(damage);
        
        return attackMsg + critMsg + damageMsg;
        
//        OLD CODE
//        if (!useStamina(120)) return;
//        incrementTurnCounter();
//        System.out.println("\n[Turn " + turnCounter + "] " + name + " uses Celestial Slam!");
//        int damage = 100 + random.nextInt(61);
//        
//        if (random.nextInt(100) < 30) {
//            damage += 25;
//            System.out.println(" MASSIVE CRITICAL IMPACT! +25 bonus damage!");
//        }
//        
//        target.takeDamage(damage);
    }

    @Override 
    public String getSkill1Name() { 
        return "Deep Range Three"; 
        //return "Deep Range Three (Damage 45-70)"; 
    }
    
    @Override 
    public String getSkill2Name() { 
        return "One-Hand Slam"; 
        //return "One-Hand Slam (Damage 70-100)"; 
    }
    
    @Override 
    public String getSkill3Name() { 
        return "Celestial Slam";
        //return "Celestial Slam (Damage 100-160, 30% chance +25 damage)"; 
    }
    
    @Override 
    public int getSkill1Stamina() { return 40; }
    @Override 
    public int getSkill2Stamina() { return 70; }
    @Override 
    public int getSkill3Stamina() { return 120; }

    @Override
    public String getBackstory() {
        return "He learned the truth after a meteor shower - tiny alien organisms had fused with his cells,\n" +
               "quietly transforming his body into something built to survive anywhere.\n" +
               "They don't control him, but when his adrenaline surges, they awaken and push his strength,\n" +
               "speed, and precision far beyond human limits.";
    }
}