package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConsultPage {
    @FindBy(id = "input-name-consultation")
    WebElement name;
    @FindBy(id = "input-email-consultation")
    WebElement email;
    @FindBy(id = "input-tel-consultation")
    WebElement tel;
    @FindBy(xpath = "//*[@id=\"form-consultation\"]/div[1]/footer/div[2]/button")
    WebElement button;
    @FindBy(className = "listbox-btn_content")
    WebElement listbox;
    @FindBy(className = "listbox_search-input")
    WebElement Listbox;
    @FindBy(className = "checkbox_checkmark")
    WebElement marck;

    public void sendKeysForm(String name, String emaIL, String telephone) {
        this.name.sendKeys(name);
        this.email.sendKeys(emaIL);
        this.tel.sendKeys(telephone);
        try {
            listbox.click();
            Listbox.sendKeys("Front-End Pro");
            Listbox.sendKeys(Keys.DOWN);
            Listbox.sendKeys(Keys.ENTER);
            marck.click();
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
    }

    public boolean buttonen() {
        return button.isEnabled();
    }
}
