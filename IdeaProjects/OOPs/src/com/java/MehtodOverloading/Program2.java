package com.java.MehtodOverloading;

// Automatic Promotion in OverLoading ::
// in the method overloading, if the exact method is not available, then we wont get the compile time error.
// because , the method will promote to the next level to find the matched method and this process continues until you find the matched method.
// if you found the matched method it compiles.
// if you did not found the matched method , even after completing the all the proportion , then only you will get the compile time error.

public class Program2 {
    public void m1(){
        System.out.println(" Empty Arg. ");
    }
    public void m1(int i){
        System.out.println(" Int Arg. ");
    }

    public void m1(double d){
        System.out.println(" double Args. ");
    }
    public void m1(String s){
        System.out.println(" String Args. ");
    }
    public static void main(String[] args){
        Program2 program2 = new Program2();

        program2.m1();
        program2.m1("Dogs");
        program2.m1(10);
        program2.m1(10.5);
        program2.m1('a');   // <--- Method with char arg is not available above. but they compiles because of Automatic Promotion Overloading.
        program2.m1(10F);  // <--- Method with float arg is not available above. but they compiles because of Automatic Promotion Overloading.
    }
}
