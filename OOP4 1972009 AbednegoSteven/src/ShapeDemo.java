/**
 * @author AbednegoSteven - 1972009
 */
import java.util.Scanner;

public class ShapeDemo {
    public static void main(String[] args) {
        ThreeDimensionalShape cylinder = new Cylinder();
        ThreeDimensionalShape sphere = new Sphere();
        TwoDimensionalShape rectangle = new Rectangle();
        TwoDimensionalShape square = new Square();
        Scanner sc = new Scanner(System.in);
        int choice;
        double length, width, heigth, radius;
        do{
            System.out.println("=====================");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Sphere");
            System.out.println("4. Cylinder");
            System.out.println("5. Exit");
            System.out.print("Choice : ");
            choice = sc.nextInt();
            if (choice == 1){
                System.out.print("Length of side : ");
                length = sc.nextDouble();
                if (length == 0){
                    System.out.println("Length of side must have a value > 0");
                }
                else{
                    ((Square)square).setLengthOfSide(length);
                    square.ShowDetail();
                }

            }
            else if(choice == 2){
                System.out.print("Width : ");
                width = sc.nextDouble();
                System.out.print("Heigth : ");
                heigth = sc.nextDouble();
                if (width == 0 || heigth == 0){
                    System.out.println("Width or Heigth must have a value > 0");
                }
                else{
                    ((Rectangle)rectangle).setBase(width);
                    ((Rectangle)rectangle).setHeigth(heigth);
                    rectangle.ShowDetail();
                }

            }
            else if(choice == 3){
                System.out.print("Radius : ");
                radius = sc.nextDouble();
                if(radius == 0){
                    System.out.println("Radius must have a value > 0");
                }
                else{
                    ((Sphere)sphere).setRadius(radius);
                    sphere.ShowDetail();
                }

            }
            else if(choice == 4){
                System.out.print("Radius : ");
                radius = sc.nextDouble();
                System.out.print("Heigth : ");
                heigth = sc.nextDouble();
                if(radius == 0 || heigth == 0){
                    System.out.println("Radius or Heigth must have a value > 0");
                }
                else{
                    ((Cylinder)cylinder).setRadius(radius);
                    ((Cylinder)cylinder).setHeigth(heigth);
                    cylinder.ShowDetail();
                }

            }

        }while(choice != 5);
    }
}
