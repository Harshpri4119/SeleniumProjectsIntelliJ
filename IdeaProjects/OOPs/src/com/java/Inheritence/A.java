package com.java.Inheritence;

// inheritance :: Its is also said to be known as IN A RELATION.
// Main Used of Inheritance is Code Re-usability.
// the Extends is the Key word used to implement Inheritance.

// Def:: Whatever variables or methods present in the parent class is also available for the child class.
// but child class variables or methods are not available for the parent class.

public class A {
    public void m1(){
        System.out.println(" Class A , M1 Method");
    }
}

class B extends A{
    public void m2(){
        System.out.println(" Class B, M2 Method. ");
    }
}
