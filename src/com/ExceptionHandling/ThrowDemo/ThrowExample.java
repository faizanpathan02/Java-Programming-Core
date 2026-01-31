package com.ExceptionHandling.ThrowDemo;

import java.util.Scanner;

public class ThrowExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age : ");
        int age = sc.nextInt();

        try{
            ValidateAge.validateAge(age);
        }catch (Exception e){
            System.out.println(e);
        }



    }
}
