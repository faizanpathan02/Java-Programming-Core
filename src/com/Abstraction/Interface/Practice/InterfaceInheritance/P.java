package com.Abstraction.Interface.Practice.InterfaceInheritance;

public class P implements I3{

    @Override
    public void m3() {
        System.out.println("Implemented m1 method");
    }

    @Override
    public void m2() {
        System.out.println("Implemented m2 method");
    }

    @Override
    public void m1() {
        System.out.println("Implemented m3 method");
    }

    public void m4(){
        System.out.println("Implemented m4 method");
    }


    public static void main(String[] args) {
        System.out.println("----------------I1-----------------");
        I1 i1 = new P();
        i1.m1();
        System.out.println(I1.x);
        System.out.println("----------------I2-----------------");
        I2 i2 = new P();
        i2.m2();
        i2.m1();
        System.out.println(I2.x);
        System.out.println(I2.y);
        System.out.println("-----------------I3-----------------");
        I3 i3 = new P();
        i3.m3();
        i3.m2();
        i3.m1();
        System.out.println(I3.x);
        System.out.println(I3.y);
        System.out.println(I3.z);
        System.out.println("----------------------Class P---------------------");
        P p = new P();
        p.m1();
        p.m2();
        p.m3();
        p.m4();
        System.out.println(p.x);
        System.out.println(p.y);
        System.out.println(p.z);

    }
}
