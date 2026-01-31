package com.Abstraction.Interface.Practice.PrinterProblem;

import com.Inheritance.Demo.P;

public class PrinterMachine implements Printable, Scannable{


    @Override
    public void print() {
        System.out.println("Printed");
    }

    @Override
    public void scan() {
        System.out.println("Scanned");
    }

    public static void main(String[] args) {
        /*Printable p = new PrinterMachine();
        p.print();

        Scannable s = new PrinterMachine();
        s.scan();*/

        PrinterMachine p = new PrinterMachine();
        p.print();
        p.scan();
    }
}
