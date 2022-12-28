package pageObjects;

import data.User;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PracticeFormPageFactory {

    @FindBy(id = "firstName")
    WebElement firtName;
    @FindBy(id = "lastName")
    WebElement lastName;
    @FindBy(id = "userEmail")
    WebElement email;
    @FindBy(xpath = "//div[contains(@class,\"custom-control\") ]/label[contains(@for,\"gender-radio\")]")
    List<WebElement> listGenders;
    @FindBy(id = "userNumber")
    WebElement userNam;
    //class="subjects-auto-complete__menu-list subjects-auto-complete__menu-list--is-multi css-11unzgr"
    @FindBy(id = "subjectsInput")
    WebElement subjectInput;
    @FindBy(xpath = "//div[contains(@id,\"react-select-2-option\")]")
    List<WebElement> subjectList;
    @FindBy(id = "subjectsWrapper")
    WebElement wraper;

    public void sendSubject(String subjectName) {
        subjectInput.sendKeys(subjectName);
        for (int i = 0; i < subjectList.size(); i++) {
            subjectInput.sendKeys(Keys.DOWN);
            if (wraper.findElement(By.xpath("//div[contains(@class,\"subjects-auto-complete__option--is-focused\")]")).getText().contains(subjectName)) {
                subjectInput.sendKeys(Keys.ENTER);
            }
        }

    }


    public PracticeFormPageFactory(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void copleteForm(User usr, String subjectName) {
        copleteForm(usr);
        sendSubject(subjectName);
    }

    public void copleteForm(User ur) {
        firtName.sendKeys(ur.getName());
        lastName.sendKeys(ur.getLastName());
        email.sendKeys(ur.getEmail());
        selectGender(ur.getGender());
        userNam.sendKeys(ur.getTelephone());
    }

    private void selectGender(String gender) {
        for (WebElement l : listGenders) {
            if (l.getText().equals(gender)) {
                l.click();
            }
        }
    }

}
