package com.Abstraction.AbstractClass.InterviewScenarios.Problem1;

public class C extends B{
    void m1(B b){
        System.out.println("two");
        super.m1(new B());
    }

    public static void main(String[] args) {
        C c=new C();
        c.m1(new B());
        B b =new B();

    }
}
