package com.automation.tests.practice;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationForm1 {

    WebDriver driver;

    String userName = "storemanager85";
    String password = "UserUser123";
    By activitiesTab = By.xpath("//span[@class='title title-level-1'][contains(text(),'Activities')]");
    By moduleCall = By.xpath("//span[contains(text(),'Calls') and contains (@class, 'title title-level-2')]");
    By calendarEventsModule = By.xpath("//span[contains(text(),'Calendar Events') and contains (@class, 'title title-level-2')]");
    By userNameBox = By.id("prependedInput") ;
    By passwordBox = By.id("prependedInput2") ;
    By logInButton = By.id("_submit") ;
    By logCallBtn = By.xpath("//*[contains(text(), 'Log call')]"); ;
    By calendarButton = By.cssSelector("a[title='Create Calendar event']");


    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().version("79").setup();
        driver = new ChromeDriver();
        driver.get("https://qa1.vytrack.com");
        driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
    }

    @Test
    public void test() {

        driver.findElement(userNameBox).sendKeys(userName);
        driver.findElement(passwordBox).sendKeys(password);
        driver.findElement(logInButton).click();
        driver.findElement(activitiesTab).click();
        driver.findElement(moduleCall).click();
        BrowserUtils.wait(2);
        Assert.assertTrue(driver.findElement(logCallBtn).isDisplayed()) ;


    }

    @Test
    public void Test2() {

        driver.findElement(userNameBox).sendKeys(userName);
        driver.findElement(passwordBox).sendKeys(password);
        driver.findElement(logInButton).click();
        driver.findElement(activitiesTab).click();
        driver.findElement(calendarEventsModule).click();






      //  Assert.assertTrue(driver.findElement(calendarButton).isDisplayed());



    }



        @AfterMethod
        public void tearDown () {

            BrowserUtils.wait(3);

            driver.quit();
        }

    }