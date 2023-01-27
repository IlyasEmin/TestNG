package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class OpenSourcePage {
    @FindBy(
            name = "username"
    )
    public WebElement username;
    @FindBy(
            xpath = "//input[@name='password']"
    )
    public WebElement password;
    @FindBy(
            xpath = "//button[@type='submit']"
    )
    public WebElement submitButton;

    public OpenSourcePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
