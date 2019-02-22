package exp.core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class TestBase {
    private static AppiumDriverLocalService service;
    protected static AppiumDriver<AndroidElement> driver;

    @BeforeAll
    static void beforeClass() {
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();

        File appDir = new File("src/test/resources");
        File app = new File(appDir, "app-debug_staging.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("noSign", true);
        capabilities.setCapability("appWaitDuration", 30000);
        driver = new AppiumDriver<>(service.getUrl(), capabilities);
    }

    @AfterAll
    static void afterClass() {
        if (driver != null) {
            driver.quit();
        }
        if (service != null) {
            service.stop();
        }
    }
}
