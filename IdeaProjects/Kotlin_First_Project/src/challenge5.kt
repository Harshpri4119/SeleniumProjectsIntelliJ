fun main(args: Array<String>){


    // Make a Map that holds 3 Words and 3 Definitions of Slang You Use



    /*
    Definition of Maps ::
    A map contains values on the basis of key, i.e. key and value pair. Each key and value pair is known as an entry. A Map contains unique keys.
    A Map is useful if you have to search, update or delete elements on the basis of a key.
     */


    // Below we Created the Three Words Java, Apple, FaceBook and Its Three Definitions in ( to )

    val words = mutableMapOf("Java" to "Java Is a Programming Language",
                            "Apple" to " Apple is a Fruit", "FaceBook" to "FaceBook is a Social Network")

    // Below we added Krishna Word and Its Def
    words["Krishna"] = "The Name of Hindu God"

    println("The def of Krishna is " + "${words["Krishna"]}") // Def of Krisha
    println("The def of Java is " + "${words["Java"]}")  // Def of Java
    println("The def of Apple is " + "${words["Apple"]}" ) // Def of Apple
    println("The def of FaceBook is " + "${words["FaceBook"]}") // Def of FaceBook

}