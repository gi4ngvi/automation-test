package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
    private static final int TIMEOUT = 30;
    private WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor js;

    public WaitUtils(WebDriver driver) {
        this.driver = driver;
        initComponents();
    }

    private void initComponents() {
        wait = new WebDriverWait(driver, TIMEOUT);
        js = ((JavascriptExecutor) driver);
    }

    /**
     * Wait until the page is fully loaded
     */

    public void waitForPageLoad() throws JavascriptException {
        int delay = 1;
        sleep(delay);
        for (int i = 0; i < TIMEOUT; i++) {
            //To check page ready state.
            if (js.executeScript("return document.readyState").toString().equals("complete"))
                break;
            sleep(delay);
        }
    }

    /**
     * Wait until element displayed and clickable
     *
     * @param element element to be checked
     * @throws TimeoutException
     */

    public void waitUntilToBeClickAble(WebElement element) throws TimeoutException {
        waitUntilVisibilityOf(element);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilVisibilityOf(WebElement element) throws TimeoutException {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilPresent(By by) throws TimeoutException {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }


    public void sleep(long time) {
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
