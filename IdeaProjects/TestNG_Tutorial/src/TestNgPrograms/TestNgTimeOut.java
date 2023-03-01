package TestNgPrograms;

import org.testng.annotations.Test;

public class TestNgTimeOut {
    @Test(timeOut = 3000, priority = 1)
    public void webLogin() throws Exception {
        Thread.sleep(2000);
        System.out.println(" Web Login");
    }

    @Test(priority = 2)
    public void mobileLogin() {
        System.out.println(" Mobile Login ");
    }

    @Test(priority = 3)
    public void deskTopLogin() {
        System.out.println(" DeskTop Login");
    }
}
