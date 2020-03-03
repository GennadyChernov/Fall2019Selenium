package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BasicNavigation {
    public static void main(String[] args) {
        //to start selenium script we need
        // set up webDriver (browser driver) and create webDriver object

        WebDriverManager.chromedriver().setup();
        //ChromeDriver driver = new ChromeDriver();
        //in selenium, everything starts from Web driver Interface
      //  RemoteWebDriver driver = new SafariDriver() ;
        WebDriver driver = new ChromeDriver() ;
        driver.get("https://www.google.com/"); // to open the website  //


    }
}
