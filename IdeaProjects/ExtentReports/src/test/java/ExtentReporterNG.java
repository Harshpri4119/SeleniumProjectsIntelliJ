import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.BeforeTest;

public class ExtentReporterNG {

    @BeforeTest (alwaysRun = true)
    public static ExtentReports setReport() {
        ExtentReports reports;
        ExtentSparkReporter extentSparkReporter;
        String path = System.getProperty("user.dir") + "//report//index.html";
        extentSparkReporter = new ExtentSparkReporter(path);
        extentSparkReporter.config().setReportName("Web Automation Results");
        extentSparkReporter.config().setDocumentTitle("Test Results");  // Page Title

        reports = new ExtentReports();
        reports.attachReporter(extentSparkReporter);
        reports.setSystemInfo("Test Engineer ", "Harsha Vardhan");
        return reports;
    }
}
