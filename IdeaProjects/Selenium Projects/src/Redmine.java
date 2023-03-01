import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redmine {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver driver;
        JavascriptExecutor js;

        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;

        driver.get("http://192.168.104.150:3000/");
        driver.findElement(By.xpath("//div[@id='account']/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Harshavardhank");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Harsha@123");
        driver.findElement(By.xpath("//input[@id='login-submit']")).click();
        driver.manage().window().maximize();

    }
}
