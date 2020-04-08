package com.automation.tests.practice;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationForm {

    private String URL = "http://practice.cybertekschool.com/registration_form";
    private WebDriver driver;
    // p tag name of success message
    // one xpath for all inputs: //label[text()='Label name']/..//input
    private By firstNameBy = By.name("firstname");
    private By lastNameBy = By.name("lastname");
    private By usernameBy = By.name("username");
    private By emailBy = By.name("email");
    private By passwordBy = By.name("password");
    private By phoneBy = By.name("phone");
//gender
     private By maleBY = By.cssSelector("input[value='male']")  ;
     private By femaleBy = By.cssSelector("input[value='female']") ;
     private By otherBy = By.cssSelector("input[value='other']") ;

private By dateOfBirth = By.name("birthday") ;
private By department = By.name("department") ;
private By jobTitle = By.name("job_title") ;

private By language = By.xpath("//input[@id='inlineCheckbox2']") ;

private By signUp = By.id("wooden_spoon") ;





    @Test
    public void test1(){

       BrowserUtils.wait(3) ;

       driver.findElement(firstNameBy).sendKeys("Gennady");
       driver.findElement(lastNameBy).sendKeys("Chernov");
       driver.findElement(usernameBy).sendKeys("manager");
       driver.findElement(emailBy).sendKeys("gennady.chernov@yahoo.com");
       driver.findElement(passwordBy).sendKeys("12345678");
       driver.findElement(phoneBy).sendKeys("323-393-5454");
        driver.findElement(maleBY).click();
        driver.findElement(dateOfBirth).sendKeys("09/12/1988");
//       driver.findElement(department).sendKeys("Department of Engineering");
//       driver.findElement(jobTitle).sendKeys("Developer");
//       driver.findElement(language).sendKeys();

        Select departmentSelect = new Select(driver.findElement(department)) ;
        departmentSelect.selectByVisibleText("Department of Engineering");


        Select jobSelect = new Select((driver.findElement(jobTitle))) ;
        jobSelect.selectByVisibleText("Developer");

        driver.findElement(language).click();

        driver.findElement(signUp).click();

        BrowserUtils.wait(6);


        String expected = "You've successfully completed registration!";
        String actual = driver.findElement(By.tagName("p")).getText();

        Assert.assertEquals(actual, expected);

        System.out.println("actual is : " + actual + "| and expected is : " + expected);






    }



    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().version("79").setup();
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}