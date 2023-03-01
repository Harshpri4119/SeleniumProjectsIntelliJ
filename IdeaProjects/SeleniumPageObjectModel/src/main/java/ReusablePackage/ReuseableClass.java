package ReusablePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReuseableClass{
     WebDriver chromeDriver;
    WebElement cart;

    public ReuseableClass(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public void waitForElementToAppear(By findBy) {
        WebDriverWait explicitWait = new WebDriverWait(chromeDriver, Duration.ofSeconds(5));
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
    }

    public void waitForElementToAppear(WebElement element) {
        WebDriverWait explicitWait = new WebDriverWait(chromeDriver, Duration.ofSeconds(5));
        explicitWait.until(ExpectedConditions.visibilityOf(element));
    }

    public void goToCart(){
         cart = By.xpath("//button[@routerlink='/dashboard/cart']").findElement(chromeDriver);
        cart.click();
    }

    public void waitForElementToDisappear(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }
}
