package com.java.ObjectTypeCast;
class Parent{

    public void m1(){
      System.out.println(" Parent Class, M1 Method. ");
    }

}
class Child extends Parent{

    public void m2(){
        System.out.println(" Child Class, M2 method. ");
    }

}
public class Program4 {

    public static void main(String[] args){

        Child c = new Child();
        c.m1();           // Child class, Parent method Compiles
        c.m2();           // Child class, Child method Compiles
        ((Parent)c).m1(); // child class is typed to Parent and compiles Parent method, Parent method Compiles.
//        ((Parent)c).m2(); // child class is typed to Parent and compiles Child method, ERROR.
        // The above condition is same as Below code
//        Parent parent = new Child();
//        parent.m2();

    }
}
