package TestNgPrograms;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataProvider {
    @Test
    public void webLogin() {
        System.out.println(" This is web Loign ");
    }

    @Test(dataProvider = "getData")
    public void mobileLogin(String userName, String passWord) {
        System.out.println(" This is Mobile Login");
        System.out.println("------------------");
        System.out.println(userName);
        System.out.println(passWord);
    }

    @Test
    public void deskTopLogin() {
        System.out.println(" Desktop Login ");
    }

    // Below we created a "DataProvider" Annotation and passed a "getData()" Method which is having 3 sets of Data
    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[3][2];

        // 1st Set
        data[0][0] = "Harsha";
        data[0][1] = "Harsha@123";

        // 2nd Set
        data[1][0] = "Priya";
        data[1][1] = "Priya@123";

        // 3rd Set
        data[2][0] = "Arjun";
        data[2][1] = "Arjun@123";

        return data;
    }
}
