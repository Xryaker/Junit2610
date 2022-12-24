package someTest;

import config.BaseClass;
import org.junit.Test;

public class TEST extends BaseClass {
    @Test
    public  void test() {
        driver.get("https://google.com");
    }
}
