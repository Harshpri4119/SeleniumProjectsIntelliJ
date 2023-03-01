package com.java.MehtodOverloading;

public class Program6 {
    public void m1(int i, float f){
        System.out.println(" Int , Float");
    }
    public void m1(float f, int i){
        System.out.println(" Float, Int ");
    }
    public static void main(String[] args){
        Program6 program6 = new Program6();

        program6.m1(10, 10.5f);
        program6.m1(10.5f,10);
//        program6.m1(10,10);           // Both Methods Matched, so compiler confuses which one to compile and produces Compiler Time Error
//        program6.m1( 10.5f,10.5f);    //Both Methods are Not Matched, So Compiler will Produce Compiler Time Error

    }
}
