package officeHours;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class SeleniumOH1 {


    public static void main(String[] args) {

        ArrayList<String>keysToSearch = new ArrayList<>();
        keysToSearch.add("fruits");
        keysToSearch.add("veggies");
        keysToSearch.add("berries");
        Iterator iterator = keysToSearch.iterator();

        // iterator () return iterator type which we can use with all iterator methods
        // [fruits, veggies, berries]

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

// add * to each string in list before printing


        Iterator <String> iterator1 = keysToSearch.iterator();
        while (iterator1.hasNext()){
            String item = iterator1.next();

            System.out.println(item);
            System.out.println("*" + item);
        }


        //create a map with <String, String>

        HashMap<String, String> personalInfo = new HashMap<>() ;
        personalInfo.put("name", "Bryan");
        personalInfo.put("student id", "34354322");
        personalInfo.put("Major", "computer science") ;

        Iterator<String>mapIterator = personalInfo.keySet().iterator() ;
        while (mapIterator.hasNext()){
            String key = mapIterator.next();
            System.out.println(mapIterator.next() + ":" + personalInfo.get(key));
        }


        // ===========================
        // SELENIUM
        /*

        id - unique (it is not always available)
        class - classname
        name
        tag - every element will have a tag

        linkText

        partial linkText

        css
        xpath


         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver() ;
        driver.get("http://etsy.com");
        WebElement searchBar = driver.findElement(By.id("global-enhancements-search-query")) ;




    }

}
