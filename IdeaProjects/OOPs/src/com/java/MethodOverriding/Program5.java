package com.java.MethodOverriding;
// In Method Overriding ::
// if method is declared as Final , then Overriding is Not Possible.
// Since the Method is Declared as Final

// below we declared the Parent class m1 Method as Final
// so overriding is not possible.
// Uncomment the code below and run to check the Compile Time Error.

class ParentFinal{

    public final void m1(){

    }
}

class ChildFinal extends ParentFinal{

//    public void m1(){      // even if public final void m1() {
//
//    }

}

public class Program5 {

}
