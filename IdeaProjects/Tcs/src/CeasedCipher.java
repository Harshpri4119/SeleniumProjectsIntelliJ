import java.util.Scanner;

public class CeasedCipher {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        String userInput = "All the Best";
        char[] userInputChar = userInput.toCharArray();
        for ( char c : userInputChar){
            c += 1;
            System.out.print(c);
        }
        System.out.println(" Over .... ");
                    
    }
}
