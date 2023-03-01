package TestNgPrograms;

import org.testng.annotations.Test;

public class TestNgDeependOnGroups {
    @Test(groups = "it_Dept")
    public void webDeveloper() {
        System.out.println(" web Developer ");
    }

    @Test(groups = "it_Dept")
    public void androidDeveloper() {
        System.out.println(" Android Developer ");
    }

    @Test(groups = "it_Dept")
    public void iosDeveloper() {
        System.out.println(" IOS Developer");
    }

    @Test(groups = "it_Dept")
    public void sqlDeveloper() {
        System.out.println(" SQL Developer");
    }

    @Test(groups = "it_Dept")
    public void uiDeveloper() {
        System.out.println(" UI Developer");
    }

    @Test(groups = "it_Dept")
    public void cloudDeveloper() {
        System.out.println(" cloud Developer");
    }

    @Test(dependsOnGroups = "it_Dept")
    public void softwareTestEngineer() {
        System.out.println(" Software Test Engineer");
    }
}
