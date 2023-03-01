package TestNgPrograms;

import org.testng.annotations.Test;

public class HomeLoans {
    @Test(priority = 1)
    public void mobileHomeLoans() {
        System.out.println(" Mobile Home Loans ");
    }

    @Test(priority = 2)
    public void webHomeLoans() {
        System.out.println(" Web Home Loans ");
    }

    @Test(priority = 3)
    public void deskTopHomeLoans() {
        System.out.println(" DeskTop Home Loans");
    }
}
