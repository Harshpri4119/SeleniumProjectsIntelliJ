import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ScopeAssignment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        // Step 1
        String options = chromeDriver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
        chromeDriver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();

        // Step 2
        WebElement dropDownElement = chromeDriver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Select select = new Select(dropDownElement);
        List<WebElement> elements = dropDownElement.findElements(By.xpath("//select[@id='dropdown-class-example']/option"));
        for (int i = 0; i< elements.size(); i++){
            String webElement = elements.get(i).getText();
            if(webElement.contains(options)){
                select.getOptions().get(i).click();
            }
        }

        //Step 3
        chromeDriver.findElement(By.xpath("//input[@id='name']")).sendKeys(options);
        chromeDriver.findElement(By.cssSelector("input[id='alertbtn']")).click();

        //Step 4
        String alertText = chromeDriver.switchTo().alert().getText();
        chromeDriver.switchTo().alert().accept();

        if(alertText.contains(options)){
            System.out.println(options + " is Present in the Alert.");
        }
    }
}
