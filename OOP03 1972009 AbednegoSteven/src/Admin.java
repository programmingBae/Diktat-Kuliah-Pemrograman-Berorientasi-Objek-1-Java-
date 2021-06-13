/**
 * @author Abednego Steven - 1972009
 */

import java.util.List;
import java.util.Scanner;

public class Admin {
    private Cinema cinema;

    public Admin(Cinema cinema) {
        this.cinema = cinema;
    }

    public void addFilm(Film film) {
        Film[] films = cinema.getFilms();
        Scanner sc = new Scanner(System.in);
        if (cinema.getNumberOfStudio() > 0) {
            System.out.print("Judul: ");
            String judul = sc.nextLine();
            System.out.print("Durasi: ");
            int dur = sc.nextInt();
            films[10 - cinema.getNumberOfStudio()] = new Film(judul, dur);
            cinema.setNumberofStudio();
        } else {
            System.out.println("Studio sudah penuh");
        }

    }

    public void viewAllFilm() {
        Film[] film = cinema.getFilms();
        if (film[0] != null) {
            for (int i = 0; i < 10; i++) {
                if (film[i] != null) {
                    System.out.println(film[i].getTitle()+film[i].getDuration());
                }
            }
        } else {
            System.out.println("No Books to Show");
        }

    }

    public void viewLongestFilm() {
        // Sudah dicari di Cinema.java
        Film [] film =cinema.getLongestFilm();
        if (film==null){
            System.out.println("Belum ada film");
        }
        else {
            System.out.println("Longest film");
            System.out.print("Title: ");
            System.out.println(film[0].getTitle());
            System.out.print("Duration: ");
            System.out.println(film[0].getDuration());
        }

    }

    public void viewShortestFilm() {
        // Sudah dicari di Cinema.java
        Film [] film =cinema.getShortestFilm();
        if (film==null){
            System.out.println("Belum ada film");
        }
        else {
            System.out.println("Longest film");
            System.out.print("Title: ");
            System.out.println(film[0].getTitle());
            System.out.print("Duration: ");
            System.out.println(film[0].getDuration());
        }
    }

}

