package hillel.tests;

import config.BaseClass;
import hillel.pageobject.IndexPage;
import net.bytebuddy.implementation.bytecode.Throw;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static hillel.pageobject.IndexPage.*;

public class TestMainScreen extends BaseClass {
    static IndexPage indexPage= PageFactory.initElements(driver, IndexPage.class);
    @Before
    public  void setUpBeforeTestMainScreen(){
        if(!driver.getCurrentUrl().contains("https://dnipro.ithillel.ua/")){
        driver.get("https://dnipro.ithillel.ua/");}
    }

    @Test
    public void blogButtonTest() throws Exception {
        indexPage.blogButtonClick();
        if(!driver.getCurrentUrl().contains("https://blog.ithillel.ua/")){
            throw new Exception("Url not equals");
        }
    }

    @Test
    public void blogButtonTest2() throws Exception {
        if(!indexPage.getBlogButtonText().equals("блог")){
            throw new Exception("buttontext not equals");
        }
    }
    @Test
    public void contactsTest() throws Exception {
        indexPage.contactsButtonClick();
        if(!driver.getCurrentUrl().contains("https://dnipro.ithillel.ua/contact")){

            throw new Exception("Url not equals actual: "+driver.getCurrentUrl());
        }
    }


}
