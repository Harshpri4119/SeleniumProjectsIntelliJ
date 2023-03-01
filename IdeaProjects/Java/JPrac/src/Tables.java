import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {

        // Below Scan Statement to Scan the Input from the User.
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the Number :: ");
        int num1 = input.nextInt();

        // From the user Input we will print the Multiplication Table below up to Multiplication of 20.
        for (int i = 1; i <= 100000; i++){
            System.out.println(num1 + " x " + i + " = " + num1 * i);
        }
    }
}
