package exp;

import exp.core.TestBase;
import org.junit.jupiter.api.Test;

class Probe extends TestBase {
    @Test
    void probe() {
        driver.findElementById("mobile_phone").isDisplayed();
        driver.findElementById("mobile_phone").setValue("8881212345");
    }
}
