package com.java.OopsJava;

// For Every abstract method in the Parent Class Provided should be Implemented in the Child Class as Below

public abstract class AbstractClassMethodExample1 {
    public abstract void m1();
    public abstract void m2();
}
// >> Below we are Creating the class and Extending its parent class above and implementing its methods.

class subAbstractClass extends AbstractClassMethodExample1{
    @Override
    public void m1() {

    }
    @Override
    public void m2() {

    }
}
