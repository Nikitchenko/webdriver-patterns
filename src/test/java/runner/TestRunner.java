package runner;

import desktop.pages.LoginPage;
import driver.SingletonDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(JUnitPlatform.class)
@SelectPackages("put your packages here")
class TestRunner {
    WebDriver driver = SingletonDriver.getWebDriverInstance();

    @Test
    void loginPageTest() {

        String namePlaceholder = "Name";
        String emailPlaceholder = "Your email address";
        String passwordPlaceholder = "Create a password";


        driver = SingletonDriver.openPage(driver, "https://www.bookdepository.com/account/login/to/account");
        LoginPage loginPage = new LoginPage(driver);
        driver.switchTo().frame(driver.findElement(By.className("register-iframe")));

        assertAll("Check the placeholders in the register-iframe",
                () -> assertEquals(namePlaceholder, loginPage.getNamePlaceholder(), "Not correct placeholder for a name."),
                () -> assertEquals(emailPlaceholder, loginPage.getEmailPlaceholder(), "Not correct placeholder for an email."),
                () -> assertEquals(passwordPlaceholder, loginPage.getPasswordPlaceholder(), "Not correct placeholder for a password."));
        driver.quit();
    }

    @AfterEach
    void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

}
