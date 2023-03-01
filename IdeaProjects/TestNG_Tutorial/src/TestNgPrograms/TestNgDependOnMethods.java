package TestNgPrograms;

import org.testng.annotations.Test;

public class TestNgDependOnMethods {
    @Test
    public void webDeveloper(){
        System.out.println(" Web Developer ");
    }
    @Test(dependsOnMethods = "webDeveloper")
    public void javaScriptDeveloper(){
        System.out.println(" Java Script Developer");
    }
    @Test(dependsOnMethods = "webDeveloper")
    public void htmlCssDeveloper(){
        System.out.println(" HTML CSS Developer");
    }
}
