package desktop.fragments;

import abstractclasses.fragment.AbstractFragment;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainHeader extends AbstractFragment {


    @FindBy(xpath= "//div[@class = 'user-nav']//a[@href = '/account/login/to/account']")
    private WebElement signInLink;

    public MainHeader(WebElement rootElement) {
        super(rootElement);
    }

    public String getSigninText() {
        return signInLink.getText();
    }
}
