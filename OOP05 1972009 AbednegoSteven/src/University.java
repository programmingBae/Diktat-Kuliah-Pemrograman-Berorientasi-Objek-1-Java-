/**
 * @author AbednegoSteven - 1972009
 */
import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Employee> employees;
    public University(){
        employees = new ArrayList<>();
    }
    public List<Employee> getEmployee(){
        return this.employees;
    }
    public String getNextEmployeeId(){
        if (employees.isEmpty()){
            return "000001";
        }
        else{
            return "00000"+Integer.toString(employees.size());
        }
    }
}
