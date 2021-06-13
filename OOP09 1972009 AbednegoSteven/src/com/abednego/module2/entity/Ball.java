package com.abednego.module2.entity;
/**
 * @author AbednegoSteven - 1972009
 */
public class Ball extends ThreeDimensionalShape{
    private double radius;

    public Ball(){

    }

    public Ball(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurfaceArea() {
        return 4*Math.PI*radius*radius;
    }

    @Override
    public double getVolume() {
        return (Math.PI)*(radius*radius*radius)*4/3;
    }
}
