fun main(args: Array<String>){

    println("Hello Kotlin") // < -- Print Statement in Kotlin

    // Below we are Declaring Variables in Kotlin
//    var age = 28
    // Below We are Using Val instead of Var because ( Var is a Mutable Variable ) and ( Val is Immutable Variable )
    val age = 28

    // or we can be more specific also to declare variables like Specifying String , Int in Java , C++ Languages
    val years: Int = 28


    // similarly for String to
    val  name: String = "Harsha Vardhan"


    // To print the above name and years variables , we can follow the below syntax
    println("my name is $name and my age is $years and Yes iam $age")
    // So above we directly declaring the variables in the Statements with out any Concatenations and Specifications
    // just ($) and type the variable name as Above shown
    // The Output is ::
    // >> Hello Kotlin
    // >> my name is Harsha Vardhan and my age is 28 and iam 28
}