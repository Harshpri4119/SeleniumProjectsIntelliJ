import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class TuritoLogin {
    public static WebDriver chromeDriver;
    public static JavascriptExecutor js;

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        chromeDriver = new ChromeDriver();
        js = (JavascriptExecutor) chromeDriver;
        chromeDriver.get("https://www.turito.com/");

        // Login Button
        WebElement logInButton = chromeDriver.findElement(By.xpath("//div[contains(@id,'next')]/div/div/div/div/header/nav/form[1]/button[1]"));
        js.executeScript("arguments[0].click();", logInButton);
        Thread.sleep(5000);

        // Email Input
        chromeDriver.findElement(By.xpath("//input[@id='emailInput']")).sendKeys("harshavardhank@turito.com");
        chromeDriver.findElement(By.xpath("//button[@class='signin_submitBtn__29clS']")).click();
        Thread.sleep(5000);

        //Password Input
        chromeDriver.findElement(By.xpath("//input[@name='password']")).sendKeys("Reset@123");
        chromeDriver.findElement(By.xpath("//button[@id='Login']")).click();
        Thread.sleep(5000);

        //Website Updates Toggle Yes/No
        chromeDriver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
        Thread.sleep(5000);

        //Okay switch Toggle
        WebElement toggleButton = chromeDriver.findElement(By.xpath("//*[contains(@id,'next')]/div[2]/div[4]/div[1]/div[2]/div[3]/button"));
        js.executeScript("arguments[0].click();", toggleButton);
        chromeDriver.manage().window().maximize();
        // Update Toggle
        Thread.sleep(5000);
        WebElement updateToggle = chromeDriver.findElement(By.xpath("//*[contains(@id,'next')]/div/div/div/button[2]"));
        js.executeScript("arguments[0].click();", updateToggle);

        String getTitle = chromeDriver.getTitle();
        String getWindowHandles = chromeDriver.getWindowHandles().toString();

        System.out.println("Web Page Title: " + getTitle);
        System.out.println("Web Page Window Handle: " + getWindowHandles);

        chromeDriver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
        Thread.sleep(3000);
        WebElement dropDownElement = chromeDriver.findElement(By.xpath("//*[contains(@id,'next')]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[3]"));
        js.executeScript("arguments[0].click();", dropDownElement);
        Thread.sleep(3000);
        //Subjects//
        chromeDriver.findElement(By.xpath("//*[contains(@id,'next')]/div[1]/div[4]/div[1]/div[1]/ul/li[2]")).click();
        Thread.sleep(3000);
        WebElement chapterDropdown = chromeDriver.findElement(By.xpath("//*[contains(@id,'next')]/div[1]/div[4]/div[2]/main/div/div/div/div/div[2]/div[1]/div[1]"));
        js.executeScript("arguments[0].scrollIntoView()", chapterDropdown);
        Thread.sleep(3000);
        js.executeScript("arguments[0].click();", chapterDropdown);
        Thread.sleep(3000);
        WebElement modules = chromeDriver.findElement(By.xpath("//*[contains(@id,'currentChapter')]/div[3]"));
        System.out.println(modules.getText());
//        String[] moduleNameNeeded = {"Endomembrane System", "Tonicity", "Plasma Membrane And Transportation Through It"};
//        List<String> mNn = Arrays.asList(moduleNameNeeded);

//        String[] mName = modules.getText().split("//.");
//        String formattedMname = mName[1].trim();
//        System.out.println(formattedMname);
//        if (mNn.contains(formattedMname)) {
//            System.out.println("Module is Present");
//        }

    }
}