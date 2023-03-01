import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;

public class EcomTutorialUsingExplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();

        // Below is the WebDriverWait class and object we created to use the Explicit Wait.
        WebDriverWait webDriverWait = new WebDriverWait(chromeDriver, 5);

        chromeDriver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        String[] itemsNeeded = {"Cucumber", "Beetroot", "Carrot", "Tomato", "Beans", "Brinjal", "Potato", "Banana"};
        List<String> itemsNeededList = Arrays.asList(itemsNeeded);

        List<WebElement> itemNames = chromeDriver.findElements(By.xpath("//div[@class='product']/h4"));

        for (int i = 0; i < itemNames.size(); i++) {
            String[] getItemsNames = itemNames.get(i).getText().split("-");
            String formattedGetItemsNames = getItemsNames[0].trim();
            int j = 0;
            if (itemsNeededList.contains(formattedGetItemsNames)) {
                j++;
                chromeDriver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if (j == itemsNeededList.size()) {
                    break;
                }
            }
        }
        chromeDriver.findElement(By.xpath("//img[@alt='Cart']")).click();
        chromeDriver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

        // Below is the Syntax for the Explicit Wait for the Element
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));

        chromeDriver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
        chromeDriver.findElement(By.xpath("//button[@class='promoBtn']")).click();

        // Below is the Syntax for the Explicit Wait for the Element
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
        System.out.println(chromeDriver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
    }
}
