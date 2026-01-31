package com.Conditionals.SwitchCases;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = sc.nextInt();

        System.out.println("Enter the second number");
        int b = sc.nextInt();

        System.out.println("Choose the Operator (+,-,*,/,%) : ");
        char op =  sc.next().charAt(0);

        switch (op){

            case '+':
                System.out.println("Result: " +  (a+b));
                break;

            case  '-':
                System.out.println("Result: " +  (a-b));
                break;

             case '*':
             System.out.println("Result: " +  (a*b));
             break;

             case '/':
             System.out.println("Result: " +  (a/b));
             break;

             case '%':
             System.out.println("Result: " +  (a%b));
             break;

            default:
            System.out.println("Invalid Input");


        }


    }
}
