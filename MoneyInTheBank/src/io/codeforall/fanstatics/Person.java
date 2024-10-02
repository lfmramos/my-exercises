package io.codeforall.fanstatics;

public class Person {

    private String name;
    private Bank personBank;
    public Person(String name, Bank personBank){
        this.personBank = personBank;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // Define methods to interact with the bank:

    // Adding money to account
    public void personAddMoney(int value){
        personBank.add(value);
    }

    // Withdrawing money from the bank
    public void personWithdrawMoney(int value){
        personBank.withdraw(value);
    }
}