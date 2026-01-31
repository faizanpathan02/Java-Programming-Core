package com.Inheritance.Hierarchical.Bank;

public class SavingsAccount extends BankAccount {

    @Override
    void accounType() {
        System.out.println("This is a Savings Account");
    }

    void addInterest() {
        System.out.println("Interest added to Savings Account");
    }

}
