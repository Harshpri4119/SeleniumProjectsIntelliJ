import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailSend {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "P://Selenium Complete Folder//WebDrivers//geckodriver.exe");
        WebDriver chromeDriver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) chromeDriver;

        chromeDriver.get("https://accounts.google.com/signin");
        String emailID = "Kanakagirih@gmail.com";
        String password = "9182203017";

        // Email
        chromeDriver.findElement(By.xpath("//input[@type='email']")).sendKeys(emailID);
        WebElement driver = chromeDriver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
        js.executeScript("arguments[0].click();",driver);

        // Password
        chromeDriver.findElement(By.xpath("")).sendKeys(password);
        chromeDriver.findElement(By.xpath("")).click();


    }
}
