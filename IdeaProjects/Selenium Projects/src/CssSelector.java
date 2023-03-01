import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileWriter;
import java.io.IOException;

public class CssSelector {
    public static void main( String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        FileWriter writer = new FileWriter("Selenium.txt");

        try{
            driver.get("https://login.salesforce.com/?locale=in");

            driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Harsha Priya");
            driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Harsha Priya");
            driver.findElement(By.cssSelector("input[type='checkbox']")).click();
            driver.findElement(By.xpath("//input[@id='Login']")).click();
//            writer.write(driver.findElement(By.xpath("//div[@id='error']")).getText());
//            writer.close();
//            System.out.println("Selenium ouput file generated");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
