package TestComponents;

import PageOjectModel.LoginPage;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

public class BaseTest {
    public WebDriver webDriver;
    public LoginPage loginPage;

    public WebDriver initializeTest() throws Exception {
        Properties prop = new Properties();
        FileInputStream inputStream = new FileInputStream("C://Users//91912//IdeaProjects//SeleniumPageObjectModel//src//main//java//Resources//GlobalDataResources.properties");
        prop.load(inputStream);
        String browserName = prop.getProperty("browser");

        // ChromeDriver
        if (browserName.contains("chrome")) {
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();
        }
        // FireFox Driver
        else if (browserName.contains("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            webDriver = new FirefoxDriver();
        }
        // Edge Driver
        else if (browserName.contains("edge")) {
            WebDriverManager.edgedriver().setup();
            webDriver = new EdgeDriver();
        }
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.manage().window().maximize();

        return webDriver;
    }

    public List<HashMap<String, String>> getJsonDataToMap(String filePath) throws IOException {

        // Read Json Data to String
        String jsonData = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);

        // Read String Data to HashMap
        ObjectMapper map = new ObjectMapper();
        List<HashMap<String, String>> data = map.readValue(jsonData, new TypeReference<List<HashMap<String, String>>>() {
        });

        return data;
    }

    @BeforeMethod(alwaysRun = true)
    public LoginPage launchApplication() throws Exception {
        webDriver = initializeTest();
        loginPage = new LoginPage(webDriver);  // Initializing ChromeDriver From the 'LoginPage' Class.
        loginPage.goToURL();
        return loginPage;
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        webDriver.quit();
    }
}
