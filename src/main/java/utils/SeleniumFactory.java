package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SeleniumFactory {
    protected WebDriver driver;
    protected WaitUtils wait;
    protected ActionUtils action;

    public SeleniumFactory(WebDriver driver) {
        this.driver = driver;
        initComponent();
    }

    private void initComponent() {
        wait = new WaitUtils(driver);
        action = new ActionUtils(driver);
        PageFactory.initElements(driver, this);
    }
}
