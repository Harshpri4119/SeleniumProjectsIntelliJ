package com.java.ObjectTypeCast;

// In Over Loading , Object Type Casting is Taken Care By Compiler based on Reference Type.
// Since in overloading, method resolution is taken care by Compiler based on Reference Type.

class ParentType2{
    public static void m1(){
        System.out.println("Parent.");
    }
}
class ChildType2 extends ParentType2{
    public static void m1(){
        System.out.println("Child.");
    }
}
class GrandChildType2 extends ChildType2{
    public static void m1(){
        System.out.println("Grand Child.");
    }
}
public class Program6 {
    public static void main(String[] args){
        GrandChildType2 grandchildType2 = new GrandChildType2();    // Child Ref and Child Obj so in Overloading, method resolution is taken care by compiler based on Reference type

        grandchildType2.m1();
        ((ChildType2)grandchildType2).m1();
        ((ParentType2)(ChildType2)grandchildType2).m1();

    }
}
