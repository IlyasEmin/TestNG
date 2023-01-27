package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class OpenSourceDashboardPage {
    @FindBy(
            xpath = "//h6[.='Dashboard']"
    )
    public WebElement dashboardHeader;

    public OpenSourceDashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
