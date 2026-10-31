package _2program.entites;

import _2program.exceptions.InsuficientBalanceException;
import _2program.exceptions.NoWithdrawLimitException;
import _2program.exceptions.WithdrawValueIsInvalid;

public class Account {
    private int accountNumber;
    private String accountHolder;
    private double accountBalance;
    private double accountWithdrawLimit;

    public Account(int accountNumber, String accountHolder, double accountBalance, double accountwithDraw) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
        this.accountWithdrawLimit = accountwithDraw;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountWithdrawLimit() {
        return accountWithdrawLimit;
    }

    public void setAccountWithdrawLimit(double accountWithdrawLimit) {
        this.accountWithdrawLimit = accountWithdrawLimit;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountBalance=" + accountBalance +
                ", accountwithDrawLimit=" + accountWithdrawLimit +
                '}';
    }

    //deposit deposito
    public void deposit(double amount) {
        setAccountBalance(getAccountBalance() + amount);
    }

    //withdraw saque
    public void withdraw(double value) {
        if (value <= 0) {
            throw new WithdrawValueIsInvalid("Withdraw error: value is invalid");
        }
        if (value > accountBalance) {
            throw new InsuficientBalanceException("Withdraw error: Not enoughbalance");
        }

        if (accountWithdrawLimit < value) {
            throw new NoWithdrawLimitException("Withdraw error: The amount exceeds withdraw limit");
        } else {
            accountBalance -= value;

        }

    }
}
