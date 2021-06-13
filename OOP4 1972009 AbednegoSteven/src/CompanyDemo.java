/**
 * @author AbednegoSteven - 1972009
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CompanyDemo {
    public static void main(String[] args)throws Exception {
        Owner owner = new Owner();
        Scanner sc = new Scanner(System.in);
        System.out.print("Owner first name : ");
        String firstName = sc.next();
        System.out.print("Owner last name : ");
        String lastName = sc.next();
        owner.setFirstName(firstName);
        owner.setLastName(lastName);
        System.out.println("Welcome, "+owner.getFullName());
        int choice;
        do{
            System.out.println("=========================");
            System.out.println("1. Add new employee");
            System.out.println("2. View all employee");
            System.out.println("3. Exit");
            System.out.print("Choice : ");
            choice = sc.nextInt();
            if (choice==1){
                System.out.print("Employee first name : ");
                firstName = sc.next();
                System.out.print("Employee last name : ");
                lastName = sc.next();
                System.out.print("Join date (yyyy-mm-dd): ");
                String joinDate = sc.next();
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(joinDate);
                Employee employee = new Employee(firstName,lastName,"2",date);
                owner.addEmployee(employee);
            }
            else if(choice==2){
                owner.viewAllEmployee();
            }
        }while(choice!=3);
    }
}
