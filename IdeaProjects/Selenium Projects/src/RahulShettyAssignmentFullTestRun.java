import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RahulShettyAssignmentFullTestRun  {
    public static void main(String[] args) throws  Exception{
        System.setProperty("webdriver.chrome.driver","P://Selenium Complete Folder//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //Passengers Info
        chromeDriver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
        // Below were adding 6 Adults, 4 Child
        Thread.sleep(3000);
        for(int i = 1;i<6;i++) { // for 6 Adults
            chromeDriver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
        }
        Thread.sleep(3000);
        for(int j = 0;j<2;j++){ // for 2 Child
            chromeDriver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
        }
        chromeDriver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
        System.out.println(chromeDriver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());

        Thread.sleep(3000);

        //Departure city
        chromeDriver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(3000);
        chromeDriver.findElement(By.xpath(" //a[@value='HYD']")).click();

        //Arrival city
        Thread.sleep(3000);
        chromeDriver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        Thread.sleep(3000);
        chromeDriver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        Thread.sleep(3000);

        //Journey Start Date
        chromeDriver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-today')]")).click();
        Thread.sleep(3000);

        //CURRENCY
        WebElement currDropDown = chromeDriver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
        Select webSelect = new Select(currDropDown);
        webSelect.selectByValue("USD");
        Thread.sleep(3000);

        //Passenger Category
        chromeDriver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_StudentDiscount']")).click();
        Thread.sleep(3000);
        //Search Button
        chromeDriver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
    }
}
