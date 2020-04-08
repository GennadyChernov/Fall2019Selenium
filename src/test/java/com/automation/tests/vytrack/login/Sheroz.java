package com.automation.tests.vytrack.login;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Sheroz {
    WebDriver driver;

    private String Url = "https://facebook.com";

//    private By userName = By.id("prependedInput");
//
//    private By password = By.id("prependedInput2");

//    private By loginButton = By.id("_submit");

    private By loginButton = By.id("u_0_b");


    private By userName = By.id("email");
    private By password = By.id("pass");

    private By errorMessage = By.xpath("//*[contains(text(), 'The email or phone number you’ve entered doesn’t match any account. ')]");
    private BrowserUtils SeleniumUtilities;


//  By actualMessage = By.xpath("//div[contains(text(), 'Invalid user name or password.')]");

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(Url);

    }
//     @Test
//    public void LogInPage(){
//
//        driver.findElement(userName).sendKeys("storemanager8");
//        driver.findElement(password).sendKeys("UserUser123");
//
//        driver.findElement(loginButton).click();
//
//
//    WebElement warningMessage = driver.findElement(actualMessage);
//
//    Assert.assertTrue(warningMessage.isDisplayed());
//
//    }

    @Test
    public void loginSuccess() {

        driver.findElement(userName).sendKeys("shero");
        driver.findElement(password).sendKeys("skdj" + Keys.ENTER);


        SeleniumUtilities.wait(6);
        WebElement invalidMessageElement = driver.findElement(errorMessage);


        Assert.assertTrue(invalidMessageElement.isDisplayed());


    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {

            driver.quit();
            driver = null;
        }
    }

}

