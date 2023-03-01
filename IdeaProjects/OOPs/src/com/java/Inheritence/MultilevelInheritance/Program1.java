package com.java.Inheritence.MultilevelInheritance;

// MultiLevel Inheritance :: When there is a Chain of Inheritance Then its Known as Multilevel Inheritance.
// Eg :: Class A -> Class B -> Class C.
// Its Supported By Java.

public class Program1 {
    void m1(){
        System.out.println(" Program1 Class, m1() method. ");
    }
}
class Program2 extends Program1{
    void m2(){
        System.out.println(" Program2 Class, m2() method. ");
    }
}
class Program3 extends Program2{
    public static void main(String[] args){
        Program3 program3 = new Program3();
        program3.m1();
        program3.m2();
    }
}
