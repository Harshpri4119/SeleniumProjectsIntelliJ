package com.java.MethodOverriding;

// In Method Over riding , Static method to non static method is Not Possible.
// similarly, Non Static to Static Method is Not Possible.
// If In Both Parent and Child , Static Method then it is Possible.
/// but its not Method Over Riding, Its Method Hiding.

// Because , Static is Class Level method and non Static means Object Level Method.

// Below we are Over riding the Static method to Non Static Method.
// So we will Get Compiler Time Error.
// Uncomment the BELOW code and Run the Code.

class Program8 {
    public static void m1(){

    }

}
class Child8 extends Program8{
//    public void m1(){
//
//    }
}
