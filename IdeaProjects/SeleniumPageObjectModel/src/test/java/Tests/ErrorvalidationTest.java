package Tests;

import PageOjectModel.CartViewAndDetails;
import PageOjectModel.ProductCatalogue;
import TestComponents.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ErrorvalidationTest extends BaseTest {
    String myProduct = "IPHONE 13 PRO";
    @Test (groups = "Error Handling")
    public void LoginErrorValidation() throws Exception{
        loginPage.loginPortal("Dummy User","Dummy User123");
        Assert.assertEquals("Incorrect email or password.",loginPage.getErrorMessage());
    }
    @Test
    public void ProductErrorValidation() throws Exception{
        ProductCatalogue productCatalogue = new ProductCatalogue(webDriver);
        List<WebElement> products = productCatalogue.getProductList();
        productCatalogue.addToCart(myProduct);
        productCatalogue.goToCart();
        // View Cart and Validate Cart Items with Our Product Name
        CartViewAndDetails cartViewAndDetails = new CartViewAndDetails(webDriver);
        Boolean valMatch = cartViewAndDetails.viewCartAndValItem(myProduct);
        Assert.assertFalse(valMatch);
    }
}