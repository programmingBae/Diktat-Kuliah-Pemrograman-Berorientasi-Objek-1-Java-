/**
 * @author Abednego Steven - 1972009
 */


import java.util.Scanner;
import java.lang.Math;

public class TimeConverterDemo {
    public static void main(String[] args) {
        TimeConverter time = new TimeConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================");
        System.out.println("TIME CONVERTER APP");
        System.out.println("====================");
        int detik;
        do {
            System.out.print("Input time (second, 0 to exit) : ");
            detik = scanner.nextInt();
            time.setSecond(Math.abs(detik));
            if (detik!=0) {
                System.out.println("Converted time : " + time.showTime());
            }
        }while(detik!=0);

    }
}
