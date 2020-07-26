package com.definitions;

import com.pages.functions.google.GoogleHomePage;
import com.pages.functions.google.GoogleSearchResultPage;
import com.pages.functions.youtube.YoutubeVideoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.SeleniumUtils;

public class StepDefinitions {
    private WebDriver driver = SeleniumUtils.getWebDriver();
    private GoogleHomePage homePage;
    private GoogleSearchResultPage searchResultPage;
    private YoutubeVideoPage youtubeVideoPage;
    private String resultTitle;

    @Given("I go to Google site {string}")
    public void i_go_to_Google_site(String string) {
        driver.get(string);
        homePage = new GoogleHomePage(driver);
    }

    @When("I search with keyword {string}")
    public void i_search_with_keyword(String string) {
        searchResultPage = homePage.search(string);
    }

    @When("I get first Youtube link result")
    public void i_get_first_Youtube_link_result() {
        resultTitle = searchResultPage.getFirstYoutubeResultTitle();
    }

    @When("I click first Youtube link")
    public void i_click_first_Youtube_link() {
        youtubeVideoPage = searchResultPage.clickFirstYoutubeResult();
    }

    @When("I play the video")
    public void i_play_the_video() {
        youtubeVideoPage.playVideo();
    }

    @When("I pause the video after {int} seconds")
    public void i_pause_the_video_after_seconds(Integer int1) {
        youtubeVideoPage.waitForVideoPlaying(int1);
        youtubeVideoPage.pauseVideo();
    }

    @Then("I should see all results are contains {string}")
    public void i_should_see_all_results_are_contains(String string) {
        Assert.assertTrue(searchResultPage.verifyResultContains(string));
    }

    @Then("my inputted string {string} still remained on the search box")
    public void my_inputted_string_still_remained_on_the_search_box(String string) {
        Assert.assertEquals(string, searchResultPage.getInputtedText());
    }

    @Then("the video title should be same with result on Google page")
    public void the_video_title_should_be_same_with_result_on_Google_page() {
        Assert.assertTrue(youtubeVideoPage.getTitle().contains(resultTitle));
    }

    @Then("the video should be played")
    public void the_video_should_be_played() {
        Assert.assertTrue(youtubeVideoPage.isVideoPlaying());
    }

    @Then("the video should be paused")
    public void the_video_should_be_paused() {
        Assert.assertFalse(youtubeVideoPage.isVideoPlaying());
    }
}
