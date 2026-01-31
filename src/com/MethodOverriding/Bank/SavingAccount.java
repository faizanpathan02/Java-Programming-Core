package com.MethodOverriding.Bank;

public class SavingAccount extends Account{

    @Override
    public double getInterestRate() {
        return 4.5;
    }
}
