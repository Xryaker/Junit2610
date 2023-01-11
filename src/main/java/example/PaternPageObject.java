package example;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaternPageObject {
    private WebDriver driver;

    By  someName=By.name("someLocator");//By.xpath....
    //......
    public PaternPageObject(WebDriver webDriver){
        this.driver=webDriver;
    }

    public String getCourseTitle(){
        String str;
        ///......
        someMethodPrivate();
        WebElement element1=driver.findElement(someName);
        str=element1.getText();

        return str;
    }

    private void someMethodPrivate() {
    }
}
