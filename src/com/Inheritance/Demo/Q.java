package com.Inheritance.Demo;

public class Q extends P{
    int j = 2;
    public void m2(){
        System.out.println("m2 method");
    }

    public static void main(String[] args) {
        Q q = new Q();
        System.out.println(q.j);
        q.m2();

        System.out.println(q.i);
        q.m1();

        R r = new R();

        System.out.println(r.k);
        r.m3();

        System.out.println(r.i);
        r.m1();
    }
}
