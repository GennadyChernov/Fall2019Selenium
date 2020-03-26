package com.automation.tests.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class VerifyThatElementIsGone {

    /**
     * Interview question:
     * <p>
     * how to check if element doesn't exists any more in th DOM (Document Object Model (that HTML code))
     */

    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        Thread.sleep(2000);

        driver.findElement(By.id("disappearing_button")).click();
        Thread.sleep(2000);


        // one way
        if (driver.findElements(By.id("disappearing_button")).size() == 0) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        //list

        List<WebElement> list = driver.findElements(By.id("disappearing_button"));

        //if size is 0, that means no elements were found

        if (list.size() == 0) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }

        // another way is.Empty
        if (list.isEmpty()) {
            System.out.println("yea");

        } else {
            System.out.println("no");
        }


        Thread.sleep(2000);
        //to find all buttons
        //make sure that you us findElements <--- ending is important
        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        for (WebElement button : buttons) {
            //click on every button
            button.click();
            Thread.sleep(2000);
        }


        driver.quit();


/*

findElements() ----- to find lots of elements at once. Returns List<WebElement>

in case of findElement - you are getting 1 element. If locator is wrong - NoSuchElementException.

in case of findElements - you can get 0+ elements. if locator is wrong or element is gone already, you will get empty list.

all links have <a> tag

StaleElementReferenceException - selenium cannot use webelement any more. Element is old.

 */


    }
}
