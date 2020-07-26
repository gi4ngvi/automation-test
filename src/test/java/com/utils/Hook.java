package com.utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.SeleniumUtils;

public class Hook {
    @Before
    public void initTest() {
        SeleniumUtils.initDriver();
    }

    @After
    public void tearDown() {
        SeleniumUtils.getWebDriver().quit();
    }

}
