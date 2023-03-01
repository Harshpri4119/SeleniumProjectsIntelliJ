import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ElementEnableDisable {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        chromeDriver.manage().window().maximize();
        // Below is the code to check or validate weather the element is Enabled or not by using Selenium 'isEnabled' method.

        /*
        boolean beforeRoundTripClick = chromeDriver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled();
        chromeDriver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
       boolean afterRoundTripClick =  chromeDriver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled();

       System.out.println("Before Round Trip Click: " + beforeRoundTripClick);
       System.out.println("After Round Trip Click: " + afterRoundTripClick);

         */

        // Below is the code to check or validate weather the element is Enabled or not by using the Dynamic code  of Element HTML attribute.
        System.out.println(chromeDriver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style"));
        chromeDriver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
        System.out.println(chromeDriver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style"));

        // below is If Statement to check weather the element is Enabled or not.
        if(chromeDriver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1")){
            System.out.println("is Enabled");
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(true);
            System.out.println("is not Enabled");
        }

    }
}
