public class Monster extends GameCharacter{
    private boolean flyingUnit = false;
    public Monster(){
    }
    public boolean isFlyingUnit(){
        return flyingUnit;
    }
    public void setFlyingUnit(boolean flyingUnit){
        this.flyingUnit = flyingUnit;
    }

    public void attackEnemy(GameCharacter gameCharacter) {
        double damage = Math.random() * this.getCurrentStrength() * 3;
        gameCharacter.setCurrentHealth(gameCharacter.getCurrentHealth()-(int)damage);
        System.out.println("Monster do "+(int)damage+" to Hero");

        }

    }

