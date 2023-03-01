import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mail {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","P:/Selenium Complete Folder/WebDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        String url = driver.getCurrentUrl();
        System.out.println("Url: " + url);
        String notify = driver.getTitle();
        System.out.println("Title: " + notify);


    }
}
