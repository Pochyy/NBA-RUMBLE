package Characters.CharacterLogicClasses;

public abstract class Character {
    protected String name;
    protected String nickname;
    protected int maxHp;
    protected int hp;
    protected int maxStamina;
    protected int stamina;
    protected int turnCounter;
    protected int totalHealingReceived;

    public Character(String name, String nickname, int maxHp, int maxStamina) {
        this.name = name;
        this.nickname = nickname;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.maxStamina = maxStamina;
        this.stamina = maxStamina;
        this.turnCounter = 0;
        this.totalHealingReceived = 0;
    }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) hp = 0;
        System.out.println(name + " takes " + damage + " damage! (HP: " + hp + "/" + maxHp + ")");
    }

    public void heal(int amount) {
        int maxHealPerBattle = maxHp / 3;
        int remainingHealCap = maxHealPerBattle - totalHealingReceived;
        
        if (remainingHealCap <= 0) {
            System.out.println(name + " has reached maximum healing capacity for this battle!");
            return;
        }
        
        int actualHeal = Math.min(amount, remainingHealCap);
        hp += actualHeal;
        totalHealingReceived += actualHeal;
        
        if (hp > maxHp) hp = maxHp;
        System.out.println(name + " heals " + actualHeal + " HP! (HP: " + hp + "/" + maxHp + ")");
    }

    public boolean useStamina(int amount) {
        if (stamina >= amount) {
            stamina -= amount;
            return true;
        }
        System.out.println(name + " doesn't have enough stamina! (Need: " + amount + ", Have: " + stamina + ")");
        return false;
    }

    public void restoreStamina(int amount) {
        stamina += amount;
        if (stamina > maxStamina) stamina = maxStamina;
        System.out.println(name + " regenerates " + amount + " stamina! (Stamina: " + stamina + "/" + maxStamina + ")");
    }

    public void incrementTurnCounter() {
        turnCounter++;
        int regenAmount = maxStamina / 20;
        if (regenAmount < 3) regenAmount = 3;
        if (regenAmount > 8) regenAmount = 8;
        restoreStamina(regenAmount);
    }
    
    public void desperateStaminaRestore() {
        int restoreAmount = maxStamina / 4;
        if (restoreAmount < 15) restoreAmount = 15;
        stamina += restoreAmount;
        if (stamina > maxStamina) stamina = maxStamina;
        System.out.println("\n" + name + " is exhausted! Taking a moment to catch breath...");
        System.out.println(name + " desperately restores " + restoreAmount + " stamina! (Stamina: " + stamina + "/" + maxStamina + ")");
    }
    
    public boolean canUseAnySkill() {
        return stamina >= getSkill1Stamina() || stamina >= getSkill2Stamina() || stamina >= getSkill3Stamina();
    }

    public void resetStats() {
        this.hp = maxHp;
        this.stamina = maxStamina;
        this.turnCounter = 0;
        this.totalHealingReceived = 0;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public String getName() { return name; }
    public String getNickname() { return nickname; }
    public int getHp() { return hp; }
    public int getMaxHp() { return maxHp; }
    public int getStamina() { return stamina; }
    public int getMaxStamina() { return maxStamina; }
    public int getTurnCounter() { return turnCounter; }

    public abstract void useSkill1(Character target);
    public abstract void useSkill2(Character target);
    public abstract void useSkill3(Character target);
    public abstract String getSkill1Name();
    public abstract String getSkill2Name();
    public abstract String getSkill3Name();
    public abstract int getSkill1Stamina();
    public abstract int getSkill2Stamina();
    public abstract int getSkill3Stamina();
    public abstract String getBackstory();
}