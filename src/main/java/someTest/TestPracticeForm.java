package someTest;

import config.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestPracticeForm extends BaseClass {
    /////*[@id="userName-wrapper"]/div[1]
    @BeforeClass
    public static void iniTPage() {
        driver.get("https://demoqa.com/text-box");
    }

    @Test
    public void test1() {
        WebElement inpulName = driver.findElement(By.id("userName-wrapper"))
                .findElement(By.xpath("//div[contains(@class,\"col-md-\") and contains(@class,\"col-sm-12\")]"));
    driver.findElement(By.xpath("//input[@id=\"userName\"]")).sendKeys("Vasiliy");
    }
}
