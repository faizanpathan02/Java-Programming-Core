package com.Abstraction.Interface.Practice.BankProblem;

public class SBI implements Bank {

    @Override
    public void deposit() {
        System.out.println("Amount Deposited");
    }

    @Override
    public void withdraw() {
        System.out.println("Amount Withdrawn");
    }

    public static void main(String[] args) {
        Bank b1 = new SBI();
        b1.deposit();
        b1.withdraw();
    }
}
