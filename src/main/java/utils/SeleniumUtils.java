package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class SeleniumUtils {
    private static WebDriver driver;
    private static final String HOME_URL = "https://www.google.com/";

    public static void initDriver() {
        String driverPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "drivers";
        System.setProperty("webdriver.chrome.driver", driverPath + File.separator + "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static WebDriver getWebDriver() {
        return driver;
    }
}
