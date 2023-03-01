import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class ScreenShot {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.netflix.com");

        // Below is the Syntax to Create a jpg file for screenShot
        File file = ((TakesScreenshot)chromeDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("C://Users//91912//Desktop//screenShot.jpg"));

    }
}
