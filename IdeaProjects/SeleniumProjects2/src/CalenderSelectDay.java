import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CalenderSelectDay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();

        String myMonth = "July";
        String phraseText = " is Selected";

        // URL
        chromeDriver.get("https://www.path2usa.com/travel-companions");

        // Select Month
        chromeDriver.findElement(By.xpath("//input[@id='travel_date']")).click();

        while (!chromeDriver.findElement(By.cssSelector("div[class='datepicker-days'] [class='datepicker-switch']")).getText().contains(myMonth)) {
            chromeDriver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next'] ")).click();
        }
        System.out.println(myMonth + phraseText);

        // Select Date
        //Grab common attribute//Put into list and iterate
        int count = chromeDriver.findElements(By.className("day")).size();

        for (int i = 0; i < count; i++) {
            String text = chromeDriver.findElements(By.className("day")).get(i).getText();
            if (text.equalsIgnoreCase("21")) {
                chromeDriver.findElements(By.className("day")).get(i).click();
                break;
            }

        }
    }
}
