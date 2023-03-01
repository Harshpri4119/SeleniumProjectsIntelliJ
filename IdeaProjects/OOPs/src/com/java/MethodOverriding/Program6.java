package com.java.MethodOverriding;

// Non Abstract to Abstract method is Possible in Method Over riding.
// Abstract to Non Abstract Method is also Possible in Method Over Riding.

class ParentAbstract{                  // Non Abstract Pa   rent Class to Abstract Class

    public void m1(){

    }
}

abstract class ChildAbstract extends ParentAbstract{         // Abstract Child Class

        public abstract void m1();

}

public class Program6 extends ChildAbstract {             // Abstract to Non Abstract Class

    public void m1() {
        // New Implementation
    }
}
