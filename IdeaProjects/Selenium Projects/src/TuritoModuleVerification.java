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
        chromeDriver.get("https://www.turito.com");

        String classYouWant = "Class 8";
        String subjectYouWant = "Mathematics";
        String chapterYouWant = "Rational Numbers";
        String moduleYouWant = "Operations on Rational Numbers - Multiplication & Division";

        // Login Button
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

        String webPageName = chromeDriver.getTitle();
        System.out.println("WebPage is: " + webPageName.toUpperCase());

        // Class DropDown Select
        chromeDriver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
        Thread.sleep(3000);
        List<WebElement> dropDownElements = chromeDriver.findElements(By.xpath("//div[@class='dropdown-item  courseListItem ']"));
        for (int i = 0; i < dropDownElements.size(); i++) {
            try {
                String classDropDrown = dropDownElements.get(i).getText();
                if (classDropDrown.toLowerCase().contains(classYouWant.toLowerCase())) {
                    chromeDriver.findElements(By.xpath("//div[@class='dropdown-item  courseListItem ']")).get(i).click();
                    System.out.println(classYouWant.toUpperCase() + " is Selected");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Thread.sleep(3000);

        //Subjects Button
        chromeDriver.findElement(By.xpath("//*[contains(@id,'next')]/div[1]/div[4]/div[1]/div[1]/ul/li[2]")).click();
        Thread.sleep(3000);

        //Subject change
        List<WebElement> subjects = chromeDriver.findElements(By.xpath("//a[@class='clickable']"));
        for (int i = 0; i < subjects.size(); i++) {
            try {
                String subjectsWeGot = subjects.get(i).getText();
                if (subjectsWeGot.toLowerCase().contains(subjectYouWant.toLowerCase())) {
                    chromeDriver.findElements(By.xpath("//a[@class='clickable']")).get(i).click();
                    System.out.println("Subject: " + subjectYouWant.toUpperCase() + " is Selected");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Thread.sleep(3000);

        //Chapter Select
        List<WebElement> chapters = chromeDriver.findElements(By.xpath("//div[@class='card-body py-0 d-flex align-items-end clickable']"));
        for (int i = 0; i < chapters.size(); i++) {
            try {
                String chaptersNames = chapters.get(i).getText();
                if (chaptersNames.toLowerCase().contains(chapterYouWant.toLowerCase())) {
                    WebElement chapElements = chromeDriver.findElements(By.xpath("//div[@class='card-body py-0 d-flex align-items-end clickable']")).get(i);
                    js.executeScript("arguments[0].click();", chapElements);
                    System.out.println("Chapter: " + chapterYouWant.toUpperCase() + " is Visible/ Selected");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        Thread.sleep(3000);

        //Module Select
        List<WebElement> module = chromeDriver.findElements(By.xpath("//div[@class='d-flex subvideos-flex col flex-grow-1 pr-w-0']"));

        for (int i = 0; i < module.size(); i++) {
            try {
                String moduleNames = module.get(i).getText();
                if (moduleNames.toLowerCase().contains(moduleYouWant.toLowerCase())) {
                    WebElement modElements = chromeDriver.findElements(By.xpath("//div[@class='d-flex subvideos-flex col flex-grow-1 pr-w-0']")).get(i);
                    js.executeScript("arguments[0].click();", modElements);
                    System.out.println("Module: " + moduleYouWant.toUpperCase() + " is Visible/ Selected");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
