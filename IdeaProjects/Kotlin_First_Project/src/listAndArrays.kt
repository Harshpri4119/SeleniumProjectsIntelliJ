fun main(args: Array<String>){

    // Below we are Declaring the Var for the Lists
    var myFavNumbers = listOf<Int>(6,19,41,1997,2000,1965,1971)


    // if we want to mutable List then we can type as below
    val myFaveMutableNumbers = mutableListOf<Int>(6,19,41,1997,2000,1965,1971)
    // to add the instances in the list we can simply type .add() method and pass the instances as below
    myFaveMutableNumbers.add(411)
    myFaveMutableNumbers.add(199)
    // to add the instances in the particular instances we can type as Below
    myFaveMutableNumbers.add(4,0)
    // so below we add the instances in the 4 th index and 0 th element


    // to get the size of the list or array we can type as follows
    println("The Size of my Fav Numbers is $myFavNumbers.size") // size for the list myFavNumbers
    println("The size of  my Fav Mutable Numbers is $myFaveMutableNumbers.size") // Size for the list myFavMutableNumbers

    // to get the values of the index in the list or array we can type syntax as below
    println("The Number in the Index[1] of my Fav Number is $myFavNumbers[1]") // index[1]  for the list myFavNumbers
    println("The Number in the Index[2] of my Fav Mutable Number is $myFaveMutableNumbers[2]") // index[2] for the list myFavMutableNumbers

    // Similarly if we want to declare the Var for the Array
    var myNumbersFav = arrayOf<Int>(6,19,41,1997,2000,1965,1971)

}