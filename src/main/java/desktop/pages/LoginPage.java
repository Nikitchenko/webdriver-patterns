package desktop.pages;

import abstractclasses.page.AbstractPage;
import desktop.fragments.MainHeader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends AbstractPage {

    private static final String PLACEHOLDER = "placeholder";

    @FindBy(id = "ap_customer_name")
    private WebElement nameInput;

    @FindBy(id = "ap_email")
    private WebElement emailInput;

    @FindBy(id = "ap_password")
    private WebElement passwordInput;

    @FindBy(className = "user-nav")
    private MainHeader navigationMenu;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterName(String name) {
        nameInput.clear();
        nameInput.sendKeys(name);
    }

    public void enterEmail(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public String getNamePlaceholder() {
        return nameInput.getAttribute(PLACEHOLDER);
    }

    public String getEmailPlaceholder() {
        return emailInput.getAttribute(PLACEHOLDER);
    }

    public String getPasswordPlaceholder() {
        return passwordInput.getAttribute(PLACEHOLDER);
    }

    public MainHeader getTopNavigation() {
        return navigationMenu;
    }

    @Override
    public String getPageUrl() {
        return driver.getCurrentUrl();
    }
}
