package com.AutomationSite.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementUtils {

    public static WebElement getElement(WebDriver driver, String xpath) {
        waitUtils.waitForPresenceOfElementLocated(driver, By.xpath(xpath));
        return driver.findElement(By.xpath(xpath));
    }

    public static WebElement getVisibleElement(WebDriver driver, String xpath) {
        waitUtils.waitForVisibilityOfElement(driver, By.xpath(xpath),20);
        return driver.findElement(By.xpath(xpath));
    }
       public static void clickSubmit(WebDriver driver, String xpath) {
        getElement(driver,xpath).click();
    }
    public static boolean isElementDisplayed(WebDriver driver, String xpath) {
       return  getVisibleElement(driver,xpath).isDisplayed();
    }
}
