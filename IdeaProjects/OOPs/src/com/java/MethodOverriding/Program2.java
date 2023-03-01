package com.java.MethodOverriding;

// Method Overriding Rule 1::
// in method overriding , the method signature should be same for both parent and classes
// all the method names and argument types must be same.
// even the order of arguments in the methods should be same.


class Parent{
    public void m1(int i){        // Parent class , m1 method
        System.out.println(" Parent Class | m1() Method | Int arguments. ");
    }
}

class Child extends Parent{
    public void m1(int i){        // same method  and same arguments form the parent class.

        System.out.println(" Child class | m1() method | String arguments. ");
    }
}
public class Program2{
    public static void main(String[] args){

        Parent parent = new Parent();     // Parent ref and Parent Obj
        parent.m1(1);

        Child child = new Child();       // Child ref and Child Obj
        child.m1(1);

        Parent parent1 = new Child();   // Parent ref and Child Obj
        parent1.m1(1);


    }
}
