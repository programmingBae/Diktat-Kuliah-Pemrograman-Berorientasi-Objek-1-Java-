/**
 * @author AbednegoSteven - 1972009
 */
public class Employee extends Person {
    protected String nik;
    public Employee(){

    }

    public Employee(String firstName, String lastName, String nik) {
        super(firstName, lastName);
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
    public String toString(){
        String fs;
        fs = String.format("%10s %20s",getNik(),getFullName());
        return fs;
    }
}
