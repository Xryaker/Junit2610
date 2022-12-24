package someTest;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {
    @BeforeClass
    public static void startMathod() {
        System.out.println("Start testing");
    }

    @Before
    public void beforeTestMethod() {
        System.out.println("before test");
    }

    @Test
    public void test1() {
        System.out.println("test #1");
    }

    @Test
    public void test2() {
        System.out.println("test #2");
    }

    @AfterClass
    public static void endTestmathod() {
        System.out.println("end______");
    }
}
