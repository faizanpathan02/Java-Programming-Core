package com.Inheritance.Multilevel;

public class C extends B{
    int k = 30;
    public void f3() {
        System.out.println("f3 method");
    }

    public static void main(String[] args) {

        C c = new C();
        System.out.println(c.k);
        c.f3();
        System.out.println(" ");


        System.out.println(c.i);
        System.out.println(c.j);
        System.out.println(" ");

        c.f1();
        c.f2();
    }
}
