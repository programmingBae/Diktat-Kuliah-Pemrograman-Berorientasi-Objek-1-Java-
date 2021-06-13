/**
 * @author Abednego Steven - 1972009
 */
import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String isbn, title, author, search;
        BookList bookList = new BookList();

        int pil;
        do{
            System.out.println("=======================================");
            System.out.printf("%28s","Library Aplication");
            System.out.println();
            System.out.println("=======================================");
            System.out.println("1. show all books");
            System.out.println("2. Add new book");
            System.out.println("3. search book");
            System.out.println("4. exit");
            System.out.println("============================");
            System.out.print("Choice : ");
            pil = sc.nextInt();
            if(pil == 1){
                bookList.showAllBooks();
            }
            else if(pil == 2){
                System.out.print("New ISBN : ");
                isbn = sc.next();
                sc.nextLine();
                System.out.print("New Title : ");
                title = sc.nextLine();
                System.out.print("New Author : ");
                author = sc.nextLine();
                Book book = new Book(isbn,title,author);
                bookList.addBook(book);

            }
            else if(pil == 3){
                Book [] found = new Book [1] ;
                System.out.print("search (ISBN) : ");
                search = sc.next();
                found = bookList.searchBook(search);
                if (found==null) {
                    System.out.println("Book not found");
                }
                else {
                    if(found[0]==null){
                        System.out.println("Book not found");
                    }
                    else {
                        System.out.println("Buku found");
                        System.out.print("Kode ISBN: ");
                        System.out.println(found[0].getIsbn());
                        System.out.print("Judul: ");
                        System.out.println(found[0].getTitle());
                        System.out.print("Author: ");
                        System.out.println(found[0].getAuthor());
                    }
                }

            }

        }while(pil != 4);
    }
}
