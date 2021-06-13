/**
 * @author AbednegoSteven - 1972009
 */
import java.text.DecimalFormat;


public class Sphere extends ThreeDimensionalShape{

    @Override
    public double getVolume() {
        double tes = ((4)*(Math.PI)*(getRadius()*getRadius()*getRadius()))/3;
        return tes;
    }

    @Override
    public double getSurface() {
        return (4*Math.PI)*getRadius()*getRadius();
    }

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString(){
        DecimalFormat formatter = new DecimalFormat("##.00");
        double volume = getVolume();
        String stringVolume = formatter.format(volume);
        double surface =getSurface();
        String stringSurface = formatter.format(surface);
        return "Volume of Sphere : "+stringVolume+"\r\n"+"Surface area of Sphere is : "+stringSurface;
    }
}
