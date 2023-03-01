import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

public class RedmineAddTasks {
    public static FileInputStream fis;
    public static XSSFWorkbook wb;
    public static XSSFSheet sheet;

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C://Users//HarshaVK//Harsha//Selenium Complete Folder//WebDrivers//chromedriver.exe");

        String userName = "Harshavardhank";
        String passWord = "Harsha@123";
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // URL
        chromeDriver.get("http://192.168.104.150:3000/projects/concept-videos/issues");

        // Login Page
        chromeDriver.findElement(By.xpath("//a[@class='login']")).click();
        chromeDriver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
        chromeDriver.findElement(By.xpath("//input[@name='password']")).sendKeys(passWord);
        chromeDriver.findElement(By.xpath("//input[@name='login']")).click();

        // New Tasks
        chromeDriver.findElement(By.xpath("//a[@class='new-issue']")).click();
        WebElement dropDownElement = chromeDriver.findElement(By.xpath("//select[@id='issue_tracker_id']"));
        Select dropdownSelect = new Select(dropDownElement);
        dropdownSelect.selectByVisibleText("Task");

        // Excel Data read and Parse to WebDriver
        fis = new FileInputStream("C://Users//HarshaVK//Desktop//RedmineTasks.xlsx");
        wb = new XSSFWorkbook(fis);
        sheet = wb.getSheet("Data2");

        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

        for (int i = 0; i < rowCount + 1; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < row.getLastCellNum(); j++) {
                String data = row.getCell(j).getStringCellValue();
//                System.out.println(data);
                chromeDriver.findElement(By.xpath("//input[@id='issue_subject']")).sendKeys(data);
                chromeDriver.findElement(By.xpath("//input[@name='continue']")).click();
            }
        }
    }
}
