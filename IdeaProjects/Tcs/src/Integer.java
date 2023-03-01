import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        int n = 10;
        int k = 5;
        Scanner inputValue = new Scanner(System.in);
        int userValue = inputValue.nextInt();
        int subValue =  n - userValue;
        if(userValue >= 1 && userValue <= k){
            System.out.println("Number of Candies Sold :: " + userValue);
            System.out.println("Number of Candies Left :: " + subValue);
        }else{
            System.out.println("INVALID OUTPUT");
            System.out.println("Number of Candies Left : " + n);
        }

    }
}
