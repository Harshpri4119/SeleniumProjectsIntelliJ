import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try{
            driver.get("https://www.amazon.in/");
            driver.findElement(By.id("nav-link-accountList")).click();
            driver.findElement(By.id("ap_email")).sendKeys("9182203017");
            driver.findElement(By.xpath("//*[@id='continue']")).click();
            driver.findElement(By.id("ap_password")).sendKeys("9440183118");
            driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
            driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']")).click();
            Thread.sleep(3000);
            driver.findElement(By.linkText("Mobiles, Computers")).click();
            Thread.sleep(5000);
            driver.findElement(By.linkText("All Computers & Accessories")).click();
            Thread.sleep(3000);
            driver.findElement(By.linkText("Laptops")).click();
            System.out.println(driver.findElement(By.xpath("//div[@id='s-refinements']")).getText());

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
