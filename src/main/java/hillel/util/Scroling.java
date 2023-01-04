package hillel.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scroling {
    public static void scrollToElementVisibilityOf(WebDriver driver, By by) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        boolean bool = true;
        while (bool) {
            try {
                driver.findElement(by);
                bool = false;
            } catch (Exception ignore) {
                js.executeScript("window.scrollBy(0,10)");
            }
        }
    }

    public static void scroll(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2500)");

    }


}
