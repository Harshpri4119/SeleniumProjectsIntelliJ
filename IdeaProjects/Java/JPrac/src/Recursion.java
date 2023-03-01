/**
 * Recursion is the technique of making a function call itself.
 * This technique provides a way to break complicated problems down into simple problems which are easier to solve.
 */

public class Recursion {
    public static void main(String[] args) {
        userName(5);  // Passing Param int as 5 to the func to print the Statement 5 Times.
    }

    public static void userName(int n) {

        if (n == 0) { // If nothing Left then print Done
            System.out.println("Done!.");
        } else {  // Else Print UserName as Statement
            String userName = "Harsha is the User Name";
            System.out.println(userName);
            n--;  // we Decrement n each time passing the Statement.
            userName(n); // so this Func carries the Dec n value everytime and Print the Statement
        }
    }

    // We need a Base Case to Stop the Recursion
    // So , we created the Base Case in the IF/Else Statement , to check the Statement
    // and passing the Func in the func itself to print the Statement

}
