/**
 * @author AbednegoSteven - 1972009
 */
public class Lecturer extends Employee{
    protected String nidn;

    public Lecturer(){

    }

    public Lecturer(String firstName, String lastName, String nik, String nidn) {
        super(firstName, lastName, nik);
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String toString(){
        String fs;
        fs = String.format("%10s %10s %20s",getNik(),getNidn(),getFullName());
        return fs;
    }
}
