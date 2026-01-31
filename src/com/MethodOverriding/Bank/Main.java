package com.MethodOverriding.Bank;
import com.Inheritance.Hierarchical.Bank.SavingsAccount;
public class Main extends Account{
    static {
        System.out.println("-----------------Account Deatails-----------------");
    }
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println("\nInterest rate for Savings account :" + account.getInterestRate());

        account =  new SavingAccount();
        System.out.println("\nInterest rate for Savings account :" + account.getInterestRate());

        account = new FixedDepositAccount();
        System.out.println("\nInterest rate for FixedDeposit account :" + account.getInterestRate());
    }
}
