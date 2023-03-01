import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class E_ComTutorial1 {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rahulshettyacademy.com/seleniumPractise/");
        Thread.sleep(3000);

        String[] items = {"Cucumber","Carrot","Tomato","Beans","Brinjal","Capsicum","Banana"};
        List<String> itemsList = Arrays.asList(items);
        List<WebElement> name = chromeDriver.findElements(By.xpath("//div[@class='product']"));

        for (int i = 0;i<name.size();i++) {

            String[] itemsName = name.get(i).getText().split("-");
            String formattedItemsName = itemsName[0].trim();
            System.out.println("Item: " + formattedItemsName);

            int k = 0;
            if(itemsList.contains(formattedItemsName)){
                k++;
                chromeDriver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if (k==itemsList.size()){
                    break;
                }
            }
        }
    }
}
