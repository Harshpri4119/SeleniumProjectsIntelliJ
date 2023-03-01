package com.java.OopsJava;

// Private Modifier :: if the Private modifier is used for the Methods or Variables.
// >> Then we can access that private method or variable only in that perticular class
// >> It is also known as Class level Modifier.

// to view the below example please uncomment the class Test -> Privatemodifier.m1(); line

public class PrivateModifier {
    private void m1(){                // used the Private Modifier for the method.
        System.out.println(" A class Method. ");
    }
}

class Test{
    public static void main(String[] args) {
        PrivateModifier privateModifier = new PrivateModifier();
//        privateModifier.m1();
    }
}
