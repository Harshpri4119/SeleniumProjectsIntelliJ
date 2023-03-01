import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greythr {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://turito.greythr.com/uas/portal/auth/login?login_challenge=ca9b83a37aad49d6a722a40bf0cf71ab");
            driver.findElement(By.cssSelector("#username")).sendKeys("700323");
            driver.findElement(By.cssSelector("#password")).sendKeys("Harsha@123");

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
