package TestNgPrograms;

import org.testng.annotations.Test;

// Need to Trigger and Run methods having only mobile test cases using XML.
// By using tag ------>   <include name="mobile.*"/>
public class TestNgXML {
    @Test
    public void webLogin() {
        System.out.println(" WEB LOGIN ");
    }

    @Test
    public void webLogout() {
        System.out.println(" WEB LOGOUT");
    }

    @Test
    public void mobileLogin() {
        System.out.println(" MOBILE LOGIN");
    }

    @Test
    public void mobileLogout() {
        System.out.println(" MOBILE LOGOUT");
    }
}
