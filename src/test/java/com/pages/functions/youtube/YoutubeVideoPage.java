package com.pages.functions.youtube;

import com.pages.locators.youtube.YoutubeVideoLocator;
import org.openqa.selenium.WebDriver;

public class YoutubeVideoPage extends YoutubeVideoLocator {

    public YoutubeVideoPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void playVideo() {
        String videoStatus = blkVideo.getAttribute("class");
        if (videoStatus.contains("unstarted-mode") || videoStatus.contains("paused-mode")) {
            wait.waitUntilToBeClickAble(blkVideo);
            action.hoverElement(blkVideo);
            blkVideo.click();
            wait.sleep(1);      // Wait for video change status
        }
    }

    public void pauseVideo() {
        if (!blkVideo.getAttribute("class").contains("paused-mode")) {
            wait.waitUntilToBeClickAble(blkVideo);
            action.hoverElement(blkVideo);
            blkVideo.click();
            wait.sleep(1);      // Wait for video change status
        }
    }

    public boolean isVideoPlaying() {
        return blkVideo.getAttribute("class").contains("playing-mode");
    }

    public void waitForVideoPlaying(int time) {
        wait.sleep(time);
    }
}
