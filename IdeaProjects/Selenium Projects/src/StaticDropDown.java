import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        try{
            WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
            Select dropdown = new Select(staticDropdown); // here adding agr above webelement location so that to select class to implement its objects.
            // below is selecting a dropdown by index - 0,1,2,3, ----- etc.
            dropdown.selectByIndex(1);
            System.out.println(dropdown.getFirstSelectedOption().getText());
            // below is selecting a dropdown by value - using inspect element on given value for the dropdown texts.
            dropdown.selectByValue("USD");
            System.out.println(dropdown.getFirstSelectedOption().getText());
            // below is selecting a dropdown using visible text on the given dropdown.
            dropdown.selectByVisibleText("AED");
            System.out.println(dropdown.getFirstSelectedOption().getText());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
