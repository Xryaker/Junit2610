package parametrizedtest;

import config.BaseConsult;
import data.UserEnaum;
import data.WIKILanguage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pageObjects.ConsultPage;
import pageObjects.WIKIPage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;
@RunWith(Parameterized.class)
public class ParamConsult extends BaseConsult {

    @Parameterized.Parameters
    public static Collection options() {
        return Arrays.asList(UserEnaum.values());
    }

    public ParamConsult(UserEnaum users) {
        if (bundle==null||!bundle.getString("type").equals(users.getType())) {
            driver.get("https://dnipro.ithillel.ua/");
            driver.findElement(By.id("btn-consultation-hero")).click();
            bundle = ResourceBundle.getBundle(users.getType());
            consultPage = PageFactory.initElements(driver, ConsultPage.class);
        }
    }
    @Test
    public void createMail(){
        consultPage.sendKeysForm(bundle.getString("name"),bundle.getString("email"),bundle.getString("tel"));
        Assert.assertEquals(bundle.getString("bol"),String.valueOf(consultPage.buttonen()));
    }
}
