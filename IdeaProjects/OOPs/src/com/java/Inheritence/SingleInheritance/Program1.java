package com.java.Inheritence.SingleInheritance;

// Single Inheritance :: A single child class which extends single parent class is known as Single Inheritance.
// Below Single Child Class Program 2 is Extended by Parent Class Program 1.
public class Program1 {
    public void name(){
        System.out.println(" Parent Class 'Program1 ', name() method called. ");
    }
}
class Program2 extends Program1{
    public static void main(String[] args){
        Program2 program2 = new Program2();
        program2.name();
    }
}
