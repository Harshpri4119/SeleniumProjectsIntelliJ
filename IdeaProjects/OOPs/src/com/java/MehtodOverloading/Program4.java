package com.java.MehtodOverloading;

// If the parent and child does not have any relation then if we pass the value which matches both parent and child then
// you will get compile time error since , it starts matching from the child to parent but since there is no relation between them
// the compiler will get confused and raise the compiler time error


// Below we created 2 methods called m1(String) and m1( StringBuffer ) , both having same method name but different signature or argument tyoe so its overloading.
// but there is no relation between the String and String Buffer, since they were parent and child here but as per java, obj is the parent for both String and String Buffer
// so when we pass the null which matches both String and String Buffer , compiler confuses and produces the Error.

public class Program4 {
    public void m1(String string){
        System.out.println(" String Version. ");
    }
    public void m1(StringBuffer stringBuffer){
        System.out.println(" String Buffer Version");
    }
    public static void main( String[] args){
        Program4 program4 = new Program4();

        program4.m1(" Harsha ");
        program4.m1(new StringBuffer(" Harsha "));
//        program4.m1(null);   // Compile Time Error Occurs , if we uncomment this line and run the code.
    }
}
