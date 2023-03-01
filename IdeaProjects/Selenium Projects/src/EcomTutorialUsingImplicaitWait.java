import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class EcomTutorialUsingImplicaitWait {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();

        // Below is the syntax for the implicit wait
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        chromeDriver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        String[] itemsNeeded = {"Cucumber","Beetroot","Carrot","Tomato","Beans","Brinjal","Potato","Banana"};
        List<String> itemsNeededList = Arrays.asList(itemsNeeded);

        List<WebElement> itemNames = chromeDriver.findElements(By.xpath("//div[@class='product']/h4"));

        for(int i = 0;i<itemNames.size();i++){
            String[] getItemsNames = itemNames.get(i).getText().split("-");
            String formattedGetItemsNames = getItemsNames[0].trim();
            System.out.println("Items : " + formattedGetItemsNames);
            int j = 0;
            if(itemsNeededList.contains(formattedGetItemsNames)){
                j++;
                chromeDriver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if(j==itemsNeededList.size()){
                    break;
                }
            }
        }
        chromeDriver.findElement(By.xpath("//img[@alt='Cart']")).click();
        chromeDriver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        chromeDriver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
        chromeDriver.findElement(By.xpath("//button[@class='promoBtn']")).click();
    }
}
