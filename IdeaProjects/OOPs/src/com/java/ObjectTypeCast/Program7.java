package com.java.ObjectTypeCast;

// In overRiding , Variable resolution is always taken care by Compiler based on Reference Type.
// we cannot over ride variable.

class ParentType3{
    int i = 777;
}
class ChildType3 extends ParentType3{
    int i = 888;
}
class GrandChildType3 extends  ChildType3{
    int i = 999;
}
public class Program7 {
    public static void main(String[] args){

        GrandChildType3 grandChildType3 = new GrandChildType3();   // Child Ref and Child Obj so in Varible Resolution Compiler takes care of Reference

        System.out.println(grandChildType3.i);
        System.out.println(((ChildType3)grandChildType3).i);
        System.out.println(((ParentType3)(ChildType3)grandChildType3).i);
    }
}
