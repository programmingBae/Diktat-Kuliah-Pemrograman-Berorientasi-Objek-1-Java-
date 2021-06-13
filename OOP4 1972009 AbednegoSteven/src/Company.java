/**
 * @author AbednegoSteven - 1972009
 */
import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employees;

    public Company(){
        this.employees = new ArrayList<>();

    }
    public ArrayList<Employee> getEmployees(){
        return this.employees;
    }
    public String getNextEmployeeId(){
        return "E-0000001";
    }
}


