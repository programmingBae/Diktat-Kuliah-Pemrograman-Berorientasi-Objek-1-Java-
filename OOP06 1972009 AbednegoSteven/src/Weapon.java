public interface Weapon {
    void attack(GameCharacter attacker, GameCharacter enemy);
    int getDamage();
}
