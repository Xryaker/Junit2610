package hillel.tests;

import config.BaseClass;
import hillel.pageobject.BlogPage;
import hillel.util.Scroling;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class TestBlogPage extends BaseClass {
    //
    static BlogPage blogPage= PageFactory.initElements(driver, BlogPage.class);
    String mainUrl="https://blog.ithillel.ua/publications/gamedev";

    @Before
    public  void setUpBeforeTestBlogScreen(){
        if(!driver.getCurrentUrl().contains(mainUrl)){
            driver.get(mainUrl);}
    }

    @Test
    public void test1() throws InterruptedException {
        int i=0;//counter
        while(true){
            if(blogPage.getSizeListNews()>i){
                i= blogPage.getSizeListNews();
                Scroling.scroll(driver);
                Thread.sleep(1000);
            }else {
                break;
            }
        }
        blogPage.printListNews();
    }
}
