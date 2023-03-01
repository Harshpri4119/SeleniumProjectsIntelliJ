package com.java.MehtodOverloading;

// In Method Overloading , between the parent arg and child arg , the high priority given to the child arg to match the method.
// if child arg does not found , then  it will promoted to its parent method.
// If child method is not there ,then Parent will get a chance to match the method.

// below we have 2 methods :: m1() <--- Object , m1() <--- String.



public class Program3 {

    public void m1(Object o){

        System.out.println(" Obj Arg");

    }
    public void m1(String s){

        System.out.println(" String Arg");

    }
    public static void main(String[] args){

        Program3 program3 = new Program3();
        program3.m1(new Object());
        program3.m1(" String Method. ");
        program3.m1(null);    /// So here we are passing the NuLL as a Arg , So first child will check the matching if not found then parent comes.

    }
}
