import java.util.ArrayList;
import java.util.List;

public class Hero extends GameCharacter{
    private String name;
    private ArrayList<Item> inventory;
    private Weapon mainweapon;
    public Hero(){
        this.inventory =new ArrayList<>(2);
        this.inventory.add(0,new Sword());
        this.inventory.add(1,new Bow());
        mainweapon = (Weapon) this.inventory.get(0);
        setMaxHealth(200);
        setBaseStrength(20);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void equip(Weapon weapon){
        mainweapon = weapon;
        this.setCurrentStrength(getBaseStrength()+ mainweapon.getDamage());
    }
    public void showAllInventory(){
        this.inventory.forEach(Item ->{
            if (Item instanceof Sword){
                System.out.println(((Sword)Item).toString());
            }
            else if (Item instanceof Bow){
                System.out.println(((Bow)Item).toString());
            }
        });
    }
    public Item getItemFromInventory(String itemName){
        Item temp = null;
        for(int i = 0; i<inventory.size();i++){
            if(inventory.get(i).getName().equals(itemName)){
                temp = inventory.get(i);
            }

        }
        return temp;
    }

    public void attackEnemy(GameCharacter enemy) {
        mainweapon.attack(Hero.this,enemy);
    }
}
