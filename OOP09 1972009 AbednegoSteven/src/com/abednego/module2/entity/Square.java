package com.abednego.module2.entity;
/**
 * @author AbednegoSteven - 1972009
 */
public class Square extends TwoDimensionalShape {
    private double width;
    private double heigth;

    public Square(){

    }

    public Square(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public double getArea() {
        return width*heigth;
    }

    @Override
    public double getCircumference() {
        return 2*(width+heigth);
    }
}
