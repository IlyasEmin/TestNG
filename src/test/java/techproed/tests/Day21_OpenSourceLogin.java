package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourceDashboardPage;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day21_OpenSourceLogin {
    public Day21_OpenSourceLogin() {
    }

    @Test
    public void openSourceLogin() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("open_source_url"));
        OpenSourcePage openSourcePage = new OpenSourcePage();
        openSourcePage.username.sendKeys(new CharSequence[]{ConfigReader.getProperty("open_source_username")});
        openSourcePage.password.sendKeys(new CharSequence[]{ConfigReader.getProperty("open_source_password")});
        openSourcePage.submitButton.click();
        OpenSourceDashboardPage openSourceDashboardPage = new OpenSourceDashboardPage();
        Assert.assertTrue(openSourceDashboardPage.dashboardHeader.isDisplayed());
        Driver.closeDriver();
    }
}