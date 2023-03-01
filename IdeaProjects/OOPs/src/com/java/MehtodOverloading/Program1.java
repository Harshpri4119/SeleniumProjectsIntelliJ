package com.java.MehtodOverloading;

// Method Overloading :: when methods having same name is but the signatures ( Argument Types ) are different then
// it is said to be known as Method Overloading.

// below class , there is  m1() named method but has contains diff signatures ( Arguments Types ) such as empty, int, double, string.

// Advantages of Method Overloading:: 1.Flexibility of code , 2. it reduces complexity of code.
// in c programming method overloading is not possible because its not oop language.

public class Program1 {
    public void m1(){

        System.out.println(" Empty - Argument ");
    }
    public void m1(int i){

        System.out.println(" Int Arg");
    }
    public void m1(double d){

        System.out.println(" Double Arg");
    }
    public void m1(String s){

        System.out.println(" String Arg");
    }


    public static void main(String[] args){

        Program1 program1 = new Program1();

        program1.m1();
        program1.m1(10);
        program1.m1("Dog");
        program1.m1(10.5);
        program1.m1(10L);
        program1.m1('a');
    }
}
