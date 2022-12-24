package config;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    static public WebDriver driver;
    @BeforeClass
    public static void starT() {
        driver = DriverConfig.createDriver(Browsers.CHROMEINCOGNITO);
    }
    @AfterClass
    public static void enD() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
