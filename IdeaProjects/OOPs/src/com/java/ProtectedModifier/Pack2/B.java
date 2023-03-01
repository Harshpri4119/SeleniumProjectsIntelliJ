package com.java.ProtectedModifier.Pack2;

import com.java.ProtectedModifier.Pack1.A;

public class B extends A{
    public static void main(String[] args) {
        A a = new A();  // A obj [Parent] Ref -> A ref [Parent] obj
//        a.m1();       // Invalid

        B b = new B();  // C obj [Child] Ref -> C ref [Child] obj
        b.m1();         // Valid

        A a1 = new B();  // A obj [Parent] Ref -> C ref [Child] obj
//        a1.m1();      // Valid
    }
}
