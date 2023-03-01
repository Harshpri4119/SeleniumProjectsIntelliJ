fun main(args: Array<String>){
    // Maps

    val persons = mutableMapOf("Harsha" to 23, "Priya" to 23, "Yasaswini" to 20, "Aravind" to 23)
    // Below we are Passing the KEY to the above Maps So that they Will Display the Data of Age of Persons.
    println(persons["Harsha"]) // Age of Harsha
    println(persons["Priya"]) // Age of Priya
    println(persons["Yasaswini"]) // Age of Yasu
    println(persons["Aravind"]) // Age of Aravind

}