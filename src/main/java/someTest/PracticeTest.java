package someTest;

import config.BaseClass;
import data.DataProvaderUsers;
import data.User;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObjects.PracticeForm;

public class PracticeTest extends BaseClass {
   static PracticeForm practiceForm;
    @BeforeClass
    public static void initiaL(){
        driver.get("https://demoqa.com/automation-practice-form");
        practiceForm=new PracticeForm(driver);
    }
    @After
    public void afterTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.navigate().refresh();
    }
    @Test
    public void test1(){
        practiceForm.setFirstName("vasiliy");
    }
    @Test
    public void test2(){
        practiceForm.completForm("Vasiliy","Shevchenko","Vasiliy@bigmir.net","Male","45612398");
    }
    @Test
    public void test3(){
        practiceForm.completForm(new User());
    }
    @Test
    public void test4(){
        practiceForm.completForm(DataProvaderUsers.getValidUser());
        System.out.println(new User());
    }

}
