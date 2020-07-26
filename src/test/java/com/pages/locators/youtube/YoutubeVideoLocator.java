package com.pages.locators.youtube;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.SeleniumFactory;

public class YoutubeVideoLocator extends SeleniumFactory {
    @FindBy(how = How.ID, using = "movie_player")
    protected WebElement blkVideo;

    public YoutubeVideoLocator(WebDriver driver) {
        super(driver);
    }
}
