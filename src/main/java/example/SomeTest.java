package example;

import config.BaseClass;
import org.junit.BeforeClass;
import example.PaternPageObject;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class SomeTest extends BaseClass {
    static PaternPageObject paternPageObject;
    static PaternPageFactory paternPageFactory;
    @BeforeClass
    public static void someNameMethod(){
        driver.get("some URL");
        paternPageObject=new PaternPageObject(driver);
        paternPageFactory= PageFactory.initElements(driver,PaternPageFactory.class);
    }
    @Test
    public void test1(){
        System.out.println(paternPageObject.getCourseTitle());
        paternPageFactory.getText();
        SingletonePatern singletonePatern=SingletonePatern.getSingletonePatern();
    }
}
