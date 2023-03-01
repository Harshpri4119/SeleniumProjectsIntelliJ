import java.util.Scanner;

public class ArrayInsert {
    static int count;
    static int position;
    static int numbArray[] = new int[10];
    public static void main(String[] args) {
        System.out.print("Enter the Number of Elements in Array :: ");
        Scanner scanNumber = new Scanner(System.in);
        int number = scanNumber.nextInt();
        System.out.print("The Element is :: " + number);
        for(count = 0; count < number ;count++){
            System.out.println(number);
        }
    }
}