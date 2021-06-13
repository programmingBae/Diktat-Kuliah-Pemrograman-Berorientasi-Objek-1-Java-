/**
 * @author AbednegoSteven - 1972009
 */
public abstract class TwoDimensionalShape extends Shape {
    public abstract double getArea();
    public abstract double getCircumference();


    @Override
    public void ShowDetail() {
        System.out.println(toString());
    }
}
