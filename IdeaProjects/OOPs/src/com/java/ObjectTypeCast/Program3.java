package com.java.ObjectTypeCast;
// By Object Type Casting, New Object wont be created.
// For the Existing Object, new Reference variable will be added.

// Below we Created String s object.
// for that Existing String s Object we have created the Reference variable.

public class Program3 {
    public static void main(String[] args){
//        String s = new String(" Harsha. ");
//        Object o = (Object) s;
//        System.out.println(s==o);

        // Similary below Int object and its Reference Variable
        Integer i = new Integer(10);
        Number n = (Number) i;
        Object obj = (Object) n;
        System.out.println(i==n);
        System.out.println(n==obj);
        System.out.println(obj==i);

    }
}
