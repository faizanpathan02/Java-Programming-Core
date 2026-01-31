package com.Inheritance.Hierarchical.Bank;

public class CurrentAccount extends BankAccount {
    void overdraft() {
        System.out.println("Overdraft facility used");
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.deposit(1000);
        sa.addInterest();
        sa.accounType();

        SalaryAccount sal = new SalaryAccount();
        sal.deposit(2000);
        sal.salaryCredit();

        CurrentAccount ca = new CurrentAccount();
        ca.deposit(500);
        ca.overdraft();


    }
}


