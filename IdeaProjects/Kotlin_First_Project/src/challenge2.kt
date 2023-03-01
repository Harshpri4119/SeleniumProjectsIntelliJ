fun main(args: Array<String>){

    // Below im Creating the String Variable in my Name
    // and also below i created the String Variable in server Name
    val myName: String = "iam"
    val serverName: String = "iam_Harsha"

    // Below we are Checking the myname and servername , if both matches then we will print welcome tagline
    // else if both names not matches than we will print not matching names line.
    if(myName == serverName){
        println("Weclome to the World of Tenet Mr.$myName")
    }else if (myName != serverName){
        println("User Name : $myName is not matching with Server Name : $serverName")
    }

}