import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class FrameHandleAssignment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        chromeDriver.get("https://the-internet.herokuapp.com/");
        chromeDriver.findElement(By.xpath("//a[@href='/nested_frames']")).click();
        System.out.println("Total IFRAMES in the WebPage: " + chromeDriver.findElements(By.tagName("frame")).size());

        chromeDriver.switchTo().frame(chromeDriver.findElement(By.xpath("//frame[@name='frame-top']")));
        chromeDriver.switchTo().frame(chromeDriver.findElement(By.xpath("//frame[@name='frame-middle']")));
        WebElement element = chromeDriver.findElement(By.xpath("//div[@id='content']"));
        System.out.println(element.getText());
    }
}
