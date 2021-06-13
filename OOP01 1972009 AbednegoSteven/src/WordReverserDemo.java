/*
Abednego Steven - 1972009
 */
import java.util.Scanner;

public class WordReverserDemo {
    public static void main(String[] args) {
        WordReverser reverse = new WordReverser();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input kalimat (0 untuk keluar) : ");
        String kalimat = scanner.nextLine();
        while(!kalimat.equals("0")){
            System.out.println(reverse.reverseWord(kalimat));
            System.out.print("Input kalimat (0 untuk keluar) : ");
            kalimat = scanner.nextLine();
        }
        scanner.close();
    }
}
