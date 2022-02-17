package desktop.fragments;

import abstractclasses.fragment.AbstractFragment;
import desktop.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainHeader extends AbstractFragment {

    @FindBy(xpath = "//a[@href = '/account/login/to/account']")
    private WebElement signInLink;

    public MainHeader(WebDriver driver) {
        super(driver);
    }

    public WebElement getSignInLink() {
        return signInLink;
    }

    public LoginPage signInLinkClick() {
        signInLink.click();
        return new LoginPage(driver);
    }

}
