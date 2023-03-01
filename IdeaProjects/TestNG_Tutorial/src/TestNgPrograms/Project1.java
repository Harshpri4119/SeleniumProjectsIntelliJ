package TestNgPrograms;

import org.testng.annotations.Test;

public class Project1 {
    @Test
    void Demo() {
        System.out.println("Hello!");
    }

    @Test(priority = 1)
    void setUp() {
        System.out.println(" Iam Inside SetUp ");
    }

    @Test(priority = 2)
    void runner() {
        System.out.println(" Iam Inside the Run ");
    }

    @Test(priority = 3)
    void output() {
        System.out.println(" Iam inside Output ");
    }
}
