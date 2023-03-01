import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDownParentChild {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise");
        driver.manage().window().maximize();
        try{
            Thread.sleep(3000);
            driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
            // below is DropDown Container xpath as Parent + space +Value 'MAA' as child xpath in DropDown Container.
            // //div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']
            driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
            driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
