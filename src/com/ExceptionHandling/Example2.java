package com.ExceptionHandling;

public class Example2 {
    public static void main(String[] args) {

        try {
            System.out.println(args[1]);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("hello");


    }
}
