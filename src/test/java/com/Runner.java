package com;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/com/features",
                glue = {"com.definitions", "com.utils"},
                plugin = { "pretty", "html:report/cucumber-reports" })
public class Runner {
}
