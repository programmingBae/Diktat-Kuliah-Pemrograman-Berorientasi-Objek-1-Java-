import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameMap {
    public boolean endGame;
    private Monster[] graveyard;
    GameCharacter hero;
    GameCharacter monster;
    Item weapon;
    public GameMap(){
        hero = new Hero();
        hero.setMaxHealth(200);
        hero.setBaseStrength(20);
        hero.setCurrentHealth(hero.getMaxHealth());
        hero.setCurrentStrength(hero.getBaseStrength());
        graveyard = new Monster[0];
    }
    public void runGame(){
        while(!endGame ){
            double x = Math.random();
            if  (x<0.3){
                System.out.println("Engaging battle. Prepare....");
                battle((Hero)hero,(Monster) monster);
            }
            else{
                System.out.println("Day passed, no monster to find");
            }
            if (graveyard.length == 10){
                endGame = true;
                System.out.println("You win the game!");
            }
        }

    }
    private void battle(Hero hero, Monster monster){
        Scanner sc = new Scanner(System.in);
        String choice;
            System.out.println("1. Attack enemy");
            System.out.println("2. Swap weapon");
            System.out.println("3. Show inventory");
            System.out.println("4. Show status");
            System.out.print("Choice : ");
            choice = sc.next();

            if (choice.equals("1")){
                hero.attackEnemy(monster);
                monster.attackEnemy(hero);
            }
            else if(choice.equals("2")){
                hero.showAllInventory();
                System.out.print("Choose item name : ");
                String choose = sc.next();
                weapon = hero.getItemFromInventory(choose);
                if (weapon==null){
                    System.out.println("Salah nama item");
                }
                else{
                    hero.equip((Weapon) weapon);
                    System.out.println("Senjata diubah menjadi "+weapon.getName());
                }
            }
            else if(choice.equals("3")){
                hero.showAllInventory();
            }
            else if(choice.equals("4")){
                System.out.println(hero.getStatus());
                System.out.println(monster.getStatus());
            }

       if (monster.getCurrentHealth()<=0){
           graveyard = Arrays.copyOf(graveyard,graveyard.length+1);
           graveyard[graveyard.length-1] = monster;
           generateMonster();
       }
        if (hero.getCurrentHealth()<=0){
            System.out.println("Cupu, kamu kalah");
            endGame = true;
        }



    }
    public void generateMonster(){
        monster = new Monster();
        Random rand = new Random();
        int rand_int1 = rand.nextInt(10);
        if  (rand_int1<=5){
            ((Monster) monster).setFlyingUnit(true);
        }

        monster.setBaseStrength(3);
        monster.setMaxHealth(100);
        monster.setCurrentHealth(100);
        monster.setCurrentStrength(3);

    }

    public static void main(String[] args) {
        GameMap tes = new GameMap();
        tes.generateMonster();
        tes.runGame();
    }



}
