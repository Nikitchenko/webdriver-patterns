package abstractclasses.fragment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractFragment {

    private WebElement rootElement;

    protected AbstractFragment(WebElement rootElement) {
        this.rootElement = rootElement;
        PageFactory.initElements((WebDriver) rootElement, this);
    }

    public WebElement getRootElement() {
        return rootElement;
    }

    public void setRootElement(WebElement element) {
        this.rootElement = element;
    }
}
