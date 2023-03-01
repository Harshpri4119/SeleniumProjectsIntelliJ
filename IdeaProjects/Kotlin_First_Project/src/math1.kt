fun main(args: Array<String>){

    val a: Int = 41
    val b: Int = 19
    val c: Int = a+b

    val name: String = "Harsha Vardhan"
    val name2: String = "Priya"

    println("$a is $name2 and $b is $name")
    println("The addition of $a and $b is $c")

    val double: Double = 41.19
    // Below we are Converting the Double to String by Adding the .toInt() at the Variable
    val answer: Int = double.toInt() + a + b + c
    println("------------------------------------------------------------------------")
    println("The answer for the ${double.toInt()} + $a + $b + $c is $answer")
}

