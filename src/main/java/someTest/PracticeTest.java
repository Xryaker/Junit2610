package someTest;

import config.BaseClass;
import data.DataProvaderUsers;
import data.User;
import org.junit.*;

import pageObjects.PracticeForm;



import static org.junit.Assert.*;
import static hillel.util.Scroling.scroll;

public class PracticeTest extends BaseClass {
    static PracticeForm practiceForm;

    @BeforeClass
    public static void initiaL() {
        driver.get("https://demoqa.com/automation-practice-form");
        practiceForm = new PracticeForm(driver);
    }

    @After
    public void afterTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.navigate().refresh();
    }

    @Test
    public void test1() {
        practiceForm.setFirstName("vasiliy");
    }

    @Test
    public void test2() {
        practiceForm.completForm("Vasiliy", "Shevchenko", "Vasiliy@bigmir.net", "Male", "45612398");
    }

    @Test
    public void test3() {
        practiceForm.completForm(new User());
    }

    @Test
    public void test4() {
        practiceForm.completForm(DataProvaderUsers.getValidUser());
        System.out.println(new User());
    }
String URL="http://....";
    @Test
    public void test5() {
        //assertTrue("Button not enabled",!practiceForm.isButtonEnabled());
        assertEquals("URL not equals!!!",URL,driver.getCurrentUrl());

    }
}
