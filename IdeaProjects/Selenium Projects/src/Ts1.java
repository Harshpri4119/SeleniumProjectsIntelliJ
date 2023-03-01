import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ts1 {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.primevideo.com");
        try{
            driver.findElement(By.xpath("//a[@class='dv-copy-button']")).click();
            driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9182203017");
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9440183118");
            driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
            driver.findElement(By.linkText("TV Shows")).click();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
