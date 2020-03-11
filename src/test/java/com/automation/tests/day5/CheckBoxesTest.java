package com.automation.tests.day5;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxesTest {
    public static void main(String[] args) {



        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");


        BrowserUtils.wait(5);
        List<WebElement> checkBoxes = driver.findElements(By.tagName("input"));
        if(!checkBoxes.get(0).isSelected() && checkBoxes.get(1).isSelected()){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }

BrowserUtils.wait(2);


       // checkBoxes.get(0).click();



        WebElement checkBox1 = checkBoxes.get(0) ;
        checkBox1.click();

        if (checkBox1.isSelected()) {
            System.out.println("Test passed");
            System.out.println("checkbox #1 is selected");
        }else {
            System.out.println("Test failed");
            System.out.println("checkbox #1 is not selected");

        }

        driver.quit();

    }
}
