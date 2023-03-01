fun main(args: Array<String>) {

    // Make a List of Fav Movies

    val myFavMovies: List<String> = listOf(" The Dark Knight Trilogy", " Dunkirk ",
            " Spider-Man Trilogy", " Interstellar",
            " Avengers End Game", " Jurassic Park Series")

    println("The TOP 6 Hollywood Films of Mine is : $myFavMovies")
    println(" The Third Movie in My Top 6 Movies is : ${myFavMovies[2]}")
    println(" The Size of My Top 6 Movies is : ${myFavMovies.size}")
}