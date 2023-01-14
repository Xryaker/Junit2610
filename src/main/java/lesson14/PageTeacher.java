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

    private void scrollToEnd(int kol) {
        Scroling.scroll(driver);
        int i = 0;//counter
        while (true) {
            if (listTeachers.size() > i && i <= kol) {
                i = listTeachers.size();
                Scroling.scroll(driver);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            } else {
                break;
            }
        }

    }

    public void printList() {
        scrollToEnd(30);
        for (WebElement l : listTeachers) {
            String name = l.findElement(By.className("coach-card_name")).getText();
            String spec = l.findElement(By.className("coach-card_spec")).getText();
            // System.out.println(name+"  "+spec);
            System.out.printf("%-25s : %s", name, spec);
        }
    }
}
