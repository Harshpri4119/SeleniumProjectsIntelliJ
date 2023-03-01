package com.java.Inheritence;

public class TestClassAandB {
    public static void main(String[] args){

        // Parent class Ref and Obj calling only m1() method , m2() method not available
        // since its in the child class and child to parent inherit is not possible
        A a = new A();
        a.m1();

        // Child Class Ref and Obj calling m1() and m2() methods below.
        B b = new B();
        b.m1();
        b.m2();

        // Parent Ref is used to hold the child class Objects
        // but using that Ref we cannot call the child class methods or variables
        A c = new B();
        c.m1();
//        c.m2();   -- >> Compile time error will come , since it is a child class method ref by Parent A.

        // Child Ref is not used to hold the Parent class Objects
//        B d = new A(); -->> Compile Time Error will come, Since it is child class ref to the Parent class Object

    }
}
