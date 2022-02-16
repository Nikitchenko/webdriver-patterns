package desktop.pages;

import abstractclasses.page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//div[@class = 'user-nav']//a[@href = '/account/login/to/account']")
    private WebElement signInLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage signInLinkClick() {
        signInLink.click();
        return new LoginPage(driver);
    }
}
