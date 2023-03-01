import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise");
        try {
            driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//a[@value='MAA']")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
            driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
