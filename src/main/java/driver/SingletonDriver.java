package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class SingletonDriver {
    private static WebDriver driver;
    private static final String DRIVER_PATH  = "src/main/resources/chromedriver.exe";
    public static final String THE_URL = "https://www.bookdepository.com";

    private void WebDriverSingleton(){}

    public static WebDriver getWebDriverInstance(){
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
            driver = new ChromeDriver();
        }
        return driver;
    }
    public static WebDriver openPage(WebDriver driver, String url){
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

}
