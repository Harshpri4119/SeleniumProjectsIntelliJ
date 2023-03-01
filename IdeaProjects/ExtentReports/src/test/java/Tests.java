import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tests {
    public WebDriver driver;

    @Test
    public void youtubeDemo() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("headless");  //---> To run chrome in HeadLess Mode, without opening a browser
        driver = new ChromeDriver(chromeOptions);    // ----> passing chromeOptions in ChromeDriver to ensure changes
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        driver.close();
    }

    @Test
    public void googleDemo() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        driver.close();
    }

    @Test(groups = "social")
    public void facebookDemo() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        driver.close();

    }

    @Test(groups = "social")
    public void instagramDemo() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        driver.close();

    }

    @Test(groups = "social")
    public void twitterDemo() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.twitter.com");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        driver.close();

    }

    @Test
    public void linkedInDemo() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        driver.close();

    }

    @Test
    public void spaceXDemo() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spacex.com");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        driver.close();

    }

    @Test
    public void teslaDemo() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tesla.com");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        driver.close();

    }
}
