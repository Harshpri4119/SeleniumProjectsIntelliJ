package TestNgPrograms;

import org.testng.annotations.Test;

public class Test_Methods_Grouping {

    @Test(groups = "it_department")
    public void webDeveloper() {
        System.out.println(" Web Developer ");
    }

    @Test(groups = "it_department")
    public void javaDeveloper() {
        System.out.println(" Java Developer ");
    }

    @Test(groups = "it_department")
    public void dotNetDeveloper() {
        System.out.println(" Dot Net Developer");
    }

    @Test(groups = "it_department")
    public void pythonDeveloper() {
        System.out.println("Python Developer");
    }

    @Test(groups = "it_department")
    public void androidDeveloper() {
        System.out.println(" Android Developer");
    }

    @Test(groups = "it_department")
    public void iosDeveloper() {
        System.out.println(" IOS Developer");
    }

    @Test(groups = "it_department")
    public void SqlDeveloper() {
        System.out.println(" SQL Developer");
    }

    @Test(groups = "it_department")
    public void UiDeveloper() {
        System.out.println(" UI Developer ");
    }

    @Test(groups = "it_department")
    public void softwareTester() {
        System.out.println(" Software Tester");
    }

    @Test(groups = "hr_department")
    public void hrDepartment() {
        System.out.println(" Hr Department");
    }
}
