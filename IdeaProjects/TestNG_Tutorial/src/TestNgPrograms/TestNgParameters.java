package TestNgPrograms;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameters {
    @Parameters({"URL", "APIkey/Username"})
    @Test
    public void homeLoan(String url, String key) {
        System.out.println(" Home Loan");
        System.out.println(url);
        System.out.println(key);
    }

    @Test
    public void carLoan() {
        System.out.println(" Car Loan");
    }

    @Test
    public void educationLoan() {
        System.out.println(" Education Loan");
    }
}
