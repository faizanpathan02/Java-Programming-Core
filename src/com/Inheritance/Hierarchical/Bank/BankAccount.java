package com.Inheritance.Hierarchical.Bank;

public class BankAccount {
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Balance: " + balance);
    }

     void accounType(){
        System.out.println("This is a Bank Account");
    }
}
