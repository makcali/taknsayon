package Teknasyon.Teknasyon;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

import BasePack.BasePageUtil;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ElementCheckPage extends BasePageUtil {

	public ElementCheckPage(AndroidDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	//Ana ekrandaki elementlerin kontrolü
	public ElementCheckPage checkHomeButtonExists() {

		assertTrue(driver.findElements(By.id("com.teknasyon.coloringbook:id/home")).size() > 0,
				"HomePage butonu görüntülenmemekte");

		return this;
	}

	public ElementCheckPage checkCategoriesButtonExists() {

		assertTrue(driver.findElements(By.id("com.teknasyon.coloringbook:id/categories")).size() > 0,
				"Kategoriler butonu görüntülenmemekte");

		return this;
	}

	public ElementCheckPage checkMyWorkButtonExists() {

		assertTrue(driver.findElements(By.id("com.teknasyon.coloringbook:id/myWork")).size() > 0,
				"Çalışmalarım butonu görüntülenmemekte");

		return this;
	}

	public ElementCheckPage checkOthersButtonExists() {

		assertTrue(driver.findElements(By.id("com.teknasyon.coloringbook:id/others")).size() > 0,
				"Diğerleri butonu görüntülenmemekte");

		return this;
	}

	public ElementCheckPage checkSliderExists() {

		assertTrue(driver.findElements(By.id("com.teknasyon.coloringbook:id/sliderImage")).size() > 0,
				"Slider görüntülenmemekte");

		return this;

	}

	public ElementCheckPage checkSliderIndicatorExists() {

		assertTrue(driver.findElements(By.id("com.teknasyon.coloringbook:id/pagerIndicator")).size() > 0,
				"Slider Indicator görüntülenmemekte");

		return this;
	}
}
