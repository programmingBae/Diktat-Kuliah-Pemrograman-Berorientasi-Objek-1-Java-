/**
 * @author AbednegoSteven - 1972009
 */
public class Student extends Person{
    protected String studentNumber;

    public Student(){

    }

    public Student(String firstName, String lastName, String studentNumber) {
        super(firstName, lastName);
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
