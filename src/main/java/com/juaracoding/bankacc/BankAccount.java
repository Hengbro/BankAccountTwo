package com.juaracoding.bankacc;

public class BankAccount {
    private final int acc_no;
    private final String name;
    private double balance;

    public BankAccount(int acc_no, String name, double initialBalance) {
        this.acc_no = acc_no;
        this.name = name;
        this.balance = initialBalance;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited");
        } else {
            System.out.println("Invalid deposit amount");
        }
        return balance;
    }

    public double withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(amount + " withdrawn");
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Invalid withdrawal amount");
        }
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public void display() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Account Holder Name: " + name);
        System.out.println("Balance: " + balance);
    }
}
