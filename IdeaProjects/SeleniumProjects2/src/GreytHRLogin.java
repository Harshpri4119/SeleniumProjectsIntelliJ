import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GreytHRLogin {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://turito.greythr.com/");
        chromeDriver.findElement(By.xpath("//input[@id='username']")).sendKeys("700323");
        chromeDriver.findElement(By.xpath("//input[@id='password']")).sendKeys("Harsha@123");
        chromeDriver.findElement(By.xpath("button[type = 'submit']")).click();
        chromeDriver.findElement(By.xpath("//div[@class='gt-widget-wrapper bg-white rounded-m border-secondary-200 hover:shadow-lg ng-star-inserted'][2]" +
                "/gt-component-loader/gt-attendance-info/div/div/div[3]/gt-button")).click();

    }
}
