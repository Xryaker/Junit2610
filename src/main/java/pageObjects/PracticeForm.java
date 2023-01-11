package pageObjects;

import data.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PracticeForm {
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By emailAdress = By.id("userEmail");
    By genderWrapper = By.id("genterWrapper");
    By userNumber = By.id("userNumber");
    By buttonPIC = By.xpath("//*[@id=\"uploadPicture\"]");

    public PracticeForm(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    public void setFirstName(String name) {
        driver.findElement(firstName).sendKeys(name);
    }

    public void completForm(String name, String lastName, String email, String gender, String tel) {
        driver.findElement(firstName).sendKeys(name);
        driver.findElement(this.lastName).sendKeys(lastName);
        driver.findElement(emailAdress).sendKeys(email);
        changeGender(gender);
        driver.findElement(userNumber).sendKeys(tel);
    }

    public boolean isButtonEnabled() {
        return driver.findElement(buttonPIC).isEnabled();
    }

    private void changeGender(String gender) {
        List<WebElement> genderlistElements = driver.findElement(genderWrapper).findElements(By.tagName("label"));
        for (WebElement l : genderlistElements) {
            if (l.getText().equals(gender)) {
                l.click();
            }
        }

    }

    public void completForm(User us) {
        driver.findElement(firstName).sendKeys(us.getName());
        driver.findElement(this.lastName).sendKeys(us.getLastName());
        driver.findElement(emailAdress).sendKeys(us.getEmail());
        changeGender(us.getGender());
        driver.findElement(userNumber).sendKeys(us.getTelephone());
    }
}
