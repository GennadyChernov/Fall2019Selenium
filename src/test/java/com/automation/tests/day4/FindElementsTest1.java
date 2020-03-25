package com.automation.tests.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsTest1 {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        //  Thread.sleep(3000);

        //how to collect all links from the page?
        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));
            System.out.println();

        }


        for (int i = 1; i < links.size(); i++) {

            links.get(i).click();
            //  Thread.sleep(2000);

           // driver.findElements(By.tagName("a")).get(i).click(); // the other way // minimalistic // but confusing
            driver.navigate().back();
            // Thread.sleep(2000);
            //refresh list
           links = driver.findElements(By.tagName("a"));

        }

/*
StaleElementReferenceException: stale element reference: element is not attached to the page document

Interview question: what is StaleElementReferenceException?

StaleElementReferenceException - means that selenium cannot find previously located element.

It happens, when you are trying to interact with element after page refresh or navigation


How to handle it?

- if it occurs, you need to find element again.

try{
//if it generates exception once in a while,
//put it into try/catch and try to find element one more time

driver.findElement(By.id("name")).click()

}catch(StaleElementReferenceException e){

driver.findElement(By.id("name")).click()
}


what happens if element wasn't found, in case of findElement?

NoSuchElementException

what happens if elements weren't found, in case of findElements?

nothing, you will get empty list.


Interview question: how to check if element doesn't exists any more/ just doesn't exist?

check if collection/list is empty

if(driver.findElements(By.id("name")).size() == 0){

element doesn't exist!
}

You can use findElements method to find 0+ elements

In case of findElement - only 1 element. If there is no element by given locator - NoSuchElementExcetion

*/


        driver.quit();
    }
}