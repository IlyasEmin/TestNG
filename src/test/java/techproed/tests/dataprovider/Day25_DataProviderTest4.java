package techproed.tests.dataprovider;

import org.testng.annotations.Test;
import techproed.utilities.DataProviderUtils;

public class Day25_DataProviderTest4 {
    public Day25_DataProviderTest4() {
    }

    @Test(
            dataProvider = "musteriVerileri",
            dataProviderClass = DataProviderUtils.class
    )
    public void musteriVerileriTest(String username, String password, String sube) {
        System.out.println("Username : " + username + ". Password : " + password + ". Sube : " + sube);
    }

    @Test(
            dataProvider = "musteriHizmetleriVerileri",
            dataProviderClass = DataProviderUtils.class
    )
    public void musteriHizmetleriVerileriTest(String username, String password) {
        System.out.println(username + "  |  " + password);
    }

    @Test(
            dataProvider = "personelVerileri",
            dataProviderClass = DataProviderUtils.class
    )
    public void personelVerileriTest(String username, String password) {
        System.out.println(username + "  |  " + password);
    }

    @Test(
            dataProvider = "customerData",
            dataProviderClass = DataProviderUtils.class
    )
    public void customerDataTest(String username, String password) {
        System.out.println("EXCEL DATALARIM");
        System.out.println(username + " ||| " + password);
    }
}

