/**
 * @author Abednego Steven - 1972009
 */
import java.util.Scanner;

public class CinemaDemo {
    public static void main(String[] args) {
        Film film = new Film();
        Scanner sc = new Scanner(System.in);
        Admin admin=new Admin(new Cinema());
        int pilihan = -1;
        do
        {
            System.out.println("========================");
            System.out.println("1. Add new film");
            System.out.println("2. View all film");
            System.out.println("3. Show longest film");
            System.out.println("4. Show shortest film");
            System.out.println("5. Exit");
            System.out.print("Choice : ");
            pilihan = sc.nextInt();
            if (pilihan == 1){
                admin.addFilm(film);
            }
            else if (pilihan == 2){
                admin.viewAllFilm();
            }
            else if (pilihan == 3){
                admin.viewLongestFilm();
            }
            else if (pilihan == 4){
                admin.viewShortestFilm();
            }
            else{
                if (pilihan != 5){
                System.out.println("Wrong menu");}
            }

        }while(pilihan != 5);
    }
}
