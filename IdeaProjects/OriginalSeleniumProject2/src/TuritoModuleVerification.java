import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TuritoModuleVerification {
    public static WebDriver chromeDriver;
    public static JavascriptExecutor js;

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        chromeDriver = new ChromeDriver();
        js = (JavascriptExecutor) chromeDriver;
        String chapName = "Why Do We Fall Ill?";

        chromeDriver.get("https://www.turito.com");

        //Login Button
        WebElement logInButton = chromeDriver.findElement(By.xpath("//div[contains(@id,'next')]/div/div/div/div/header/nav/form[1]/button[1]"));

        js.executeScript("arguments[0].click();", logInButton);
        Thread.sleep(3000);
        // Email Input
        chromeDriver.findElement(By.xpath("//input[@id='emailInput']")).sendKeys("harshavardhank@turito.com");
        chromeDriver.findElement(By.xpath("//button[@class='signin_submitBtn__29clS']")).click();
        Thread.sleep(3000);

        // Password Input
        chromeDriver.findElement(By.xpath("//input[@name='password']")).sendKeys("Reset@123");
        chromeDriver.findElement(By.xpath("//button[@id='Login']")).click();
        Thread.sleep(3000);

        // Website Updates Toggle Yes/No
        chromeDriver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
        Thread.sleep(3000);

        // Okay switch Toggle
        WebElement toggleButton = chromeDriver.findElement(By.xpath("//*[contains(@id,'next')]/div[2]/div[4]/div[1]/div[2]/div[3]/button"));
        js.executeScript("arguments[0].click();", toggleButton);
        chromeDriver.manage().window().maximize();

        // Update Toggle
        Thread.sleep(3000);
        WebElement updateToggle = chromeDriver.findElement(By.xpath("//*[contains(@id,'next')]/div/div/div/button[2]"));
        js.executeScript("arguments[0].click();", updateToggle);

        // Class DropDown Select
        chromeDriver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
        Thread.sleep(3000);
        WebElement dropDownElement = chromeDriver.findElement(By.xpath("//*[contains(@id,'next')]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[3]"));
        js.executeScript("arguments[0].click();", dropDownElement);
        Thread.sleep(3000);

        //Subjects Button
        chromeDriver.findElement(By.xpath("//*[contains(@id,'next')]/div[1]/div[4]/div[1]/div[1]/ul/li[2]")).click();
        Thread.sleep(3000);

        // Total Chapters in Class 9,Biology
        int totalChapters = chromeDriver.findElements(By.xpath("//div[contains(@class,'card-test')]")).size();
        System.out.println("Total Chapters in Class 9,Biology is: " + totalChapters);
        System.out.println("=======================================================================================");

        List<WebElement> moduleNames = chromeDriver.findElements(By.xpath("//div[contains(@class,'cardTitle')]"));
        for(int i = 0; i<moduleNames.size();i++){
            String[] chapterName = moduleNames.get(i).getText().split(".");
            String formattedChapterName = chapterName[0].trim();
            System.out.println(formattedChapterName);
            if(moduleNames.contains("Why Do We Fall Ill?")){
                System.out.println(moduleNames.get(i).getText() +" Chapter Is Visible");
                chromeDriver.findElement(By.xpath("//div[contains(@id,'currentChapter ')]/div[1]/div[1]/div[1]/div/h4")).click();
            }
        }
    }
}
