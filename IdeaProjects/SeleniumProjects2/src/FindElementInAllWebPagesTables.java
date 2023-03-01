import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElementInAllWebPagesTables {
    public static void main(String[] args) {
        String driver = "webdriver.chrome.driver";
        String chromePath = "P://Selenium Complete Folder//WebDrivers//chromedriver.exe";
        String url = "https://rahulshettyacademy.com/seleniumPractise/#/offers";
        System.setProperty(driver, chromePath);
        String priceOfItem = "rice";

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get(url);
        JavascriptExecutor js = (JavascriptExecutor) chromeDriver;
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        System.out.println(" Items before sort: ");

        // grab the items in the table before clicking on the filter
        List<WebElement> itemsBeforeFilter = chromeDriver.findElements(By.xpath("//tbody/tr/td[1]"));
        for (WebElement webElement : itemsBeforeFilter) {
            String itemsBefore = webElement.getText();
            System.out.println(itemsBefore);
        }

        System.out.println("=======================================================");
        System.out.println(" Items after sort: ");

        // clicking on filter
        chromeDriver.findElement(By.xpath("//th[@role='columnheader'][1]")).click();

        // grab the items in the table after the clicking the filter
        List<WebElement> itemsAfterFilter = chromeDriver.findElements(By.xpath("//tbody/tr/td[1]"));
        for (int i = 0; i < itemsBeforeFilter.size(); i++) {
            String itemsAfter = itemsAfterFilter.get(i).getText();
            System.out.println(itemsAfter);
        }
        System.out.println("=======================================================");
        List<WebElement> price;
        do {
            price = chromeDriver.findElements(By.xpath("//tbody/tr/td[1]"));
            for (int i = 0; i < price.size(); i++) {
                String rate = price.get(i).getText();
                if (rate.toLowerCase().contains(priceOfItem.toLowerCase())) {
                    String itemsRate = chromeDriver.findElements(By.xpath("//tbody/tr/td[1]/following-sibling::td[1]")).get(i).getText();
                    System.out.println(priceOfItem + " Price is :: " + itemsRate);
                }
            } // !price.toString().equalsIgnoreCase(priceOfItem)
            if (price.size() > 1) {
                WebElement element = chromeDriver.findElement(By.xpath("//a[@aria-label='Next']"));
                js.executeScript("arguments[0].click();", element);
            }
        } while (price.size() > 1);
    }
}
