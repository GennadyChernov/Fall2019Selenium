package com.automation.tests.vytrack.fleet;

import com.automation.tests.vytrack.login.LogInAsStoreManager;
import com.automation.tests.vytrack.login.LoginPageTests;
import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class VehicleTest1 extends LogInAsStoreManager {


//    @BeforeMethod
//    @Override
//    public void setUp() {
//        super.setUp();
//    }


    @Test
    public void verifyPageSubtitle(){

login();
        WebElement element = driver.findElement(By.xpath("//span[@class='title title-level-1'][contains(text(),'Fleet')]"));

        element.click();
        BrowserUtils.wait(1);
        WebElement element1 = driver.findElement(By.xpath("//li[@class='dropdown-menu-single-item first']//span[@class='title title-level-2'][contains(text(),'Vehicles')]"));
        element1.click();
        BrowserUtils.wait(3);





        WebElement allCars = driver.findElement(By.cssSelector("[class=\"oro-subtitle\"]"));

        String actualMessage = allCars.getText() ;

        String expectedMessage = "All Cars" ;

        Assert.assertEquals(actualMessage, expectedMessage);

        System.out.println("actual = " + actualMessage + " : " + " expected " + expectedMessage);



    }


//    @AfterMethod
//    @Override
//    public void tearDown() {
//        super.tearDown();
//    }
}
