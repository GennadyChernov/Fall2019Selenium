package com.automation.tests.day5;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons1 {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/radio_buttons");
        driver.manage().window().maximize();
        BrowserUtils.wait(2);


// <input type="radio">
        List<WebElement> radioButtons = driver.findElements(By.tagName("input"));

        for (WebElement radioButton : radioButtons) {
            String id = radioButton.getAttribute("id") ;
            if (radioButton.isEnabled()) { //<<-- to check if button can be clicked
                radioButton.click();
            System.out.println("Clicked on :: " + id);
            BrowserUtils.wait(1);
        } else {
                System.out.println("Button is disabled, not clicked :: " + id);
            }



        }



        driver.quit();

    }
}
