package com.automation.tests.vytrack.fleet;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbayTest {

    public WebDriver driver ;

    @BeforeMethod
    public void setUp (){
        WebDriverManager.chromedriver().version("79").setup();
     driver = new ChromeDriver();
        driver.get("https://ebay.com");
        driver.manage().window().maximize();
        BrowserUtils.wait(2);
    }


    @Test
    public void getEbayTitle(){

       // WebElement ebayTitle = driver.findElement(By.xpath("//title[contains(text(),'Electronics, Cars, Fashion, Collectibles & More | eBay')]"));



        String actual = driver.getTitle();


        String expected = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        System.out.println();
      Assert.assertEquals(actual,expected);
//

//


    }


    @AfterMethod
    public void  tearDown(){
        driver.quit();
    }





}
