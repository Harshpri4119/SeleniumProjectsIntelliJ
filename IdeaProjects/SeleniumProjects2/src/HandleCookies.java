import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCookies {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        ChromeDriver driver = new ChromeDriver();
        chromeDriver.get("https://www.google.co.uk");

        // Add Cookies
//        chromeDriver.manage().addCookie();

        // Delete specific Cookie
        chromeDriver.manage().deleteCookieNamed("asdasd");

        // Delete All Cookie
        chromeDriver.manage().deleteAllCookies();
    }
}
