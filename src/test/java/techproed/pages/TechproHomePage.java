package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TechproHomePage {
    @FindBy(
            id = "exampleInputEmail1"
    )
    public WebElement username;
    @FindBy(
            id = "exampleInputPassword1"
    )
    public WebElement password;
    @FindBy(
            xpath = "//button[@type='submit']"
    )
    public WebElement submitButton;

    public TechproHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
