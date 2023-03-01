import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassCapitalLetter {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.amazon.com/");
        WebElement webElement = chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        // Below we implemented the Action class and invoked in ChromeDriver.
        Actions actions = new Actions(chromeDriver);
       // Below we are calling 'move to element' method to perform, "Keys and Send Keys" function to pass the Text in Web element
        actions.moveToElement(webElement).click().keyDown(Keys.SHIFT).sendKeys("Spider man").build().perform();

        // Below we copied the above whole 'move to element' syntax and just added "double click()" and ENTER function to it.
        actions.moveToElement(webElement).click().keyDown(Keys.SHIFT).sendKeys("BaT MAN").doubleClick().sendKeys(Keys.ENTER).build().perform();
    }
}
