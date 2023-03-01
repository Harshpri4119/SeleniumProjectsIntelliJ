import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        String webPageName = chromeDriver.getTitle();
        System.out.println("WebPage Name: " + webPageName);

        chromeDriver.findElement(By.xpath("//input[contains(@id,'StudentDiscount')]")).click();

        boolean checkStatus = chromeDriver.findElement(By.xpath("//input[contains(@id,'StudentDiscount')]")).isSelected();
        System.out.println("The Check Box is selected: "+ checkStatus);

        int totalCheckBox = chromeDriver.findElements(By.xpath("//input[@type='checkbox']")).size();
        System.out.println("The Total Check Boxs are: "+ totalCheckBox);
    }
}
