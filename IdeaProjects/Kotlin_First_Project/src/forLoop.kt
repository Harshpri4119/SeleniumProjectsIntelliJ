fun main(args: Array<String>){
    // For Loops

    /*

    for (p in 1..10){
        println(p)
    }

     */

    val myFavFood: List<String> = listOf("Pizza","Pasta","Yippee","Veg Rolls", "Veg Puff", "Gobi Manchuria","Ghee Dosa","Paratha")

    for (food in myFavFood){
        if (myFavFood.contains("coffee")){
            println(food)
            break
        }else{
            println("Item Not Found")
            break
        }
    }

}