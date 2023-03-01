package TestNgPrograms;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBefore_And_AfterTestAnnotations {
    @Test(priority = 2)
    public void webLogin() {
        System.out.println(" This is web Login");
    }

    @Test(priority = 1)
    public void mobileLogin() {
        System.out.println(" This is Mobile Login");
    }

    @Test(priority = 3)
    public void DeskTopLogin() {
        System.out.println(" This is DeskTop Login");
    }

    @BeforeTest
    public void BeforeTestSteps() {
        System.out.println(" This is Before TestCase, Will Execute First. ");
    }

    @AfterTest
    public void AfterTestSteps() {
        System.out.println(" This is After TestCase, Will Execute Last");
    }
}
