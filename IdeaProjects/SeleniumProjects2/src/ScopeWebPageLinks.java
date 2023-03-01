import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class ScopeWebPageLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Below is the syntax to Print, how many links are there in a WebPage using TagName.
        System.out.println("TotalLinks on the WebPage : "+chromeDriver.findElements(By.tagName("a")).size());
    }
}
