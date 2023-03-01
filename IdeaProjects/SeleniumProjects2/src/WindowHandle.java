import okio.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.cssSelector("a[class='blinkingText']")).click();

        Set<String> windows = driver.getWindowHandles();

        Iterator<String> iterator = windows.iterator();

        String parentID = iterator.next();
        String childID = iterator.next();

        // Switching in to the Child ID
        driver.switchTo().window(childID);

        System.out.println(driver.findElement(By.cssSelector("p[class='im-para red']")).getText());

        // Below we used SPLIT & TRIM methods to extract the email text from the Paragraph.
        String actualEmailId = driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
        // Switching in to the Parent ID.
        driver.switchTo().window(parentID);
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys(actualEmailId);

    }
}
