package com.playwright.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        plugin = {"pretty", "html:results/cucumber-reports.html",
                            "json:results/cucumber.json",
                            "junit:results/cucumber.xml",
                            "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        glue = {"com.playwright.hooks","com.playwright"},
         tags = "not @wip")

public class TestRunner {
}
