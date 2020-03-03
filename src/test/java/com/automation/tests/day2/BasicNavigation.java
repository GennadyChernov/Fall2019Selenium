package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {
        //to start selenium script we need
        // set up webDriver (browser driver) and create webDriver object

        WebDriverManager.chromedriver().setup();
        //ChromeDriver driver = new ChromeDriver();
        //in selenium, everything starts from Web driver Interface
      //  RemoteWebDriver driver = new SafariDriver() ;
        WebDriver driver = new ChromeDriver() ;
        driver.get("https://www.google.com/"); // to open the website

        driver.manage().window().maximize(); // to maximize browser

      //  driver.manage().window().fullscreen();

        Thread.sleep(3000); // for demo , wait 3 seconds

        String title = driver.getTitle(); // returns <title>Some title </title> text

        String expectedTitle = "Google" ;

        System.out.println("title is " + title);

        if (expectedTitle.equals(title)){
            System.out.println("Test Passed!");
        }else{
            System.out.println("Test Failed!");
        }

        driver.navigate().to("http://amazon.com");

        if (driver.getTitle().toLowerCase().contains("amazon")){
            System.out.println("Test Passed!");
        }else{
            System.out.println("Test Failed!");
        }

        // comeback to google
        driver.navigate().back();
        verifyEquals(driver.getTitle(),"Google");
        //must be at the end

        driver.close(); // to close browser
        // browser cannot close itself



    }

    public static void verifyEquals(String arg1, String arg2){
        if (arg1.equals(arg2)) {
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
    }
}
