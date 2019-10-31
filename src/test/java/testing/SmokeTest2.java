package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest2 {
    @Test
    public void test3() {
        Assert.assertTrue(true);
    }

    @Test
    public void test4() {
        Assert.fail("Failed!");
    }
}
