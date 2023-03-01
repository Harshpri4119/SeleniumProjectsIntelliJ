import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HttpsHandleInsecureBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");

        // below we got a 'ChromeOptions' from that we are implementing setAcceptInsecureCerts(true); to accept insecure browsers.
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setAcceptInsecureCerts(true);

        WebDriver chromeDriver = new ChromeDriver(chromeOptions);   // passing chromeOptions to Driver to implement the setAcceptInsecureCerts(); to accept insecure browers.

        chromeDriver.get("https://expired.badssl.com");
        System.out.println(chromeDriver.getTitle());
    }
}
