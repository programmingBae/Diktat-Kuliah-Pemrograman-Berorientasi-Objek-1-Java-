/**
 * @author AbednegoSteven - 1972009
 */
import java.util.Scanner;

public class WareHouseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WareHouse wareHouse = new WareHouse();
        WareHouseManager manager = new WareHouseManager(wareHouse);
        int choice;
        do{
            System.out.println("=====================");
            System.out.println("1. Add Shoe");
            System.out.println("2. Add Shirt");
            System.out.println("3. View All Item");
            System.out.println("4. Exit");
            System.out.print("Choice : ");
            choice = sc.nextInt();
            if (choice == 1){
                sc.nextLine();
                System.out.print("Brand : ");
                String brand = sc.nextLine();
                System.out.print("Name : ");
                String name = sc.nextLine();
                System.out.print("Color : ");
                String color = sc.nextLine();
                System.out.print("Size : ");
                int size = sc.nextInt();
                sc.nextLine();
                System.out.print("Price : ");
                int price = sc.nextInt();
                sc.nextLine();
                manager.addItemToWareHouse(new Shoe(brand,name,price,size,color));
            }
            else if (choice == 2){
                sc.nextLine();
                System.out.print("Brand : ");
                String brand = sc.nextLine();
                System.out.print("Name : ");
                String name = sc.nextLine();
                System.out.print("Size [XS, S, M, L, XL, XXL]: ");
                String size = sc.nextLine();
                System.out.print("Price : ");
                int price = sc.nextInt();
                sc.nextLine();
                Shirt.Size shirtSize = Shirt.Size.valueOf(size);
                switch(shirtSize) {
                    case XS:
                        manager.addItemToWareHouse(new Shirt(shirtSize, brand, name, price));
                        break;
                    case S:
                        manager.addItemToWareHouse(new Shirt(shirtSize, brand, name, price));
                        break;
                    case M:
                        manager.addItemToWareHouse(new Shirt(shirtSize, brand, name, price));
                        break;
                    case L:
                        manager.addItemToWareHouse(new Shirt(shirtSize, brand, name, price));
                        break;
                    case XL:
                        manager.addItemToWareHouse(new Shirt(shirtSize, brand, name, price));
                        break;
                    case XXL:
                        manager.addItemToWareHouse(new Shirt(shirtSize, brand, name, price));
                        break;
                }

            }
            else if (choice == 3){
                manager.viewItemInWareHouse();
            }
        }while(choice!=4);

    }
}
