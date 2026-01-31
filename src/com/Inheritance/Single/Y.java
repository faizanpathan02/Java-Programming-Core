package com.Inheritance.Single;

public class Y extends X {
    int j = 20;

    public void m2(){
        System.out.println("M2 method");
    }

    public static void main(String[] args) {
        Y y = new Y();
        System.out.println(y.j);
        y.m2();

        System.out.println(y.j);
        y.m1();
    }
}
