import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllBrowsersDemo {
    public static void main(String[] args){

        //  1. Below is FIREFOX BROWSER AUTOMATION
        System.setProperty("webdriver.gecko.driver","P://Selenium Complete Folder//WebDrivers//geckodriver.exe");
        try{
            WebDriver fireFoxDriver = new FirefoxDriver();

            fireFoxDriver.get("https://google.com");
            System.out.println("1.FireFox Driver Title: " + fireFoxDriver.getTitle());
        }catch (Exception e){
            System.out.println(" Exception is " + e);
        }

        //  2.  Below is MS EDGE BROWSER AUTOMATION
        System.setProperty("webdriver.edge.driver","P://Selenium Complete Folder//WebDrivers//msedgedriver.exe");
        try{
            WebDriver edgeDriver = new EdgeDriver();
            edgeDriver.get("https://google.com");
            System.out.println("2.MS Edge Driver Title: " +  edgeDriver.getTitle());
        }catch (Exception e){
            System.out.println("Exception is " + e);
        }

        //  3. Below is CHROME BROWSER AUTOMATION
        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        try{
            WebDriver chromeDriver = new ChromeDriver();
            chromeDriver.get("https://google.com");
            System.out.println("2.Chrome Driver Title: " +  chromeDriver.getTitle());
        }catch (Exception e){
            System.out.println("Exception is " + e);
        }

    }
}
