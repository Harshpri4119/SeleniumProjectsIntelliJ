import java.util.Scanner;

public class TenetWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter the User Name :: ");
        String username = scan.next();
        System.out.print(" Enter the Age :: ");
        int age = scan.nextInt();
        String[] menuArray = new String[]{"Home", "Videos", "Feeds", "Chats", "Settings", "Profile", "About Tenet"};
        if (age >= 18) {
            System.out.println(" Hello :) " + username + " Welcome to Tenet World...");
            System.out.println(" Type Menu you want, to Explore Tenet. ");
            for (int i = 0; i < menuArray.length; i++) {
                System.out.println(menuArray[i]);
            }
            Scanner menuScan = new Scanner(System.in);
            System.out.println("Enter the Menu Option You want to Explore :: ");
            String menu = menuScan.next();
            int i = 0;
            if (menu.equals(menuArray[i])) {
                System.out.println(" You have Entered " + "' " + menu + " '");
            } else {
                System.out.println("Incorrect Menu, Please Enter the Correct Menu To Explore.");
            }
        } else {
            System.out.println(" Sorry :( " + username + " You are Not Allowed to Tenet World. ");
        }
    }
}
