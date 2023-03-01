import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");


        try{
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.turito.com");

            String  d = driver.getCurrentUrl();
            String e = driver.getPageSource();
            String f = driver.getWindowHandle();

            System.out.println(d);
            System.out.println(e);
            System.out.println(f);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
