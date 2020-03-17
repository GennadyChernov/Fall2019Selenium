package com.automation.tests.day4;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUp3 {
     public static void main(String[] args) throws InterruptedException {


          WebDriverManager.chromedriver().setup();
          WebDriver driver = new ChromeDriver();
          driver.get("http://google.com");
          Thread.sleep(2000);

          WebElement search = driver.findElement(By.name("q")) ;

          BrowserUtils.wait(3);

     //     search.sendKeys("Java", Keys.ENTER);

          search.sendKeys("Java");

          BrowserUtils.wait(3);

search.sendKeys(Keys.ENTER);

          BrowserUtils.wait(5);
          driver.quit();


     }
}