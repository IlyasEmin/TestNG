package techproed.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {
    public DataProviderUtils() {
    }

    @DataProvider
    public Object[][] musteriVerileri() {
        Object[][] musteriGirisBilgileri = new Object[][]{
                {"menejer1", "12345", "besiktas"},
                {"menejer2", "98765", "cebeci"},
                {"mejejer3", "5678", "karsiyaka"}};
        return musteriGirisBilgileri;
    }

    @DataProvider
    public Object[][] musteriHizmetleriVerileri() {
        Object[][] musteriHizmetleriGirisBilgileri = new Object[][]{
                {"adam1", "3456"},
                {"ali2", "1234"},
                {"nancy3", "7890"}};
        return musteriHizmetleriGirisBilgileri;
    }

    @DataProvider
    public Object[][] personelVerileri() {
        Object[][] personelGirisBilgileri = new Object[][]{
                {"rukiye1", "abc1"}, {"mehmet2", "123r"},
                {"emin3", "3edc"}, {"baran3", "4asd"},
                {"okumus3", "6e45"}};
        return personelGirisBilgileri;
    }

    @DataProvider
    public Object[][] customerData() {
        String path = "./src/test/java/resources/mysmoketestdata.xlsx";
        String sheetName = "customer_info";
        ExcelUtils excelUtils = new ExcelUtils(path, sheetName);
        Object[][] musteriBilgileri = excelUtils.getDataArrayWithoutFirstRow();
        return musteriBilgileri;
    }
}
