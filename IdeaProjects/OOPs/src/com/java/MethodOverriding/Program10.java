package com.java.MethodOverriding;

// We Cannot Over Ride the Var-Arg Method with normal method , we can only overload them.
// We can OverRide var-arg method, by using var-arg method only.

// below we used var arg method to over ride the var arg method.

class ParentVarArgMethod{

    public void m1(int... i){    //  Var Arg Method.

        System.out.println(" Parent. ");

    }
}
class ChildVarArgMethod extends ParentVarArgMethod{

    public void m1(int... j){    // Over Ride by Var Arg Method.

        System.out.println(" Child. ");

    }
}
public class Program10 {
    public static void main(String[] args){

        ParentVarArgMethod parentVarArgMethod = new ParentVarArgMethod();
        parentVarArgMethod.m1();

        ChildVarArgMethod childVarArgMethod = new ChildVarArgMethod();
        childVarArgMethod.m1();

        ParentVarArgMethod parentVarArgMethod1 = new ChildVarArgMethod();
        parentVarArgMethod1.m1();

    }
}
