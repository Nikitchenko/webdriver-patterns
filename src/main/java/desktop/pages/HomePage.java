package desktop.pages;

import abstractclasses.page.AbstractPage;
import desktop.fragments.MainHeader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(className = "user-nav")
    private WebElement navigationMenu;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public MainHeader getTopNavigation() {
        return new MainHeader(driver);
    }

}
