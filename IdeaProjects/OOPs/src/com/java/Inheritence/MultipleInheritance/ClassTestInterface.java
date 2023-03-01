package com.java.Inheritence.MultipleInheritance;

public class ClassTestInterface implements TestInterface {
    @Override
    public void m1() {
        System.out.println(" Class Test Interface implements interface m1() method");
    }

    public static void main(String[] args) {
        ClassTestInterface classTestInterface = new ClassTestInterface();
        classTestInterface.m1();
    }
}
