package example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaternPageFactory {
    @FindBy(xpath = "somelocator")
    private WebElement element1;



    public String getText(){
        ///.......
        somePrivateMethod();
        String str;
        str=element1.getText();
        return str;
    }

    private void somePrivateMethod() {
    }


}
