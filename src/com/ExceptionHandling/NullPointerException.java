package com.ExceptionHandling;

public class NullPointerException {

    public static void main(String[] args) {

        try {
//            String s = null;
//            System.out.println(s.length());
            String s1 = args[1];
            System.out.println(s1);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Main method Called");
    }
}
