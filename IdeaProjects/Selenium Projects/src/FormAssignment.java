import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormAssignment {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rahulshettyacademy.com/angularpractice/");
        chromeDriver.manage().window().maximize();
        Thread.sleep(5000);
        chromeDriver.findElement(By.xpath("//input[@name='name']")).sendKeys("Harsha Vardhan");
        chromeDriver.findElement(By.xpath("//input[@name='email']")).sendKeys("Kanakagirih@gmail.com");
        chromeDriver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("123456789");
        chromeDriver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
        chromeDriver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']")).click();
        chromeDriver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']/option[2]")).click();
        chromeDriver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
        chromeDriver.findElement(By.xpath("//input[@name='bday']")).sendKeys("12/16/1997");
        chromeDriver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
    }
}
