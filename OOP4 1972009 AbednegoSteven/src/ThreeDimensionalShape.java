/**
 * @author AbednegoSteven - 1972009
 */
public abstract class ThreeDimensionalShape extends Shape {
    public abstract double getVolume();
    public abstract double getSurface();

    @Override
    public void ShowDetail() {
        System.out.println(toString());
    }
}
