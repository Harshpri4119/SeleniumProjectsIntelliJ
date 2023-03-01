package com.java.MethodOverriding;

// Method Overriding ::  if the child class rewrites or overrides the methods provided by the parent class, then its known as Method Overriding.
// as per inheritance , all the properties such as methods and data members present in the parent class by default it is available to the child class.
// so if the child class is not satisfied by the methods of the parent class , they can re write the methods.


class ParentProperty{
    public void property(){
        System.out.println(" Cash + Gold + Land ");
    }
    public void marry(){
        System.out.println(" Mayukha. ");
    }
}
class ChildProperty extends ParentProperty{
    public void marry(){
        System.out.println(" Priya. ");
    }
}
public class Program1 {
    public static void main(String[] args){

        ParentProperty parentProperty = new ParentProperty();     // Parent ref and Parent Obj
        parentProperty.marry(); // Parent Marry Method

        ChildProperty childProperty = new ChildProperty();       // Child Ref and   Child Obj
        childProperty.marry(); // Child Marry Method

        ParentProperty parentProperty1 = new ChildProperty();     // Parent Ref and Child Obj
        parentProperty1.marry(); // Child Marry Method, because in Method Overriding, resolution is always taken care by JVM based on Run Time Object.
    }
}
