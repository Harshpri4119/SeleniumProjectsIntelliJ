package com.java.MehtodOverloading;

// In java , General Method is the Oldest Method. introduced in 1.0
// Var Method is Introduced in 1.5 version and its new method.
// if Gen and Var methods are found same matching argument , then Gen method will takes place since its the oldest

// Below we created the m1(int) Gen method and m1(int...) Var method , but first priority is given to the Gen Method.
// Since its the Oldest Method in Java

// Var method will be least Priority always.

public class Program5 {

    public void m1(int i){
        System.out.println(" General Method. ");
    }

    public void m1(int... i){
        System.out.println(" Var- Arg Method. ");
    }

    public static void main( String[] args){
        Program5 program5 = new Program5();

        program5.m1();    //  Var- Arg Method.
        program5.m1(10,20); // Var - Arg Method
        program5.m1(10);  // General Method , because though var and gen method are matching this, since the gen method is older method it will get a chance.
    }

}
