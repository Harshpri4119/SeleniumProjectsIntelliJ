import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ScopeWebPageFooterLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Below is the Syntax to Print, How many links are there in the Footer Body of WebPage using Xpath
        WebElement footerElement = chromeDriver.findElement(By.xpath("//div[@id='gf-BIG']"));
        System.out.println("TotalLinks on the Footer of WebPage :  "+footerElement.findElements(By.tagName("a")).size());
    }
}
