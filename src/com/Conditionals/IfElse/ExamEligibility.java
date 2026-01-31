package com.Conditionals.IfElse;

public class ExamEligibility {
    public static void main(String[] args) {
        int attendance = 70;
        boolean feesPaid = true;

        if (attendance < 75 || !feesPaid) {
            System.out.println("Not Eligible for Exam");
        } else {
            System.out.println("Eligible for Exam");
        }
    }
}
