import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://facebook.com");
            driver.findElement(By.id("email")).sendKeys("Kanakagirih@gmail.com");
            driver.findElement(By.id("pass")).sendKeys("9182203017");
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
