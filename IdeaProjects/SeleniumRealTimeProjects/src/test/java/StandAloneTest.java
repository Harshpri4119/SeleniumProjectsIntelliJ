import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class StandAloneTest {
    public static void main(String[] args) {
        String myProduct = "IPHONE 13 PRO";
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) chromeDriver;
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait explicitWait = new WebDriverWait(chromeDriver, Duration.ofSeconds(5));

        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://rahulshettyacademy.com/client");

        // Login
        chromeDriver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Kanakagirih@gmail.com");
        chromeDriver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("Harsha@123");
        chromeDriver.findElement(By.xpath("//input[@id='login']")).click();

        // Add to Cart Using For Loop
        List<WebElement> product_names = chromeDriver.findElements(By.xpath("//div[contains(@class,'mb-3')]"));
        /* for (int i = 0; i < product_names.size(); i++) {
            String prod_name = product_names.get(i).getText();
//            System.out.println(prod_name);
            if (prod_name.contains("IPHONE 13 PRO")) {
                chromeDriver.findElements(By.xpath("//button[@class='btn w-10 rounded']")).get(i).click();
            }
        }  /*
         */

        // Or  Add to Cart Using Latest Updated Java Code by Java Streams concept
        WebElement productName = product_names.stream().filter(product ->
                product.findElement(By.cssSelector("b")).getText().equals(myProduct)).findFirst().orElse(null);
        productName.findElement(By.cssSelector(".card-body button:last-of-type")).click();

        // Wait for the Toast and Buffer Elements to gone.
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
        explicitWait.until(ExpectedConditions.invisibilityOf(chromeDriver.findElement(By.cssSelector(".ng-animating"))));

        // View Cart
        explicitWait.until(ExpectedConditions.visibilityOf(chromeDriver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")))).click();

        // Cart Item Validation Using Our Product Name
        List<WebElement> cartProducts = chromeDriver.findElements(By.cssSelector(".cartSection h3"));
        Boolean valMatch = cartProducts.stream().anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(myProduct));
        Assert.assertTrue(valMatch);
        chromeDriver.findElement(By.cssSelector(".totalRow button")).click();

        // Billing Details
        Actions actions = new Actions(chromeDriver);
        actions.sendKeys(chromeDriver.findElement(By.xpath("//input[@placeholder='Select Country']"))).sendKeys("India").build().perform();
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[contains(@class,'ta-results')]")));
        chromeDriver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'btnn')]")));
        WebElement placeOrder = chromeDriver.findElement(By.xpath("//a[contains(@class,'btnn')]"));
        javascriptExecutor.executeScript("arguments[0].click();",placeOrder);

        // Confirm Order
        String confirmMessage = chromeDriver.findElement(By.xpath("//h1[@class='hero-primary']")).getText();
        System.out.println(confirmMessage);
        Boolean valConfirm = confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER.");
        System.out.println(valConfirm);
        Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
        chromeDriver.quit();

    }
}
