import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter the Word to check PALINDROME :: ");
        String input = scan.next();

        // Below we Created the String Builder to Create the String For the Reverse
        // and also Passing the above Stirng input as append to Reverse it .
        // by using reverse() method we reverse the String.
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input);
        stringBuilder = stringBuilder.reverse();

        // if / else cases to check the Output of the above String.
        if (input.equals(stringBuilder.toString())){
            System.out.println("Yes " + input + " , is a PALINDROME. ");
        }else if(!input.equals(stringBuilder.toString())){
            System.out.println("No " + input + " , is Not a PALINDROME. ");
        }

    }
}
