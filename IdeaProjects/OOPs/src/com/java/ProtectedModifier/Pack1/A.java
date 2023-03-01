package com.java.ProtectedModifier.Pack1;

// Protected Modifiers :: if the Variable and Methods are declared as the Protected.
// >> Then we can Access it with in the Current Package it Self
// >> and we can access it OutSIDE the Package only in the Child Variable.

public class A {
    protected void m1(){   // We used the Protected Modifier for the method.
        System.out.println(" A class Method. ");
    }
}
class B extends A{
    public static void main(String[] args) {
        A a = new A();  // A obj [Parent] Ref -> A ref [Parent] obj
        a.m1();

        B b = new B();  // C obj [Child] Ref -> C ref [Child] obj

        b.m1();

        A a1 = new B();  // A obj [Parent] Ref -> C ref [Child] obj
        a1.m1();
    }
}
