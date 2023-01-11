package someTest;

import config.BaseClass;
import config.Browsers;
import config.DriverConfig;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class JunitTestWhitDriver extends BaseClass {
    By inputYoutube = By.tagName("input");

    @BeforeClass
    public static void starttestinputYoutube(){
        driver.get("https://youtube.com");
    }


    @Test
    public void test1() throws Exception {
        Assert.assertEquals("YouTube",driver.getTitle());

    }

    @Test
    public void test2() {
        WebElement inpuElement=driver.findElement(inputYoutube);
        inpuElement.sendKeys("Ukraine");
//        driver.findElement(inputYoutube).submit();
        inpuElement.sendKeys(Keys.ENTER);
        System.out.println(driver.getTitle());
    }
    @Test
    public void test3(){
        WebElement element=driver.findElement(By.id("contents"));
        List<WebElement> listElements=element.findElements(By.tagName("img"));
        for(WebElement l:listElements){
            System.out.println(l.getAttribute("src"));
        }

    }
}
