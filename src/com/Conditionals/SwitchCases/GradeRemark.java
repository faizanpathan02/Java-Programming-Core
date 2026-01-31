package com.Conditionals.SwitchCases;

import java.util.Scanner;

public class GradeRemark {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Grade (A/B/C/D/F) : ");
        char grade = sc.next().charAt(0);

        switch (grade){

            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Very Good");
                break;

            case 'C':
                System.out.println("Good");

            case 'D':
                System.out.println("Pass");
                break;

            case 'F':
                System.out.println("Fail");
                break;

            default:
                System.out.println("Invalid Grade");

        }
    }
}
