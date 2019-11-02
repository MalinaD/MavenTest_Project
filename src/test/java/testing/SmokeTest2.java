package testing;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest2 extends BaseTest {
    @Test
    public void test3() {
        Assert.assertTrue(true);
    }

    @Test
    public void test4() {
        Assert.fail("Failed!");
    }
}
