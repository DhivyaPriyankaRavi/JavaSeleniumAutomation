package com.AutomationSite.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public final class DynamicXpathUtils {

       private DynamicXpathUtils() {
    }

    public static String formatXpath(String xpath, String text) {
        return String.format(xpath, "%text");
    }

    public static String getElementByText(WebDriver driver,String xpath) {
        return driver.findElement(By.xpath("")).getText();
    }


   }
