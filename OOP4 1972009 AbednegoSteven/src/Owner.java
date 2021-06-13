/**
 * @author AbednegoSteven - 1972009
 */

import java.util.ArrayList;

public class Owner extends Person {
    private Company company;

    public Owner(Company company){
        this.company = company;
    }

    public Owner() {

    }

    public void addEmployee(Employee employee) {
        employee.setId(company.getNextEmployeeId());
        company.getEmployees().add(employee);
    }
    public void viewAllEmployee(){
        ArrayList<Employee> employees = company.getEmployees();
        for (int i = 0; i < 10; i++) {
            if (employees.size() != 0) {
                System.out.println(employees.get(0).getFirstName());
            }
        }
    }
}

