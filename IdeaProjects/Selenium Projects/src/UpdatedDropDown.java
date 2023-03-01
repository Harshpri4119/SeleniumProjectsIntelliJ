import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDown {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        try{
            driver.findElement(By.id("divpaxinfo")).click();
            System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
            Thread.sleep(5000);
            for(int i=1;i<4;i++){  // for adults
                driver.findElement(By.id("hrefIncAdt")).click();
            }
            System.out.println(driver.findElement(By.id("divpaxinfo")).getText());  // for val in print to check adults

            for(int j=0;j<4;j++){ // for child
                driver.findElement(By.id("hrefIncChd")).click();
            }
            System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); // for val in print to check child

            for(int k=0;k<2;k++){ // for babys
                driver.findElement(By.id("hrefIncInf")).click();
            }

            driver.findElement(By.id("btnclosepaxoption")).click();
            System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); // for val in print to check baby
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
