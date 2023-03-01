package com.java.MethodOverriding;


// In Method Over riding , we cant reduce the scope of access modifiers.
// But we can increase the scope of access Modifiers.

// public , protected, default, private.
// public is higher access and private is lowest access Modifiers

class ParentModifier{
// 1.   public void m1(){           // public to protected is not possible because we are reducing the access modifiers
//    }

    protected void m1(){           // But Protected to public is Possible because we are increasing the access modifiers.

    }
}

class ChildModifiers extends ParentModifier{
// 1.   protected void m1(){
//    }

    public void m1(){

    }
}
public class Program7 {
    public static void main(String[] args) {

    }
}
