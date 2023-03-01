package TestNgPrograms;

import org.testng.annotations.Test;

public class TestNgEnabled {
    @Test
    public void webLogin() {
        System.out.println(" Web login");
    }

    @Test (enabled = false)
    public void mobileLogin() {
        System.out.println(" Mobile Login");
    }

    @Test
    public void deskTopLogin() {
        System.out.println(" DeskTop Login");
    }
}
