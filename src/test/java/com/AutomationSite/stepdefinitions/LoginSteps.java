package com.AutomationSite.stepdefinitions;

import com.AutomationSite.pages.LoginPage;
import com.AutomationSite.utils.ConfigReader;
import com.AutomationSite.utils.WebDriverFactory;
import com.AutomationSite.utils.waitUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

// This class contaisn step definitions along  WITH tEST ng
public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginpage;

   @Before
   public void setUp(){
      driver=   WebDriverFactory.createWebDriver(ConfigReader.getProperties("browser"));
      loginpage= new LoginPage(driver);
    }
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
         driver.get(ConfigReader.getProperties("login.url"));
         driver.manage().window().maximize();
          waitUtils.waitForUrlToBe(driver, (ConfigReader.getProperties("login.url")));
    }
    @When("the user enters {string} and {string}")
    public void the_user_enters_and(String username, String password) {
        loginpage.enterUserName(username);
        loginpage.enterPassword(password);
        loginpage.clickLogin();
    }
    @Then("the user should see {string}")
    public void the_user_should_see(String expectedResult) {
        if(expectedResult=="Success"){
            Assert.assertTrue(loginpage.isLoginPageLoaded(), "Login page did not load");
        }else if(expectedResult=="Failure"){
            Assert.assertTrue(loginpage.isErrorMessageDisplayed(),"Error message not displayed");
        }

    }
}
