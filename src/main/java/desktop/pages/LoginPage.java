package desktop.pages;

import abstractclasses.page.AbstractPage;
import desktop.fragments.MainHeader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends AbstractPage {

    private static final String PLACEHOLDER = "placeholder";

    @FindBy(id = "ap_customer_name")
    private WebElement name;

    @FindBy(id = "ap_email")
    private WebElement email;

    @FindBy(id = "ap_password")
    private WebElement password;

    @FindBy(className = "user-nav")
    private MainHeader navigation;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterName(String name) {
        this.name.clear();
        this.name.sendKeys(name);
    }

    public void enterEmail(String email) {
        this.email.clear();
        this.email.sendKeys(email);
    }

    public void enterPassword(String password) {
        this.password.clear();
        this.password.sendKeys(password);
    }

    public String getNamePlaceholder() {
        return this.name.getAttribute(PLACEHOLDER);
    }

    public String getEmailPlaceholder() {
        return this.email.getAttribute(PLACEHOLDER);
    }

    public String getPasswordPlaceholder() {
        return this.password.getAttribute(PLACEHOLDER);
    }

    public MainHeader getTopNavigation() {
        return this.navigation;
    }

    @Override
    public String getPageUrl() {
        return driver.getCurrentUrl();
    }
}
