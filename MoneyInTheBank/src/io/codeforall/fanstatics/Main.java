package io.codeforall.fanstatics;

public class Main {
    public static void main(String[] args) {

        Bank bank1 = new Bank(0);
        Person firstClient = new Person("Luis Ramos", bank1);

        firstClient.personAddMoney(1000);
        firstClient.personAddMoney(0);
        System.out.println(firstClient.getName() + " your current balance is: " + bank1.getAccountBalance());

        firstClient.personWithdrawMoney(0);
        System.out.println(firstClient.getName() + " your current balance is: " + bank1.getAccountBalance());
    }

}
