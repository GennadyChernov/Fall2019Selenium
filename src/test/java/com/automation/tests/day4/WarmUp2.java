package com.automation.tests.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUp2 {

    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver() ;

        driver.get("www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book", Keys.ENTER);
        String title = driver.getTitle();
        if (title.contains("java book")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test Failed");
        }
        driver.quit();


    }

}