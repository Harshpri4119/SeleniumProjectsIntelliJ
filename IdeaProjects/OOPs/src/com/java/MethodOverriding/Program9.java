package com.java.MethodOverriding;

// if parent and child class Contains the Static method with the Same Method Name and Arguemnts.
// then its not Method Overding its called as Method Hiding.

// in Method Hiding , method Resolution is Always Takes Care by Compiler based on Reference Type.

class ParentMethodHiding{
    public static void m1(){
        System.out.println(" Parent Class, Static Method. ");
    }
}
class ChildMethodHiding extends ParentMethodHiding{
    public static void m1(){
        System.out.println(" Child Class, Static Method.  ");
    }
}
public class Program9 {
    public static void main(String[] args){

        ParentMethodHiding parentMethodHiding = new ParentMethodHiding();
        parentMethodHiding.m1();

        ChildMethodHiding childMethodHiding = new ChildMethodHiding();
        childMethodHiding.m1();

        ParentMethodHiding parentMethodHiding1 = new ChildMethodHiding();
        parentMethodHiding1.m1();

    }
}
