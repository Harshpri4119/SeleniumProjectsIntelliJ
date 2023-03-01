import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSuggestiveDropDown  {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromedriver = new ChromeDriver();
        chromedriver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        chromedriver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ind");
        Thread.sleep(3000);
        List<WebElement> options = chromedriver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
        for(WebElement option : options){
            if(option.getText().equalsIgnoreCase("India")){
                option.click();
                break;
            }
        }
    }
}
