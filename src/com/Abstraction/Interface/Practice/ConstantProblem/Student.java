package com.Abstraction.Interface.Practice.ConstantProblem;

public class Student implements Exam{

    void result(int marks){
        if (marks >= PASS_MARKS){
            System.out.println("You are pass!");
        }else {
            System.out.println("You are fail");
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.result(40);

    }
}
