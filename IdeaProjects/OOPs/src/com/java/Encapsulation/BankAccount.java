package com.java.Encapsulation;

// Encapsulation :: its Grouping the Data Members and its Corresponding Methods into one Single Unit
// >> Encapsulation :: Data Hiding + Abstraction.
// >> Hiding the Data implementation inside the Method is also called as Encapsulation.

import java.util.Scanner;

public class BankAccount {
    private double balance = 0;
    int bank_id;
    String phoneNumber;
    String userName;

    public void setBalance(double balance,int id, String phNumber, String name) {
        this.balance = balance;
        this.userName = name;
        this.bank_id = id;
        this.phoneNumber = phNumber;
    }

    public double getBalance() {
        userName = "Harsha";
        phoneNumber = "9440183118";

        bank_id = 1011;


        Scanner scan = new Scanner(System.in);
        String userNameInput;
        String userPhone;
        int userBankId;
        balance = 34555555;

        System.out.println("                            Dot Bank                                  ");
        System.out.println(" ");
        System.out.println(" :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println(" ");
        System.out.println(" Enter User Name :: ");
        userNameInput = scan.next();
        System.out.println(" Enter Phone Number :: ");
        userPhone = scan.next();
        System.out.println(" Enter Bank ID :: ");
        userBankId = scan.nextInt();


        if (userName.equals(userNameInput) && userPhone.equals(phoneNumber) && userBankId == bank_id){
            System.out.println(" User Name : " + userNameInput);
            System.out.println(" Bank Id : " + userBankId);
            System.out.println(" Phone Number : " + userPhone);
            System.out.println(" Your Bank Balance is :: " + balance);
        }else if(!userName.equals(userNameInput) && !userPhone.equals(phoneNumber) && userBankId != bank_id){
            System.out.println(" User Name : " + userNameInput);
            System.out.println(" Bank Id : " + userBankId);
            System.out.println(" Phone Number : " + userPhone);
            System.out.println(" ");
            System.out.println(" Sorry, Your account Not Found. Please Try again or contact customer service. ");
            System.out.println(" Thank You. ");

        }
        return balance;

    }
}
class TestBankAccount extends BankAccount{
    public static void main(String[] args) {
          BankAccount bankAccount = new BankAccount();
//        bankAccount.setBalance(bankAccount.getBalance(), bankAccount.bank_id, bankAccount.phoneNumber, bankAccount.userName);
        bankAccount.getBalance();
    }
}