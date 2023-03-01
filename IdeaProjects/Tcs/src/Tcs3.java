import java.util.Scanner;

public class Tcs3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

        if(userInput == 0) {
            System.out.println(" Time Estimated :: 0 min");
        }else if(userInput > 0 && userInput <= 2000){
            System.out.println("34 Time Estimated :: 25 min");
        }else if(userInput >2000 && userInput <= 4000){
            System.out.println(" Time Estimated :: 35 min");
        }else if(userInput > 4000 && userInput <= 7000){
            System.out.println(" Time Estimated :: 45 min");
        }else{
            System.out.println(" Invalid Input ");
        }
    }
}
