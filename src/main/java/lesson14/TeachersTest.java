package lesson14;

import config.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class TeachersTest extends BaseClass {
   static PageTeacher teacher;
    @BeforeClass
    public static void stest(){
        driver.get("https://ithillel.ua/coaches");
        teacher= PageFactory.initElements(driver, PageTeacher.class);
    }
    @Test
    public void test1(){
        teacher.printList();
    }

}
