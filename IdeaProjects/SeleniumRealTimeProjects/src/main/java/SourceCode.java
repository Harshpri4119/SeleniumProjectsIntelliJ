import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SourceCode {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "P:/Selenium Complete Folder/WebDrivers/chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://rahulshettyacademy.com/client");
        chromeDriver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        // Login
        chromeDriver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Kanakagirih@gmail.com");
        chromeDriver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("Harsha@123");
        chromeDriver.findElement(By.xpath("//input[@id='login']")).click();

        // Add to Cart
        List<WebElement> product_names = chromeDriver.findElements(By.xpath("//div[@class='card-body']/h5/b"));
        for (int i = 0; i < product_names.size(); i++) {
            String prod_name = product_names.get(i).getText();
//            System.out.println(prod_name);
            if (prod_name.contains("IPHONE 13 PRO")) {
                chromeDriver.findElements(By.xpath("//button[@class='btn w-10 rounded']")).get(i).click();
            }
        }

        Thread.sleep(5000);
        // View Cart
        chromeDriver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
        Thread.sleep(5000);
        // Buy Now
        chromeDriver.findElement(By.xpath("//div/ul/li/div/div[3]/button[@class='btn btn-primary']")).click();
        Thread.sleep(5000);
        // Billing Details
        chromeDriver.findElement(By.xpath("//form/div/div/div/input[@class='input txt text-validated']")).sendKeys("123456789");
        chromeDriver.findElement(By.xpath("//div/div[2]/input[@class='input txt']")).sendKeys("12345");
        chromeDriver.findElement(By.xpath("//div/div[3]/div/input[@class='input txt']")).sendKeys("Harsha Vardhan K");
        chromeDriver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("India");
        List<WebElement> countries = chromeDriver.findElements(By.xpath("//section/button/span"));
        Thread.sleep(6000);
        for (int i = 0; i < countries.size(); i++) {
            String country = countries.get(i).getText();
            if (country.contains("United States")) {
                chromeDriver.findElements(By.xpath("(//button[contains(@class,'ta-item')])[2]")).get(i).click();
            }
        }
        Thread.sleep(5000);
        chromeDriver.findElement(By.xpath("//a[contains(@class,'btnn')]")).click();

        String confirmMessage = chromeDriver.findElement(By.xpath("//h1[@class='hero-primary']")).getText();
        System.out.println(confirmMessage);
        Boolean valConfirm = confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER.");
        System.out.println(valConfirm);
        chromeDriver.close();
    }
}
