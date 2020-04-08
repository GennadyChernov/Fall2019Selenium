package com.automation.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class VyTrackUtilities {


    static By userNameBoxLocator = By.id("prependedInput");
    static By passwordBoxLocator = By.id("prependedInput2");


    public static void storeManagerLogin(WebDriver driver, String userName, String password) {

driver.findElement(userNameBoxLocator).sendKeys(userName);
driver.findElement(passwordBoxLocator).sendKeys(password + Keys.ENTER);
BrowserUtils.wait(2);

    }

  public static void allModules(WebDriver driver, String tab, String modules) {

String tabLocator = "//span[@class='title title-level-1'][contains(text(),'" + tab + "')]";

String modulesLocator = "//span[contains(text(),'" + modules + "') and contains (@class, 'title title-level-2')]";

driver.findElement(By.xpath(tabLocator)).click();
BrowserUtils.wait(1);

driver.findElement(By.xpath(modulesLocator)).click();

BrowserUtils.wait(2);

    }
}


