package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Account account = new Account(1,"Petr");

        System.out.println(account);
        account.putDeposit(-5);
        System.out.println(account);
        account.takeMoney(20);


    }


}