package TestNgPrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgBeforeClass_AfterClass {
    @Test(priority = 3)
    public void webLogin() {
        System.out.println(" This is webLogin. ");
    }

    @Test(priority = 2)
    public void mobileLogin() {
        System.out.println(" This is Mobile Login");
    }

    @Test
    public void deskTopLogin() {
        System.out.println(" This is DeskTop Login");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println(" This is Before Class");
    }
}

class TestNgBeforeClass_AfterClass2 {
    @Test(priority = 1)
    public void webLogout() {
        System.out.println(" This is Web Logout.");
    }

    @Test(priority = 3)
    public void mobileLogout() {
        System.out.println(" This is Mobile Logout");
    }

    @Test(priority = 2)
    public void deskTopLogout() {
        System.out.println(" This is DeskTop Logout");
    }

    @AfterClass
    public void afterClass() {
        System.out.println(" This is After Class.");
    }
}