public abstract class GameCharacter {
    private int maxHealth;
    private int currentHealth;
    private int baseStrength;
    private int currentStrength;

    public GameCharacter(){}

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getBaseStrength() {
        return baseStrength;
    }

    public void setBaseStrength(int baseStrength) {
        this.baseStrength = baseStrength;
    }

    public int getCurrentStrength() {
        return currentStrength;
    }

    public void setCurrentStrength(int currentStrength) {
        this.currentStrength = currentStrength;
    }
    public void attackEnemy(GameCharacter gameCharacter){

    }
    public String getStatus(){
        String currentHealth = String.valueOf(getCurrentHealth());
        String baseHealth = String.valueOf(getMaxHealth());
        String currentStr = String.valueOf(getCurrentStrength());
        String baseStr = String.valueOf(getBaseStrength());
        return currentHealth+"/"+baseHealth+"\t\t"+currentStr+"/"+baseStr;
    }
}
