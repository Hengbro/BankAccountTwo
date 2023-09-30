package com.juaracoding.bankacc;

public class MasterBankAccount {
    public static void masterBankAccount(String[] args){
        BankAccount account = new BankAccount(12345, "John Doe", 1000.0);

        account.display();

        account.deposit(500.0);
        account.display();

        account.withdraw(200.0);
        account.display();
    }
}
