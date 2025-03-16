package com.AutomationSite.pages;

import com.AutomationSite.utils.DynamicXpathUtils;
import com.AutomationSite.utils.WebElementUtils;
import com.AutomationSite.utils.waitUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private static final String username = "//input[@id='input-email']";
    private static final String password = "//input[@id ='input-password']";
    private static final String login_button = "//input[@type='submit']";
    private static final String account ="//a[text()='Account']";

    private static final String error_Text ="//*[text()=' Warning: No match for E-Mail Address and/or Password.']";

   @FindBy(id = "input-email")
    private WebElement usernameInput;
   /*  @FindBy(id = "password")
    private WebElement passwordInput;
    @FindBy(id = "loginButton")
    private WebElement loginButton;*/

    public void enterUserName(String userName) {
      //  WebElementUtils.getElement(driver, usernameInput).sendKeys(userName);
        usernameInput.sendKeys(userName);

    }

    public void enterPassword(String Password) {
        WebElementUtils.getElement(driver, password).sendKeys(Password);
    }

    public void clickLogin() {
        WebElementUtils.clickSubmit(driver, login_button);
    }

    public boolean isLoginPageLoaded() {
         return WebElementUtils.isElementDisplayed(driver,account);
    }

    public boolean isErrorMessageDisplayed() {
        return WebElementUtils.isElementDisplayed(driver,error_Text);
    }

}
