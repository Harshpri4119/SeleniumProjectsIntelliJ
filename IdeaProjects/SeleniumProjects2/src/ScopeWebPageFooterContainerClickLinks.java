import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ScopeWebPageFooterContainerClickLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Below is the Syntax to Print, How many links are there in the Footer Body of WebPage using Xpath
        WebElement footerElement = chromeDriver.findElement(By.xpath("//div[@id='gf-BIG']"));
        System.out.println("TotalLinks on the Footer of WebPage :  " + footerElement.findElements(By.tagName("a")).size());

        // Below is the Syntax to Print, How many links are there in one container of Footer section in webPage.
        WebElement containerElement = footerElement.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
        List<WebElement> containerElements = containerElement.findElements(By.tagName("a"));

        for (WebElement clickElement : containerElements) {
            String clickOnTheLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
            clickElement.sendKeys(clickOnTheLink);
        }

        // Below is to open all Windows and Get Title of the Window.
        Set<String> linksOpen = chromeDriver.getWindowHandles();
        Iterator<String> it = linksOpen.iterator();

        while (it.hasNext()) {
            chromeDriver.switchTo().window(it.next());
            System.out.println("Window Title: " + chromeDriver.getTitle());
        }

    }
}
