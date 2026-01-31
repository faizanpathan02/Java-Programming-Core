package com.Abstraction.Interface;

public class ClassX implements InterfaceI{


    @Override
    public void m1() {
        System.out.println("Implemented m1 method");
    }

    @Override
    public void m2() {
        System.out.println("Implemented m2 method");
    }

    void m3() {
        System.out.println("m3 method of classX");
    }

    public static void main(String[] args) {

        InterfaceI i = new ClassX();
        i.m1();
        i.m2();
        System.out.println(x);
        System.out.println(y);

        System.out.println("\n-------------------------------------------------------------------");
        ClassX c = new ClassX();
        c.m1();
        c.m2();
        c.m3();
        System.out.println(InterfaceI.x);
        System.out.println(InterfaceI.y);
    }
}
