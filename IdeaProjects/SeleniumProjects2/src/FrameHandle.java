import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        Actions actions = new Actions(chromeDriver);
        chromeDriver.get("https://jqueryui.com/droppable/");

        System.out.println("Total IFRAMES in the WebPage: " + chromeDriver.findElements(By.tagName("iframe")).size());
        chromeDriver.switchTo().frame(chromeDriver.findElement(By.xpath("//iframe[@class='demo-frame']")));

        WebElement draggableElement = chromeDriver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement droppableElement = chromeDriver.findElement(By.xpath("//div[@id='droppable']"));
        actions.dragAndDrop(draggableElement,droppableElement).build().perform();
        chromeDriver.switchTo().defaultContent();
    }
}
