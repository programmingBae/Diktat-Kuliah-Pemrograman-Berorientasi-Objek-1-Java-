/**
 * @author AbednegoSteven - 1972009
 */
import java.text.DecimalFormat;

public class Rectangle extends TwoDimensionalShape {
    @Override
    public double getArea() {
        return getBase() * getHeigth();
    }

    @Override
    public double getCircumference() {
        return getBase() * 2 + getHeigth() * 2;
    }

    private double base;
    private double heigth;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public String toString(){
        DecimalFormat formatter = new DecimalFormat("##.00");
        double area = getArea();
        String stringArea = formatter.format(area);
        double circumference =getCircumference();
        String stringCircumference = formatter.format(circumference);
        return "Area of Rectangle is  : "+ stringArea + "\r\n" + "Circumference of Rectangle is : "+stringCircumference;
    }
}
