package com.java.ObjectTypeCast;

// In Over riding , object Type Casting is always takes care by JVM based on Run Time Object
// Since Over riding is a Concept both method signature of parent and class are same and Method Resolution takes care by JVM based on Run Time Object.

// Below over riding , and performing the Object type cast
class  ParentType{
    public void m1(){
        System.out.println("Parent");
    }
}
class ChildType extends ParentType{
    public void m1(){
        System.out.println("Child");
    }
}
class GrandChild extends ChildType{
    public void m1(){
        System.out.println("GrandChild.");
    }
}
public class Program5 {
    public static void main(String[] args){

        GrandChild grandChild = new GrandChild();   // Child Ref and Child Object so in Overriding the method resolution is Taken care by Run Time Object.

        grandChild.m1();

        ((ChildType)grandChild).m1();
        ((ParentType)(ChildType)grandChild).m1();
    }
}
