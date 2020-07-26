package com.pages.functions.google;

import com.pages.functions.youtube.YoutubeVideoPage;
import com.pages.locators.google.GoogleSearchResultLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.StringUtils;

import java.util.List;

public class GoogleSearchResultPage extends GoogleSearchResultLocator {

    public GoogleSearchResultPage(WebDriver driver) {
        super(driver);
    }

    public boolean verifyResultContains(String key) {
        String encodeString = StringUtils.encodeString(key);
        String resultLocator = String.format(LIST_RESULT, encodeString);
        String actualText;
        wait.waitUntilPresent(By.xpath(resultLocator));
        List<WebElement> listResult = driver.findElements(By.xpath(resultLocator));
        for (WebElement result : listResult) {
            actualText = result.getText().toLowerCase();
            if (!actualText.contains(key)) {
                return false;
            }
        }
        return true;
    }

    public String getInputtedText() {
        wait.waitUntilVisibilityOf(inputSearch);
        return inputSearch.getAttribute("value");
    }

    public String getFirstYoutubeResultTitle() {
        wait.waitUntilVisibilityOf(lnkYoutube);
        return lnkYoutube.getText().trim();
    }

    public YoutubeVideoPage clickFirstYoutubeResult() {
        wait.waitUntilToBeClickAble(lnkYoutube);
        lnkYoutube.click();
        wait.waitForPageLoad();
        return new YoutubeVideoPage(driver);
    }
}
