import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandleAssignment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();


        chromeDriver.get("https://the-internet.herokuapp.com/");
        chromeDriver.findElement(By.xpath("//a[@href='/windows']")).click();

        chromeDriver.findElement(By.xpath("//div[@class='example']/a")).click();
        Set<String> windowHandles=chromeDriver.getWindowHandles();
        Iterator<String> it = windowHandles.iterator();

        String parentID = it.next();
        String childID = it.next();
        chromeDriver.switchTo().window(childID);
        System.out.println(chromeDriver.findElement(By.xpath("//div[@class='example']/h3")).getText());
        chromeDriver.switchTo().window(parentID);
        System.out.println(chromeDriver.findElement(By.xpath("//div[@class='example']/h3")).getText());



    }
}
