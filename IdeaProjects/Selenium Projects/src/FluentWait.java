import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class FluentWait {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        Thread.sleep(5000);
        chromeDriver.findElement(By.xpath("//div[@id='start']")).click();

        // Below is Syntax for the Fluent Wait
        Wait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<>(chromeDriver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(Exception.class);

        WebElement checkElement = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                if (chromeDriver.findElement(By.xpath("//div[@id='finish']/h4")).isDisplayed()) {
                    return chromeDriver.findElement(By.xpath("//div[@id='finish']/h4"));
                } else {
                    return null;
                }
            }
        });
        System.out.println(chromeDriver.findElement(By.xpath("//div[@id='finish']/h4")).getText());
    }
}
