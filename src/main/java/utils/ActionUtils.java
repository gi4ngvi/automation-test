package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtils {
    private WebDriver driver;
    private Actions actions;

    public ActionUtils(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
    }

    public void hoverElement(WebElement element) {
        actions.moveToElement(element).build().perform();
    }
}
