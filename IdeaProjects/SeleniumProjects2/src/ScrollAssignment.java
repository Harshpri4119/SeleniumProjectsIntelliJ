import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ScrollAssignment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) chromeDriver;

        // URL
        chromeDriver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Scroll to table
        WebElement tableFind = chromeDriver.findElement(By.xpath("//table[@name='courses']"));
        js.executeScript("arguments[0].scrollIntoView();", tableFind);

        // Rows
        List<WebElement> rowsElements = chromeDriver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
        System.out.println("Total Rows: " + rowsElements.size());

        // Colums
        List<WebElement> columnsElements = chromeDriver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th"));
        System.out.println("Total Colums: " + columnsElements.size());

        // Get 2nd Row Data
        System.out.println(rowsElements.get(2).getText());


    }
}
