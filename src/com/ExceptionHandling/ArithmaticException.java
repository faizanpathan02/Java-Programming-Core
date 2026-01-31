package com.ExceptionHandling;

public class ArithmaticException {

    public static void main(String[] args) {

        try {
            int i = 50/0;
            System.out.println(i);
        }catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Main method called");
    }
}
