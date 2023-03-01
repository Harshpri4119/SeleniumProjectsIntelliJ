import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmail {
    public static void main( String[] args){
        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try{
            driver.get("https://www.rediff.com/");
            driver.findElement(By.xpath("//a[@class='signin']")).click();
            driver.findElement(By.linkText("Create a new account")).click();
            driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("Harsha Vardhan");
            driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("Harshavk4119");
            driver.findElement(By.xpath("//input[contains(@value,'Check availability')]")).click();
            driver.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("Harsha@123");
            driver.findElement(By.xpath("//input[contains(@name,'confirm_passwd')]")).sendKeys("Harsha@123");
            driver.findElement(By.xpath("//input[contains(@type,'checkbox')]")).click();
            driver.findElement(By.xpath("//input[contains(@name,'mobno')]")).sendKeys("9182203017");

            driver.findElement(By.xpath("//select[contains(@name,'hint')]")).click();
            driver.findElement(By.xpath("//select[contains(@label,'What is your favourite food?')]")).click();
            driver.findElement(By.xpath("//select[contains(@name,'hint')]")).sendKeys("Pizza");
            driver.findElement(By.xpath("//input[contains(@name,'mothername')]")).sendKeys("Geetha Lakshmi");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
