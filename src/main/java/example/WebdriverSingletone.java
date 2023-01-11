package example;

import config.Browsers;
import config.DriverConfig;
import org.openqa.selenium.WebDriver;

public class WebdriverSingletone {
    private static WebdriverSingletone userSingletone;
    private static WebDriver driver;
    public static WebDriver getSingletone() {
        if(userSingletone==null){
            driver= DriverConfig.createDriver(Browsers.CHORME);
        }
        return driver;
    }
}
