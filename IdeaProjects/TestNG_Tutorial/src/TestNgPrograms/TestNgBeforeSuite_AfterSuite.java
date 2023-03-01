package TestNgPrograms;

import org.testng.annotations.*;

public class TestNgBeforeSuite_AfterSuite extends Dept {
    @Test
    public void webDeveloper() {
        System.out.println(" Iam a Web Developer.");
    }

    @Test
    public void androidDeveloper() {
        System.out.println(" Iam a Android Developer.");
    }

    @Test
    public void iosDeveloper() {
        System.out.println(" Iam a IOS Developer.");
    }

    @Test
    public void UiDeveloper() {
        System.out.println(" Iam a UI Developer.");
    }

    @Test
    public void SQLDeveloper() {
        System.out.println(" Iam a SQL Developer.");
    }

    @Test
    public void CloudEngineer() {
        System.out.println(" Iam a Cloud Engineer.");
    }

    @Test
    public void JavaDeveloper() {
        System.out.println(" Iam a Java Developer.");
    }

    @Test
    public void PythonDeveloper() {
        System.out.println(" Iam a Python Developer.");
    }

    @Test
    public void TestEngineer() {
        System.out.println(" Iam a Test Engineer.");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println(" Before Test");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println(" Before Suite");
    }
}

class Dept {
    @Test
    public void hr() {
        System.out.println(" Iam HR");
    }

    @Test
    public void consular() {
        System.out.println(" Iam Consular");
    }

    @AfterTest
    public void afterTest() {
        System.out.println(" After Test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println(" After Suite");
    }
}
