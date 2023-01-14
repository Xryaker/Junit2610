package parametrizedtest;

import config.BaseClass;
import config.WIKIPARAMETRAZIDbase;
import data.WIKILanguage;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import pageObjects.WIKIPage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;

@RunWith(Parameterized.class)
public class WKItest extends WIKIPARAMETRAZIDbase {


    @Parameterized.Parameters
    public static Collection options() {
        return Arrays.asList(WIKILanguage.values());
    }

    public WKItest(WIKILanguage language) {
        bundle = ResourceBundle.getBundle(language.getLang());
        if (!driver.getCurrentUrl().contains("https://" + bundle.getString("lang") + ".wikipedia.org/")) {
            driver.get("https://" + bundle.getString("lang") + ".wikipedia.org/");
            wikiPage = PageFactory.initElements(driver, WIKIPage.class);
        }
    }

    @Test
    public void test1() {
        Assert.assertEquals(bundle.getString("menutab1"), wikiPage.getmenuTab1text());
    }

    @Test
    public void test2() {
        Assert.assertEquals(bundle.getString("menutab2"), wikiPage.getmenuTab2text());
    }
    @Test
    public void test3(){
        Assert.assertEquals(bundle.getString("menutab3"), wikiPage.getmenuTab3text());
    }
}
