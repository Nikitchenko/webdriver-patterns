package runner;

import desktop.fragments.MainHeader;
import desktop.pages.HomePage;
import desktop.pages.LoginPage;
import driver.SingletonDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static constants.Constants.THE_URL;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(JUnitPlatform.class)
@SelectPackages("put your packages here")
class TestRunner {
    WebDriver driver = SingletonDriver.getWebDriverInstance();

    @Test
    void loginPageTest() {

        String signInText = "Sign in/Join";
        String loginPageUrl = THE_URL + "/account/login/to/account";
        String namePlaceholder = "Name";
        String emailPlaceholder = "Your email address";
        String passwordPlaceholder = "Create a password";

        driver = SingletonDriver.openPage(driver, THE_URL);
        HomePage homePage = new HomePage(driver);

        MainHeader mainHeader = homePage.getTopNavigation();

        assertAll("Check the placeholders in the register-iframe",
                () -> assertEquals(signInText, mainHeader.getSignInLink().getText(), "Not correct Sign In text.")
        );

        LoginPage loginPage = mainHeader.signInLinkClick();

        assertAll("Check the placeholders in the register-iframe",
                () -> assertEquals(loginPageUrl, loginPage.getPageUrl(), "Not Log in page."),
                () -> assertEquals(namePlaceholder, loginPage.getNamePlaceholder(), "Not correct placeholder for a name."),
                () -> assertEquals(emailPlaceholder, loginPage.getEmailPlaceholder(), "Not correct placeholder for an email."),
                () -> assertEquals(passwordPlaceholder, loginPage.getPasswordPlaceholder(), "Not correct placeholder for a password."));
    }

    @AfterEach
    void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

}
