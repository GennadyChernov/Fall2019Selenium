package TestNgPractice;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

public class MixedAnnotationTesting {
    WebDriver driver;
    @BeforeClass
    public void beforeClass() {
        System.out.println("before class");
        WebDriverManager.chromedriver().version("79").setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @BeforeMethod
    public void setUp(){
        System.out.println("before method");
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);

    }

    @Test
    public void test1(){
        System.out.println("i am a test1");
        int expectedYear = 2020;
        String expectedMonth = "March" ;
        int expectedDay = 26;
        BrowserUtils.wait(3);
        //we use select class to read dropdown value

        Select selectYear = new Select((driver.findElement(By.id("year"))));
        Select selectMonth = new Select (driver.findElement(By.id("month")));
        Select selectDay = new Select (driver.findElement(By.id("day")));
// read a text of selected option and convert it into integer
        int actualYear = Integer.parseInt(selectYear.getFirstSelectedOption().getText()) ;
        String actualMonth = selectMonth.getFirstSelectedOption().getText();
        int actualDay = Integer.parseInt(selectDay.getFirstSelectedOption().getText()) ;
//assert expected values are the same as actual
        Assert.assertEquals(actualYear,expectedYear);
        Assert.assertEquals(actualMonth,expectedMonth);
        Assert.assertEquals(actualDay,expectedDay);








        BrowserUtils.wait(3);




    }

    @AfterMethod
    public void tearDown(){

        driver.quit();
    }

}
