package com.java.ObjectTypeCast;

// Object Type Cast has 3 conditions or Rules::
// in that 2 where checked by Compiler and 1 is Checked by JVM.

// Below conditions 1,2,3 ::
// 1. There should be a Relation between cast type and object such as Parent to child , child to Parent or Same Type
// 2. There should be a relation between Cast Type and Ref type , such as Cast should be child or same type for Ref since
// Parent ref can hold the child object.

// As we Discussed , below 3rd Condition is Checked by JVM.
// 3. The Run Time Object Type should be Same or Derived Type of Cast Type other Wise You Will get Run Time Execption.

// Below code all Three Rules are Satisfied, and Code Compiled Successfully.

public class Program1 {
    public static void main(String[] args){
        Object o = new String("Harsha ");
        String s = (String) o;

        System.out.println(s);
    }
}
