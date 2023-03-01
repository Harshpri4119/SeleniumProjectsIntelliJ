import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class GetScreenShot {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();

        // URL
        chromeDriver.get("https://www.netflix.com");

        // Below is the Syntax for Screen Shot using, File and File Utils.
        File src = ((TakesScreenshot)chromeDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C://Users//91912//Desktop//netflix.png"));
    }
}
