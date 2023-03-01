import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAssignment {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(3000);

        //selecting the Checkbox
        chromeDriver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        boolean checkStatus1 = chromeDriver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();
        System.out.println("The CheckBox is Selected: " + checkStatus1);

        //Unselecting the Checkbox
        chromeDriver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        boolean checkStatus2 = chromeDriver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();
        System.out.println("The CheckBox is Selected: " + checkStatus2);

        //Count of Checkbox
        int totalCheckBox = chromeDriver.findElements(By.xpath("//input[@type='checkbox']")).size();
        System.out.println("Total CheckBoxes are: " + totalCheckBox);
    }
}
