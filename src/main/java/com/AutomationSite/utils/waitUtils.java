package com.AutomationSite.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waitUtils {
    private static final long  DEFAULT_TIMEOUT = 10;
    static WebDriverWait wait;

    public static void waitForUrlToBe(WebDriver driver, String url, long timeout){
         wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.urlToBe(url));
    }

    public static void waitForUrlToBe(WebDriver driver, String url){
    waitForUrlToBe(driver,url,DEFAULT_TIMEOUT);

    }

    public static void waitForTitleContains(WebDriver driver, String title, long timeout) {
         wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.titleContains(title));
    }

    public static void waitForTitleContains(WebDriver driver, String title) {
        waitForTitleContains(driver, title, DEFAULT_TIMEOUT);
    }

    public static void waitForTitleIs(WebDriver driver, String title, long timeout) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.titleIs(title));
    }

    public static void waitForTitleIs(WebDriver driver, String title) {
        waitForTitleIs(driver, title, DEFAULT_TIMEOUT);
    }

    public static void waitForJsReturnsValue(WebDriver driver, String js, long timeout) {
       wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.jsReturnsValue(js));
    }

    public static void waitForJsReturnsValue(WebDriver driver, String js) {
        waitForJsReturnsValue(driver, js, DEFAULT_TIMEOUT);
    }

    public static void waitForPresenceOfElementLocated(WebDriver driver, org.openqa.selenium.By locator, long timeout) {
  wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }


    public static void waitForPresenceOfElementLocated(WebDriver driver, org.openqa.selenium.By locator) {
        waitForPresenceOfElementLocated(driver, locator, DEFAULT_TIMEOUT);
    }

      public static void waitForVisibilityOfElement(WebDriver driver, By locator, long timeout) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForVisibilityOfElement(WebDriver driver, org.openqa.selenium.By locator) {
       waitForVisibilityOfElement(driver, locator, DEFAULT_TIMEOUT);
    }

}
