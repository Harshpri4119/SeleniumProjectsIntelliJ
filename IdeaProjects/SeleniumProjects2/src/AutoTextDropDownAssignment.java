import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutoTextDropDownAssignment {
    public static void main(String[] args) {
        String myCountry = "united states";
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        chromeDriver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("uni");
        List<WebElement> autoElements = chromeDriver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
        for (int i = 0; i < autoElements.size(); i++) {
            String autoElement = autoElements.get(i).getText();
            if (autoElement.toLowerCase().contains(myCountry.toLowerCase())){
                chromeDriver.findElements(By.xpath("//ul[@id='ui-id-1']/li")).get(i).click();
                System.out.println(myCountry + " is selected");
            }
        }
    }
}
