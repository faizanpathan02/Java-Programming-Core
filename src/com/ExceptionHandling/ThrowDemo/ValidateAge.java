package com.ExceptionHandling.ThrowDemo;

public class ValidateAge {

    public static void validateAge(int userage){
        System.out.println("Inside validateAge method");
        if (userage > 18){
            System.out.println("Eligible for voting");
        }else {
            throw new ArithmeticException("Invalid Age Entered");
        }
    }

}
