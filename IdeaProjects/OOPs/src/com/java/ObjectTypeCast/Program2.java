package com.java.ObjectTypeCast;
class Base1{}
class Base2{}

class Der1 extends Base1{}
class Der2 extends Base1{}

class Der3 extends Base2{}
class Der4 extends Base2{}
public class Program2 {
    public static void main(String[] args){

        Base2 b2 = new Der4();
        Der4 d4 = (Der4) b2;            // Compiles
//        Base1 b1 = (Base1) b2;          // Error since no relation between base1 and Base2 as per condition 1.
        Base2 b22 = (Base2) b2;         // Compiles
//        Object o = (Der3) b2;         // Error Since , casting is Not Proper, since Der3 is not child or same for Der4 as Per Condition 3.
//        Base2 b222 = (Base1) b2;      // Error Since No Relattion Between object and Cast type as Per Condition 1.
    }
}
