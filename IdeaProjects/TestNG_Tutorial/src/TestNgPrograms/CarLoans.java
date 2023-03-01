package TestNgPrograms;

import org.testng.annotations.Test;

public class CarLoans {
    @Test(priority = 1)
    public void mobileCarLoans() {
        System.out.println(" Mobile car Loans ");
    }

    @Test(priority = 2)
    public void webCarLoans() {
        System.out.println(" Web car Loans ");
    }

    @Test(priority = 3)
    public void deskTopCarLoans() {
        System.out.println(" DeskTop car Loans");
    }
}
