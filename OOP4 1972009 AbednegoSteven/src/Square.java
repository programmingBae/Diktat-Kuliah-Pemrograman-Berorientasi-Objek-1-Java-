/**
 * @author AbednegoSteven - 1972009
 */
import java.text.DecimalFormat;

public class Square extends TwoDimensionalShape {
    private double lengthOfSide;

    public double getLengthOfSide() {
        return lengthOfSide;
    }

    public void setLengthOfSide(double lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    public double getArea() {
        return lengthOfSide*lengthOfSide;
    }

    @Override
    public double getCircumference() {
        return lengthOfSide*4;
    }

    public String toString(){
        DecimalFormat formatter = new DecimalFormat("##.00");
        double area = getArea();
        String stringArea = formatter.format(area);
        double circumference =getCircumference();
        String stringCircumference = formatter.format(circumference);
        return "Area of Square is  : "+ stringArea + "\r\n" + "Circumference of Square is : "+stringCircumference;
    }
}
