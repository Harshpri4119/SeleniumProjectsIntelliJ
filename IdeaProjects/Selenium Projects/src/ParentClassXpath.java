import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentClassXpath {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try{
            driver.get("https://www.google.com");
            driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("Sunny Leone");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//div[@class='L3eUgb']/div[4]/style")).click();
            driver.findElement(By.xpath("")).click();
            driver.findElement(By.cssSelector("")).click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
