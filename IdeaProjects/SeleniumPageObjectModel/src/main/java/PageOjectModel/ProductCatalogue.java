package PageOjectModel;

import ReusablePackage.ReuseableClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductCatalogue extends ReuseableClass {

    public WebDriver chromeDriver;

//    By productsBy = By.xpath("//div[contains(@class,'mb-3')]");
    By addToCartProduct = By.cssSelector(".card-body button:last-of-type");
    By toastContainer = By.cssSelector("By.cssSelector('#toast-container')");
    public WebElement loadingSymbol;


    public ProductCatalogue(WebDriver chromeDriver) {
        super(chromeDriver);
        this.chromeDriver = chromeDriver;
    }

    List<WebElement> product_names;


    public List<WebElement> getProductList() {
        product_names = chromeDriver.findElements(By.xpath("//div[contains(@class,'mb-3')]"));
        return product_names;
    }

    public WebElement getProductName(String productName) {
        WebElement prodName = getProductList().stream().filter(product ->
                product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
        return prodName;
    }

    public void addToCart(String prodName) {
        loadingSymbol = chromeDriver.findElement(By.cssSelector(".ng-animating"));
        WebElement prod = getProductName(prodName);
        prod.findElement(addToCartProduct).click();
        waitForElementToAppear(toastContainer);
        waitForElementToDisappear(loadingSymbol);
    }


}
