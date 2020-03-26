package TestNgPractice;

import com.automation.tests.day5.CheckBoxesTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaTestNgDemo {

    @Test(priority = 1)
    public void test1() {
        String a = "A";
        String b = "A";

        Assert.assertEquals(a, b);


    }

    @Test(priority = 0)
    public void test2() {
        String str1 = "apple";
        String str2 = "orange";
        Assert.assertEquals(str1, str2);


    }

    @Test(priority = 2)
    public void test3() {
        String str1 = "apple";
        String str2 = "apple";
        Assert.assertEquals(str1, str2);
        System.out.println("actual " + str2 + " expected " + str1);


    }

    @Test(priority = 3)
    public void test4() {
        String str1 = "banana";
        String str2 = "peach";
        Assert.assertEquals(str1, str2);
        System.out.println("actual " + str2 + " expected " + str1);
    }

}

