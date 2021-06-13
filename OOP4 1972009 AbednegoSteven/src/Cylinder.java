/**
 * @author AbednegoSteven - 1972009
 */

import java.text.DecimalFormat;

public class Cylinder extends ThreeDimensionalShape {

    @Override
    public double getVolume() {
        return Math.PI*radius*radius*heigth;
    }

    @Override
    public double getSurface() {
        return 2*Math.PI*radius*(heigth+radius);
    }

    private double radius;
    private double heigth;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public String toString(){
        DecimalFormat formatter = new DecimalFormat("##.00");
        double volume = getVolume();
        String stringVolume = formatter.format(volume);
        double surface =getSurface();
        String stringSurface = formatter.format(surface);
        return "Volume of Cylinder : "+stringVolume+"\r\n"+"Surface area of Cylinder is : "+stringSurface;
    }


}
