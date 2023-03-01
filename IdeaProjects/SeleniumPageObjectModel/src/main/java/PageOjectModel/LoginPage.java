package PageOjectModel;

import ReusablePackage.ReuseableClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends ReuseableClass {

     WebDriver chromeDriver;

    public LoginPage(WebDriver chromeDriver) {
        super(chromeDriver);
        this.chromeDriver = new ChromeDriver();
        //   PageFactory.initElements(chromeDriver,this);  // if we use @FindBy() annotation to create WebElements like show lelow.
    }

    WebElement userEmail;
    WebElement userPassword;
    WebElement submitButton;
    WebElement errorMessage;

    // Creating a Constructor to Initialize the ChromeDriver in this Class from 'StandAloneTest' Class.


    // Or We can Create a WebElement by using PageFactory way.
    // like below.
//    @FindBy(xpath = "//input[@id='userEmail']")
//    WebElement userEmails;

    public void goToURL() {
        chromeDriver.get("https://rahulshettyacademy.com/client");
    }

    public ProductCatalogue loginPortal(String email, String password) {
        userEmail = chromeDriver.findElement(By.xpath("//input[@id='userEmail']"));
        userPassword = chromeDriver.findElement(By.xpath("//input[@id='userPassword']"));
        submitButton = chromeDriver.findElement(By.xpath("//input[@id='login']"));

        userEmail.sendKeys(email);
        userPassword.sendKeys(password);
        submitButton.click();
        return null;
    }
    public String getErrorMessage(){
        errorMessage = (WebElement) By.cssSelector("[class*='flyInOut']");
        waitForElementToAppear(errorMessage);
        return errorMessage.getText();

    }


}
