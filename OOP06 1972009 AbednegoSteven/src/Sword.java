public class Sword extends Item implements Weapon {
    public Sword(){
        setName("Sword");
    }

    @Override
    public void attack(GameCharacter attacker, GameCharacter enemy) {
        if (((Monster) enemy).isFlyingUnit()){
            System.out.println("Enemy out of range");
        }
        else{
            int damage = attacker.getCurrentStrength()*5/100*3*getDamage();
            enemy.setCurrentHealth(enemy.getCurrentHealth() - damage );
            System.out.println("Hero do "+damage+" to Hero");
            }
    }

    @Override
    public int getDamage() {
        return 9;
    }

    public String toString(){
       return getName()+"\t\t"+getDamage();
    }
}
