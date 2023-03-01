import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopUps {
    public static void main(String[] args){
        String name = "Harsha";
        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
        chromeDriver.manage().window().maximize();

        chromeDriver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
        chromeDriver.findElement(By.xpath("//input[@id='alertbtn']")).click();

        // Below is syntax for Handling Popups: switchTo().alert()
        System.out.println(chromeDriver.switchTo().alert().getText());  // getText() - to get text from the PopUps
        chromeDriver.switchTo().alert().accept(); // accept(): to click Positive response like (ok/yes) from the PopUps
        chromeDriver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
        System.out.println(chromeDriver.switchTo().alert().getText());
        chromeDriver.switchTo().alert().dismiss(); // dismiss(): to click Negative response like (No/Cancel) from the PopUps

    }
}
