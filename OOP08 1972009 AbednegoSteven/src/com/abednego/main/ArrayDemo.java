package com.abednego.main;
/**
 * @author AbednegoSteven - 1972009
 */

import com.abednego.data.ArrayOfNumber;
import com.abednego.exceptions.ArrayMakerException;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) throws ArrayMakerException {
        Scanner scanner = new Scanner (System.in);
        String choice = "";
        ArrayOfNumber arrays = new ArrayOfNumber();
        do {
            System.out.println("================");
            System.out.println("1. Make Array");
            System.out.println("2. Add length to array");
            System.out.println("3. Insert new data to array");
            System.out.println("4. Show array");
            System.out.println("0. Exit");
            System.out.print("Choice : ");
            choice = scanner.next();
                if (choice.equals("1")) {
                    arrays.constructArray();
                } else if (choice.equals("2")) {
                    arrays.increaseArrayIndex();
                } else if (choice.equals("3")) {
                    try {
                        System.out.print("Index : ");
                        int index = scanner.nextInt();
                        System.out.print("Number : ");
                        int number = scanner.nextInt();
                        arrays.addValueToArray(index, number);
                    }
                    catch (InputMismatchException ex) {
                        System.out.println("Input harus bilangan");
                        scanner.next();
                    }
                } else if (choice.equals("4")) {
                    arrays.showArray();
                }
        } while(!choice.equals("0"));
    }
}
