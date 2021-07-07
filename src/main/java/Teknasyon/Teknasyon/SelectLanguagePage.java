package Teknasyon.Teknasyon;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePack.BasePageUtil;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SelectLanguagePage extends BasePageUtil {

	public SelectLanguagePage(AndroidDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// diller ayarını seçer
	public SelectLanguagePage goToLanguages() {

		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(By.id("com.teknasyon.coloringbook:id/languageText")));

		driver.findElement(By.id("com.teknasyon.coloringbook:id/languageText")).click();

		return this;
	}

	// scroll down yapıp dil seçer
	public static void scrollIntoView(String Text) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\""
						+ Text + "\").instance(0))")
				.click();
	}

}
