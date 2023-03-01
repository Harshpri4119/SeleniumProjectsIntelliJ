import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) chromeDriver;

        chromeDriver.get("https://www.amazon.com/");

        // Below we implemented the Action class and invoked in ChromeDriver.
        Actions actions = new Actions(chromeDriver);
        // Below we called "moveToElement" method in above Action Class and to move the cursor over the element.
        actions.moveToElement(chromeDriver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();  // build().(perform(); -> to perform the given moveToElement method
    }
}
