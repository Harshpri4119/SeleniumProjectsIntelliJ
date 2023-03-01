package Tests;

import PageOjectModel.BillingPortal;
import PageOjectModel.CartViewAndDetails;
import PageOjectModel.OrderConfirmation;
import PageOjectModel.ProductCatalogue;
import TestComponents.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class StandAloneTest extends BaseTest {

    @Test(dataProvider = "getData")
    public void submitOrder(HashMap<String, String> input) {
        String myProduct = "IPHONE 13 PRO";
        String myCountry = "India";
        String orderConfo = "THANKYOU FOR THE ORDER.";

        // Login
        loginPage.loginPortal(input.get("email"), input.get("passWord"));
        // Product Catalogue Items and Add to Cart
        ProductCatalogue productCatalogue = new ProductCatalogue(webDriver);
        List<WebElement> products = productCatalogue.getProductList();
        productCatalogue.addToCart(input.get("productName"));
        productCatalogue.goToCart();
        // View Cart and Validate Cart Items with Our Product Name
        CartViewAndDetails cartViewAndDetails = new CartViewAndDetails(webDriver);
        Boolean valMatch = cartViewAndDetails.viewCartAndValItem(input.get("productName"));
        Assert.assertTrue(valMatch);
        cartViewAndDetails.checkOutPage();
        // Billing Details
        BillingPortal billingPortal = new BillingPortal(webDriver);
        billingPortal.selectTheCountry(myCountry);
        billingPortal.submitOrder();

        /* WebElement placeOrder = chromeDriver.findElement(By.xpath("//a[contains(@class,'btnn')]"));
        javascriptExecutor.executeScript("arguments[0].click();", placeOrder); */

        // Confirm Order
        OrderConfirmation orderConfirmation = new OrderConfirmation(webDriver);
        String confoMessage = orderConfirmation.orderConfroMessage();
        Assert.assertTrue(confoMessage.equalsIgnoreCase(orderConfo));
    }

    @Test(dependsOnMethods = "submitOrder")
    public void OrderHistoryCheck() throws Exception {
        // code to check the order history of user
    }

//    @DataProvider  // passing two diff data sets to run
//    public Object[][] getData(){
//        return new Object[][] {{"Kanakagirih@gmail.com","Harsha@123","IPHONE 13 PRO"},
//                {"Kanakagiriharsha@gmail.com","123123","ADIDAS ORIGINAL"}};
//    }

//    @DataProvider  // passing two diff data sets using HashMap
//    public Object[][] getData(){
//        HashMap<String, String> userData1 = new HashMap<String,String>();
//        userData1.put("email","Kanakagirih@gmail.com");
//        userData1.put("passWord","Harsha@123");
//        userData1.put("productName","IPHONE 13 PRO");
//
//        HashMap<String,String> userData2 = new HashMap<String,String>();
//        userData2.put("email","Kanakagiriharsha@gmail.com");
//        userData2.put("passWord","123123");
//        userData2.put("productName","ADIDAS ORIGINAL");
//
//        return new Object[][]{{userData1},{userData2}};
//    }

    @DataProvider  // passing two diff data sets using HashMap
    public Object[][] getData() throws IOException {

        List<HashMap<String, String>> data = getJsonDataToMap(System.getProperty("user.dir") + "src//main//java//JsonData//Data.json");
        return new Object[][]{{data.get(0)}, {data.get(1)}};
    }

}
