fun main(args: Array<String>){

    // Print Movie Name and Release Year
    // Below we are Creating movieInfo() func and Passing the Movie and Year as Param

    fun movieInfo(movie: String,year:Int){
        // Printing the Statement
        println("$movie Released in the Year $year")
    }

    // Declaring the Params Movie and Year in the above movieInfo() Func
    movieInfo("The Dark Knight", 2008)
    movieInfo("Inception",2011)
    movieInfo("Bahubali- The Beginning", 2015)
    movieInfo("Jersey", 2019)

}