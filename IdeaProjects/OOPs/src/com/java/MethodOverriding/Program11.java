package com.java.MethodOverriding;

// Over Riding is Only Applicable Only For Methods not For Variables.
// Variable Resolution is Always Takes Care By the Compiler Based On Reference Type.
// This Type of Concept is Called Variable Hiding or Shadowing.

class ParentVariable{
     String s = "Parent.";

}
class ChildVariable extends ParentVariable{
     String s = "Child. ";
}
public class Program11 {
    public static void main(String[] args){

        ParentVariable parentVariable = new ParentVariable();
        System.out.println(parentVariable.s);

        ChildVariable childVariable = new ChildVariable();
        System.out.println(childVariable.s);

        ParentVariable parentVariable1 = new ChildVariable();
        System.out.println(parentVariable1.s);
    }
}
