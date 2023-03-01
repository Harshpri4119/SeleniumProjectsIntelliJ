import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Scroll {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) chromeDriver;

        chromeDriver.get("https://rahulshettyacademy.com/AutomationPractice/");

        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement element = chromeDriver.findElement(By.xpath("//div[@class='tableFixHead']"));

        //scroll window using coordinates.
        js.executeScript("arguments[0].scrollIntoView()",element);

        List<WebElement> addElements = chromeDriver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
        int sum = 0;
        for (WebElement numbers : addElements){
            sum = sum + Integer.parseInt(numbers.getText());
        }
        System.out.println(sum);
        String totalNumber = chromeDriver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(": ")[1].trim();

        if(sum == Integer.parseInt(totalNumber)){
            System.out.println(sum + " and " + totalNumber + " are Same");
        }else{
            System.out.println(" Error occur !!!!");
        }
    }
}
