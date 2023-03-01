package com.java.OopsJava;

import java.util.ArrayList;
import java.util.Scanner;

// Data Hiding :: Hiding the Data from the Outside Person from accessing it.
// >> Private Modifier Should be Used while Declaring the Variable

public class Account extends AccountMain{
    private double balance = 0;    // Private is Used for the Variable.

    public double getBalance(){    // public method is used for the Validation of the Account username and Password.

        userNames = new ArrayList<>();
        userNames.add(0,"Harsha");

        userPassword = new ArrayList<>();

        userPassword.add("000");
        balance += 300000000;

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter Your UserName :: ");
        String userInputName = scan.next();
        System.out.println(" Enter Your Password :: ");
        String userInputPassword = scan.next();

        for (String s  : userNames ) {
            for (String p : userPassword){
                if (s.equals(userInputName)){
                    break;
                }else{
                    break;
                }
            }
        }
        for (String p : userPassword){
            if (p.equals(userInputPassword)){
                System.out.println( userInputName + " Your Account Balance is :: " + balance);
                break;
            }else{
                System.out.println(userInputName + " Sorry ! Invalid UserName and Password. ");
                break;
            }
        }
        return balance;
    }
}
class AccountMain{
    public static ArrayList<String> userNames;
    public static ArrayList<String> userPassword;

    public static void main(String[] args) {

        Account a = new Account();
        a.getBalance();
    }
}
