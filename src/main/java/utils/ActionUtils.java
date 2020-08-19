package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtils {
    private WebDriver driver;
    private Actions actions;
    private WaitUtils wait;
    private JavascriptExecutor js;

    public ActionUtils(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        js = (JavascriptExecutor) driver;
        wait = new WaitUtils(driver);
    }

    public void hoverElement(WebElement element) {
        actions.moveToElement(element).build().perform();
    }

    public void scrollToElement(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        wait.sleep(300);
    }
}
