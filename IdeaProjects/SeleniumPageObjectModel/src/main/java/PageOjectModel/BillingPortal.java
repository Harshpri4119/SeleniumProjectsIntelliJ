package PageOjectModel;

import ReusablePackage.ReuseableClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BillingPortal extends ReuseableClass {
    WebDriver chromeDriver;
    WebElement typeCountry = chromeDriver.findElement(By.xpath("//input[@placeholder='Select Country']"));
    WebElement selectCountry = chromeDriver.findElement(By.xpath("//button[contains(@class,'ta-item')])[2]"));
    WebElement submitButton = chromeDriver.findElement(By.xpath("//a[contains(@class,'btnn')]"));
    By resultWait = By.xpath("//section[contains(@class,'ta-results')]");

    public BillingPortal(WebDriver chromeDriver) {
        super(chromeDriver);
        this.chromeDriver = chromeDriver;
    }

    public void selectTheCountry(String countryName) {
        Actions actions = new Actions(chromeDriver);
        actions.sendKeys(typeCountry, countryName).build().perform();
        waitForElementToAppear(resultWait);
        selectCountry.click();
    }

    public void submitOrder() {
        submitButton.click();
    }
}
