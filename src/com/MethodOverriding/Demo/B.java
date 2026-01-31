package com.MethodOverriding.Demo;

public class B extends A {

    @Override
    public void m1() {
        System.out.println("Overrided M1 method of B class");
    }

    @Override
    public void m2() {
        System.out.println("Overrided M2 method of B class");
    }

    public void m3(){
        System.out.println("M3 method of B class");
    }

    public void m4(){
        System.out.println("M4 method of B class");
    }
}
