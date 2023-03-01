import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class IdentifyBrokenLinks {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // URL
        chromeDriver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //Step 1 - Is to get URL's tied up to the links using Selenium
        // Step 2 -  Java methods will call URL's and gets you the status code
        // Step 3 - if status code => 400 then that url is not working-> link which tied to url is broken

        // get links in WebPage using Selenium
        String urls = chromeDriver.findElement(By.cssSelector("a[href*='appium']")).getAttribute("href");

        HttpURLConnection httpURLConnection =(HttpURLConnection) new URL(urls).openConnection();
        httpURLConnection.setRequestMethod("HEAD");
        httpURLConnection.connect();   // connect to the link

        // Get Response Code of the link
        int code = httpURLConnection.getResponseCode();

        // Print Response code
        System.out.println(code);

    }
}
