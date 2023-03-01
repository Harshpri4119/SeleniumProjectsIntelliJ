package TestNgPrograms;

import org.testng.annotations.Test;

public class TestNgInvocationCount {
    @Test(invocationCount = 5)
    public void count() {
        System.out.println(" Count ");
    }
}
