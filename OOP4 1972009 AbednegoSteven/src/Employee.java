/**
 * @author AbednegoSteven - 1972009
 */
import java.util.*;

public class Employee extends Person {
    private String id;
    private Date joinDate;

    public Employee(){

    }

    public Employee(String firstName, String lastName, String id, Date joinDate) {
        super(firstName, lastName);
        this.id = id;
        this.joinDate = joinDate;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getJoinDate(){
        return joinDate;
    }

    public void setJoinDate(Date joinDate){
        this.joinDate = joinDate;
    }
}


