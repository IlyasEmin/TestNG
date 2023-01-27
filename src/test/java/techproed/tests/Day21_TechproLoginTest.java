package techproed.tests;

import org.testng.annotations.Test;
import techproed.pages.TechproLoginPage;
import techproed.utilities.Driver;

public class Day21_TechproLoginTest {
    public Day21_TechproLoginTest() {
    }

    @Test
    public void loginTest() {
        Driver.getDriver().get("https://testcenter.techproeducation.com/index.php?page=form-authentication");
        TechproLoginPage techproLoginPage = new TechproLoginPage();
        techproLoginPage.username.sendKeys(new CharSequence[]{"techproed"});
        techproLoginPage.password.sendKeys(new CharSequence[]{"SuperSecretPassword"});
        techproLoginPage.submitButton.click();
    }
}
