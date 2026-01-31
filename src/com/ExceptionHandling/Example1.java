package com.ExceptionHandling;

public class Example1 {

    public static void main(String[] args) {

        System.out.println("This statement will be executed");
        try {
            System.out.println("----------try start------------");
            Integer i = Integer.valueOf("abc");
            System.out.println("Value of i : " + i);
            System.out.println("----------try end------------");
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("This statement will be executed");


    }
}
