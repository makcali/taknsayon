package BasePack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class BaseTest {

	protected AndroidDriver<MobileElement> driver;

	@BeforeTest
	public void driverSetup() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Teknasyon");
		capabilities.setCapability("udid", "emulator-5554");
		capabilities.setCapability("platformVersion", "8");
		capabilities.setCapability("automationName", "uiautomator2");
		capabilities.setCapability("appPackage", "com.teknasyon.coloringbook");
		capabilities.setCapability("appActivity", "com.teknasyon.coloringbook.view.activity.SplashActivity");

		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	}

	@AfterTest
	public void driverQuit() {
		// driver.quit();
	}

}
