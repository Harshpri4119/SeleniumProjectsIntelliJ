package GlobalEnvironmentValues;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class GlobalEnvironementVariables {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();  // <--- to explore properties method from java.util;
        // below is the file input stream for the properties File
        FileInputStream fis = new FileInputStream("C://Users//91912//IdeaProjects//TestNG_Tutorial//src//GlobalEnvironmentValues//data.properties");
        properties.load(fis);  // <--- to read properties file.

        String browserName = properties.getProperty("chromeBrowser");
        String urlName = properties.getProperty("url");
        System.out.println(browserName);
        System.out.println(urlName);

        FileOutputStream fos = new FileOutputStream("C://Users//91912//IdeaProjects//TestNG_Tutorial//src//GlobalEnvironmentValues//data.properties");
        properties.setProperty("chromeBrowser", "Chrome Browser");
        properties.store(fos, null);
        String updatedChromeBrowser = properties.getProperty("chromeBrowser");
        System.out.println(updatedChromeBrowser);

    }
}
