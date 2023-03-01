package PageOjectModel;

import ReusablePackage.ReuseableClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderConfirmation extends ReuseableClass {
    WebDriver chromeDriver;
    WebElement confomessage = chromeDriver.findElement(By.xpath("//h1[@class='hero-primary']"));

    public OrderConfirmation(WebDriver chromeDriver) {
        super(chromeDriver);
        this.chromeDriver = chromeDriver;
    }

    public String orderConfroMessage() {
        return confomessage.getText();
    }
}
