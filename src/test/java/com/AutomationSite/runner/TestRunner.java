package com.AutomationSite.runner;

import com.AutomationSite.utils.DynamicXpathUtils;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@CucumberOptions(
        features="src/test/resources/features",
        glue="com.AutomationSite.stepdefinitions",
        plugin={"pretty", "html:target/cucumber-reports"},
        tags = "@smoke and @invalid-login"

)
public class TestRunner extends AbstractTestNGCucumberTests {
}
