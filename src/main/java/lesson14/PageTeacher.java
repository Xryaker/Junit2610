package lesson14;

import config.BaseClass;
import hillel.util.Scroling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PageTeacher extends BaseClass {

    @FindBy(xpath = "//li[@class=\"block-coaches_item\"]")
    private List<WebElement> listTeachers;

    private List<WebElement> getAllListTechers() throws InterruptedException {
        Scroling.scroll(driver);
        int i = 0;//counter
        while (true) {
            if (listTeachers.size() > i&&i<=30) {
                i = listTeachers.size();
                Scroling.scroll(driver);
                Thread.sleep(2000);

            } else {
                break;
            }
        }
        return listTeachers;
    }

    public void printList() {
        try {
            getAllListTechers();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (WebElement l : listTeachers) {
            String name = l.findElement(By.className("coach-card_name")).getText();
            String spec = l.findElement(By.className("coach-card_spec")).getText();
           // System.out.println(name+"  "+spec);
            System.out.printf("%-25s : %s",name,spec);
        }
    }
}
