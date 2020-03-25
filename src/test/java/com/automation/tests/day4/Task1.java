package com.automation.tests.day4;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;

public class Task1 {
    static WebDriver driver;

    public static void main(String[] args) throws Exception {
       // ebayTest();
  //  amazonTest();
        wikiTest();


    }

    public static void ebayTest() {

        driver = DriverFactory.createDriver("chrome");

        driver.get("http://ebay.com");

        driver.findElement(By.id("gh-ac")).sendKeys("java book");

        driver.findElement(By.id("gh-btn")).click();

        BrowserUtils.wait(3);


        WebElement searchResults = driver.findElement(By.tagName("h1"));

        System.out.println(searchResults.getText());

      //  System.out.println(searchResults.getText().split(" ")[0]);  << --- only for number

        String[] searchSentence = searchResults.getText().split(" ");
        System.out.println(Arrays.toString(searchSentence));

        System.out.println(searchSentence[0]);


        driver.quit();

        /**
         * Go to ebay --->          driver.get("http://ebay.com");
         * enter search term        input.sendKeys("java book");
         * click on search button   searchButton.click();
         * print number of results
         */
    }


    public static void amazonTest() {

        driver = DriverFactory.createDriver("chrome");

        driver.get("http://amazon.com");

        //enter text and click enter

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book", Keys.ENTER);

        BrowserUtils.wait(3);


       String title =  driver.getTitle() ;

//       if (title.equals(driver.getTitle())){
//           System.out.println("test passed");
//       }else {
//           System.out.println("test failed ");
//       }

        if(title.contains("java book")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        System.out.println(title);

        driver.quit();


        /**
         * go to amazon
         * enter search term
         * click on search button
         * verify title contains search term
         */

    }

    public static void wikiTest() {

        driver = DriverFactory.createDriver("chrome");

        driver.get("http://wikipedia.org");

        driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver",Keys.ENTER);

       // driver.findElement(By.name("go")).click();

        driver.findElement(By.partialLinkText("Selenium (software)")).click();

        BrowserUtils.wait(3);

        String link = driver.getCurrentUrl() ; // to get link as a String

        if (link.endsWith("Selenium_(software)")){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }


        driver.quit();


        /**
         * Go to wikipedia.org
         * enter search term `selenium webdriver`
         * click on search button
         * click on search result `Selenium (software)`
         * verify url ends with `Selenium_(software)`
         */

    }

}
//    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver() ;
////static WebDriver driver ;
////    public static void main(String[] args) {
//
//
//
////        driver.get("http://ebay.com");
////        WebElement input= driver.findElement(By.name("_nkw"));
////        input.sendKeys("java book", Keys.ENTER);
////        WebElement numberOfResults= driver.findElement(By.tagName("h1"));
////        String numberResult=numberOfResults.getText();
////        System.out.println("numberResult = " + numberResult);
//
//
////        driver.get("http://ebay.com") ;
////        WebElement input = driver.findElement(By.name("_nkw")) ;
////        input.sendKeys("java book",Keys.ENTER);
////        WebElement numberOfResults = driver.findElement(By.tagName("h1")) ;
////        String numberResult=numberOfResults.getText();
////        System.out.println("numberResult = " + numberResult);
//
//
//Amazon();
//
//
//
//    }
//
//
//    public static void Amazon () {
//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver() ;
//        driver.get("www.amazon.com");
//WebElement in = driver.findElement(By.tagName("title")) ;
//in.sendKeys("coffee", Keys.ENTER);
//
//
//        //        String title = driver.getTitle();
//    }
//}
