fun main(args: Array<String>) {

    class UserDetails{
        var name: String
        var age: Int
        var nation: String

        init {
            name = ""
            age = 0
            nation = ""
        }
        constructor(myName: String, myAge: Int, myColor: String){
            this.name = myName
            this.age = myAge
            this.nation = myColor
        }
        fun userDetails(){
            println("$name is $age years old and $nation")
        }
    }
    var myDetails = UserDetails("Harsha Vardhan", 23, " Indian")
}