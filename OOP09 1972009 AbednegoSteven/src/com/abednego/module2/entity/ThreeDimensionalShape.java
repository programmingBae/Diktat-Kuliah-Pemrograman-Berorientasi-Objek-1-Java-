package com.abednego.module2.entity;
/**
 * @author AbednegoSteven - 1972009
 */
public abstract class ThreeDimensionalShape extends Shape{
    public abstract double getSurfaceArea();
    public abstract double getVolume();
    @Override
    public String getDescription() {
        return "Surface Area : "+getSurfaceArea()+"\n"+"Volume : "+getVolume();
    }
}
