package com.java.OopsJava;

// Method Signature :: its said when the method name was followed by the arguments type.
// Compiler uses the Method Signature while resolving the METHOD calls.
// AS shown Below.

public class MethodSignature {

    public void m1(int i,String s){
    }

    public void m2(String s){
    }
    public static void main(String[] args) {
        MethodSignature testMethodSignature = new MethodSignature();
        testMethodSignature.m1(1," K.Harsha Vardhan ");    // -> Passing int and String arguments
        testMethodSignature.m2(" Visakhapatnam. ");          // -> Passing the String arguements as Dec in the above m2() method.
//        testMethodSignature.m3(10.5);     we have not created the m3(double) method and passing arguments, so compiler time Error we will get.
    }
}