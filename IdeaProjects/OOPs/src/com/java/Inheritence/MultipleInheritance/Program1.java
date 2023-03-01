package com.java.Inheritence.MultipleInheritance;
// Multiple Inheritance :: If a Single Class is Extended by more than one Parent class at a Time ,
// then it is said to be known as Multiple Inheritance.
// Multiple inheritance is not supported in java class , since it has to implement the methods which can me similar.
// but
// Multiple Inheritance will support in the Java Interface, because they will jsut dec the methods but not implement it.

// Below is Java Class Multiple Inheritance , uncomment the below code and see the message.
public class Program1 {
    public void message(){
        System.out.println(" Program 1, message() method. ");
    }
}
class Program2{
    public void message(){
        System.out.println(" Program 2, message() method. ");
    }
//}
//class Test extends Program1,Program2{
    public static void main(){

    }
}
