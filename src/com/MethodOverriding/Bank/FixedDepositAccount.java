package com.MethodOverriding.Bank;

public class FixedDepositAccount extends Account {

    @Override
    public double getInterestRate() {
        return 6.5;
    }
}
