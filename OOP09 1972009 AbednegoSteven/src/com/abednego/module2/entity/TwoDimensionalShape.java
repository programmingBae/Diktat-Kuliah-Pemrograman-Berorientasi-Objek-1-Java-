package com.abednego.module2.entity;
/**
 * @author AbednegoSteven - 1972009
 */
public abstract class TwoDimensionalShape extends Shape {
    public abstract double getArea();
    public abstract double getCircumference();

    @Override
    public String getDescription() {
        return "Area : "+getArea()+ "\n"+"Circumference : "+getCircumference();
    }
}
