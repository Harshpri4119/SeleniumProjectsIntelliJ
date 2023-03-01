import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTableHandle {
    public static void main(String[] args) {
        String driver = "webdriver.chrome.driver";
        String chromePath = "P://Selenium Complete Folder//WebDrivers//chromedriver.exe";
        String url = "https://rahulshettyacademy.com/seleniumPractise/#/offers";
        System.setProperty(driver, chromePath);
        String priceOfItem = "rice";

        WebDriver chromeDriver = new ChromeDriver();
        // Url
        chromeDriver.get(url);

        System.out.println(" Items before sort: ");


        // grab the items in the table before clicking on the filter
        List<WebElement> itemsBeforeFilter = chromeDriver.findElements(By.xpath("//tbody/tr/td[1]"));
        for (int i = 0; i < itemsBeforeFilter.size(); i++) {
            String itemsBefore = itemsBeforeFilter.get(i).getText();
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

        if (itemsBeforeFilter.equals(itemsAfterFilter)) {
            System.out.println(" items not sorted ");
        } else if (itemsBeforeFilter != itemsAfterFilter) {
            System.out.println(" items are sorted ");
        }
    }
    //
}
