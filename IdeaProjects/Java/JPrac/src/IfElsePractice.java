import java.util.Scanner;

public class IfElsePractice {
    public static void main(String[] args) {
        String name = "Harsha Vardhan Kanakgiri";
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age >= 18){
            System.out.println(name + " You are Welcome....");
        }else if (age <= 18){
            System.out.println(name + " You are Not Welcomed to the Party..... ");
        }
    }
}
