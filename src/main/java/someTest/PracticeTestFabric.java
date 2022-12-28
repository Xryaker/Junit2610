package someTest;

import config.BaseClass;
import data.User;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageObjects.PracticeFormPageFactory;

public class PracticeTestFabric extends BaseClass {
   static PracticeFormPageFactory formFactory;
   @BeforeClass
   public static void start(){
       driver.get("https://demoqa.com/automation-practice-form");
       formFactory=new PracticeFormPageFactory(driver);
   }
    @Test
    public void test1(){
        formFactory.copleteForm(new User(),"Economics");

    }
}
