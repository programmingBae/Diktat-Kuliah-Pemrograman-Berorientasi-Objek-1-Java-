package com.abednego.module2.entity;
/**
 * @author AbednegoSteven - 1972009
 */
public class Tube extends ThreeDimensionalShape{
    private double radius;
    private double heigth;

    public Tube(){

    }

    public Tube(double radius, double heigth) {
        this.radius = radius;
        this.heigth = heigth;
    }

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

    @Override
    public double getSurfaceArea() {
        return 2*Math.PI*radius*(radius+heigth);
    }

    @Override
    public double getVolume() {
        return Math.PI*(radius*radius)*heigth;
    }
}
