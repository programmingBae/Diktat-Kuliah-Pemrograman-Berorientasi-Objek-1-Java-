public class Bow extends Item implements Weapon{
    private int numberOfArrow;
    @Override
    public void attack(GameCharacter attacker, GameCharacter enemy) {
        int damage = attacker.getCurrentStrength()*15/100*3*getDamage();
        enemy.setCurrentHealth(enemy.getCurrentHealth() - damage );
        System.out.println("Hero do "+damage+" to Hero");
    }

    @Override
    public int getDamage() {
        return 5;
    }



    public Bow(){
        setName("Bow");
    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }

    public void setNumberOfArrow(int numberOfArrow) {
        this.numberOfArrow = numberOfArrow;
    }

    public String toString(){
        return getName()+"\t\t"+getDamage();
    }
}
