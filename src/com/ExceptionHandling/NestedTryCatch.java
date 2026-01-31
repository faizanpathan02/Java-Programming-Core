package com.ExceptionHandling;

public class NestedTryCatch {

    public static void main(String[] args) {

       try {
           System.out.println("Outer Try Started");
           int[] arr = {10, 20, 30};

           try {
               System.out.println(arr[5]);

           } catch (ArrayIndexOutOfBoundsException e) {
               System.out.println("Invalid Array index");
           }

           int result = 10 / 0;

       }catch (ArithmeticException e) {
           System.out.println("Arithmetic Exception");
       }

    }
}
