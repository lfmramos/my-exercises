package io.codeforall.fanstatics;

public class Bank {

    private String clientName;
    private int accountBalance;

    public Bank(int accountBalance){
        this.accountBalance = accountBalance;
    }
    public int getAccountBalance(){
        return this.accountBalance;
    }
    // Method for saving money in the bank
    public int add(int value) {
        if (value > 0) {
            this.accountBalance = accountBalance + value;
            return accountBalance;
        }
            System.out.println("Invalid operation. Try again.");
        return 0;
    }

    // Method for withdrawing money from the bank
    public int withdraw(int value) {
        if (value > 0) {
            this.accountBalance = accountBalance - value;
            return accountBalance;
        }
            System.out.println("Invalid operation. Try again.");
        return 0;
    }
}