/*
Abednego Steven - 1972009
 */
import java.util.Scanner;
public class NumberConverterDemo {
    public static void main(String[] args) {
        NumberConverter numberConverter = new NumberConverter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("Number Converter");
        System.out.println("====================");
        System.out.println("1. Decimal to Binary");
        System.out.println("2. Decimal to Octal");
        System.out.println("3. Decimal to Hex");
        System.out.println("4. Exit");
        int pilihan = -1;
        int bilangan = -1;
        while(pilihan != 4){
            System.out.print("Choice : ");
            pilihan = scanner.nextInt();
            if (pilihan == 1){
                System.out.print("Number to convert : ");
                bilangan = scanner.nextInt();
                System.out.println("Converted number is "+numberConverter.convertToBinary(bilangan));
            }
            else if(pilihan == 2){
                System.out.print("Number to convert : ");
                bilangan = scanner.nextInt();
                System.out.println("Converted number is "+numberConverter.convertToOctal(bilangan));
            }
            else if(pilihan == 3){
                System.out.print("Number to convert : ");
                bilangan = scanner.nextInt();
                System.out.println("Converted number is "+numberConverter.convertToHex(bilangan));
            }

        }

    }
}
