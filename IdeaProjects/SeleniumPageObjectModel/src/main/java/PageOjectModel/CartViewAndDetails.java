package PageOjectModel;

import ReusablePackage.ReuseableClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartViewAndDetails extends ReuseableClass {
     WebDriver chromeDriver;

    List<WebElement> cartProducts;
    WebElement buyButton;

    public CartViewAndDetails(WebDriver chromeDriver) {
        super(chromeDriver);
        this.chromeDriver = chromeDriver;
    }

    public List<WebElement> getCartList() {
         cartProducts = chromeDriver.findElements(By.cssSelector(".cartSection h3"));
        return cartProducts;
    }

    public boolean viewCartAndValItem(String prodName) {
        boolean productName = getCartList().stream().anyMatch(cartProd -> cartProd.getText().equalsIgnoreCase(prodName));
        return productName;
    }

    public void checkOutPage() {
         buyButton = chromeDriver.findElement(By.cssSelector(".totalRow button"));
        buyButton.click();
    }

}
