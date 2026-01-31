package com.MethodOverriding.Demo;

public class TestClass {

    public static void main(String[] args) {

        System.out.println("--------------Mixed object of A and B class-------------");
        System.out.println(" ");
        A a = new B();
        a.m1();
        a.m2();
        a.m3();
        System.out.println(" ");
        System.out.println("-----------------Mixed object of B and C class-------------");
        System.out.println(" ");

        B b = new C();
        b.m1();
        b.m2();
        b.m3();
        System.out.println("\n-----------------Mixed object of A and C class-------------");
        System.out.println(" ");
        A a1 = new C();
        a1.m1();
        a1.m2();
        a1.m3();

        System.out.println("\n-----------------object of C class-------------");
        System.out.println(" ");

        C c = new C();
        c.m1();
        c.m2();
        c.m3();
        c.m5();
        c.m6();




    }
}
