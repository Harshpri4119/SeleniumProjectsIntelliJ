import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RahulShettyLogInPageWaitAssignment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        WebDriverWait webDriverWait = new WebDriverWait(chromeDriver, 5);

        chromeDriver.get("https://rahulshettyacademy.com/loginpagePractise/");
        //Login Page
        chromeDriver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
        chromeDriver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
        chromeDriver.findElement(By.xpath("//span[contains(text(),'User')]")).click();

        //Toggle Button
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
        chromeDriver.findElement(By.xpath("//button[@id='okayBtn']")).click();

        WebElement dropDown = chromeDriver.findElement(By.xpath("//select[contains(@class,'form-control')]"));
        Select selectItem = new Select(dropDown);
        selectItem.selectByValue("consult");

        chromeDriver.findElement(By.xpath("//input[@id='terms']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='signInBtn']")).click();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card h-100']")));
        List<WebElement> itemsElements = chromeDriver.findElements(By.xpath("//div[@class='card h-100']"));
        for (int i = 0; i< itemsElements.size(); i++){
            int j = 0;
            System.out.println(itemsElements.get(i).getText());
            chromeDriver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
        }
        // Cart
        chromeDriver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
    }
}
