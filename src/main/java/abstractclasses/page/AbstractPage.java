package abstractclasses.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    private String pageUrl;
    private String pageUrlPattern;
    protected WebDriver driver;

    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String setPageUrlPattern(String pageUrlPattern) {
        this.pageUrlPattern = pageUrlPattern;
        return this.pageUrlPattern;
    }

    public String getPageUrlPattern() {
        return pageUrlPattern;
    }
}
