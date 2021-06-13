/**
 * @author Abednego Steven - 1972009
 */
import java.util.Arrays;

public class BookList {
    private Book[] books;

    public BookList(){
    }

    public void addBook(Book book){
        if (books == null){
            books = new Book[0];
        }
        books = Arrays.copyOf(books,books.length+1);
        books[books.length-1] = new Book(book.getIsbn(),book.getTitle(),book.getAuthor());
    }

    public Book[] searchBook(String isbn){
        Book [] coba = new Book[1];
        if (books==null){
            return null;
        }
        for (int i=0;i<books.length;i++) {
            if (isbn.equals(books[i].getIsbn())){
                coba[0]=books[i];
            }
        }
        return coba;
    }

    public void showAllBooks(){
        if (books != null){
            System.out.printf("%-30s %30s %30s","|ISBN",  "|Title", "|Author");
            System.out.println();
            for(int i = 0; i< books.length;i++){
                System.out.printf("%30s","|"+books[i].getIsbn()+"|"+books[i].getTitle()+ "|"+books[i].getAuthor());
                System.out.println();

            }

        }
        else{
            System.out.println("No Books to Show");
        }

        }
    }

