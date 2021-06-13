/**
 * @author AbednegoSteven - 1972009
 */
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class HRManager extends Employee{
    public void addEmployee(University university, Employee employee ){
        university.getEmployee().add(employee);
    }
    public void viewAllEmployeeUniversity(University university){
        System.out.printf("%10s %20s %n","NIK","NAME");
        if (university.getEmployee().isEmpty()){
            System.out.println("No Data");
        }else{
            university.getEmployee().forEach(Employee ->{
                if (Employee instanceof Lecturer){
                    System.out.println(((Lecturer)Employee).toString());
                }
                else if (Employee instanceof Employee){
                    System.out.println(((Employee)Employee).toString());
                }
            });
        }}
    public void viewAllLecturer(University university){
        AtomicBoolean y = new AtomicBoolean(false);
        university.getEmployee().forEach(Employee ->{
            if (Employee instanceof Lecturer){
                y.set(true);
            }
        });
        if (y.get() ==false){
            System.out.println("No Data");
        }
        else{
            university.getEmployee().forEach(Employee ->{
                if (Employee instanceof Lecturer){
                    System.out.println(((Lecturer)Employee).toString());
                }
            });
        }
    }
}
