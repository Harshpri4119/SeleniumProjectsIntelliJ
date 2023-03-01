import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try{

            driver.get("https://facebook.com");

            System.out.println("Title " + driver.getTitle());         // to check title of url is correct.

            System.out.println("Current URL " + driver.getCurrentUrl());   // to validate weather given url is correct.

//            System.out.println("Page Source " + driver.getPageSource());  // to get page source of website.

            driver.get("https://instagram.com");

            System.out.println("Title " + driver.getTitle());         // to check title of url is correct.

            System.out.println("Current URL " + driver.getCurrentUrl());   // to validate weather given url is correct.

            driver.navigate().to("https://netflix.com");
            driver.navigate().back();      /// navigates back from the current url
            driver.navigate().forward();    /// navigates forward from the current url
            driver.close();       /// it closes current browser
//            driver.quit();        /// it closes all browsers opened by selenium



        }catch (Exception e){
            System.out.println("Exception: " + e);
        }

    }
}
