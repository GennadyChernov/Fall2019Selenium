package com.automation.tests.vytrack.login;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogInAsStoreManager {

 public   WebDriver driver ;


    public String userName = "storemanager85";
    public String password = "UserUser123" ;

    @BeforeMethod
public void setUp(){
        WebDriverManager.chromedriver().version("79").setup();
driver = new ChromeDriver();
        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();
    }


    @Test
    public void login(){

        driver.findElement(By.id("prependedInput")).sendKeys(userName);
        driver.findElement(By.id("prependedInput2")).sendKeys(password, Keys.ENTER);
        BrowserUtils.wait(3);
       // driver.quit();

//        String expected = "Dashboard";
//        String actual = driver.getTitle();
//
//        Assert.assertEquals(actual,expected) ;




    }

    @AfterMethod
    public void tearDown(){
        driver.quit();

//        if (driver!=null){
//            driver.quit();
//            driver=null;
//        }
    }
//    private void assertEquals(String actual, String expected) {
//        System.out.println(actual + " and " + expected);    }

}




