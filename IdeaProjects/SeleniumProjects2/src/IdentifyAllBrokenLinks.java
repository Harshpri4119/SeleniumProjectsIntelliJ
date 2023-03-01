import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class IdentifyAllBrokenLinks {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // URL
        chromeDriver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //Step 1 - Is to get all URL's tied up to the urlElements using Selenium
        // Step 2 -  Java methods will call All the URL's and gets you the status code
        // Step 3 - if status code => 400 then that url is not working-> link which tied to url is broken

        // Get All the Links
        List<WebElement> urlElements = chromeDriver.findElements(By.xpath("//li[@class='gf-li']/a"));
        for (int i = 0; i < urlElements.size(); i++) {

            String url = urlElements.get(i).getAttribute("href");
            String name = urlElements.get(i).getText();

            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
            httpURLConnection.setRequestMethod("HEAD");
            httpURLConnection.connect();
            int respCode = httpURLConnection.getResponseCode();

            if (respCode > 400) {
                System.out.println(name + " The link was Broken" + " Where Response Code was " + respCode);
            } else {
                System.out.println(name + " The link was loading Fine" + " Where Response Code was " + respCode);
            }


        }
    }
}
