package com.abednego.data;

import com.abednego.exceptions.ArrayMakerException;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author AbednegoSteven - 1972009
 */
public class ArrayOfNumber {
    private Integer[] numbers ;

    public void constructArray() throws ArrayMakerException {
        try {
            if (numbers == null) {
                numbers = new Integer[0];
                System.out.println("Creating new array");
            } else if (numbers != null) {
                throw new ArrayMakerException("Array sudah dibuat/initialized");
            }
        } catch(ArrayMakerException ex){
            System.out.println("Array sudah dibuat / initalized");
        }
    }
    public void increaseArrayIndex(){
        try{
            if (numbers.length==0){
            numbers = Arrays.copyOf(numbers,numbers.length+1);
            numbers[numbers.length-1] = 0;
            System.out.println("Array berhasil ditambah");}
            else{
                numbers = Arrays.copyOf(numbers,numbers.length+1);
                System.out.println("Array berhasil ditambah");
            }
        } catch(NullPointerException ex){
            System.out.println("Array belum dibuat");
        }
    }
    public void addValueToArray(int index, Integer value){
        try {
            numbers[index] = value;
        } catch(NullPointerException ex){
            System.out.println("Array belum dibuat");
        } catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Index yang dimasukkan tidak ada pada array");
        }
    }
    public void showArray() {
        try {
            if (numbers == null) {
                throw new NullPointerException("Array belum dibuat");
            } else System.out.println("Isian Array : " + Arrays.toString(numbers));

        } catch (NullPointerException ex){
            System.out.println("Array belum dibuat");
        }

    }
}
