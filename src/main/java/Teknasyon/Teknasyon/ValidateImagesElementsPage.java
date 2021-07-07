package Teknasyon.Teknasyon;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePack.BasePageUtil;
import canstants.constants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ValidateImagesElementsPage extends BasePageUtil implements constants {

	public ValidateImagesElementsPage(AndroidDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	//ekrandaki resim sayısını alır
	public Integer getImagesSize() {

		//resimler açılmasını en fazla 10 saniye bekle
		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(By.id("com.teknasyon.coloringbook:id/templateImage")));
		List<MobileElement> ele = driver.findElements(By.id("com.teknasyon.coloringbook:id/templateImage"));
		int ele_size = ele.size();
		return ele_size;
	}
	
	//resim sayısını validate eder

	public ValidateImagesElementsPage validateImageSize() {
		System.out.println("Alınan resim sayısı: " + getImagesSize());
		assertTrue(getImagesSize().equals(ImageSize),
				"Beklenen ekrandaki resim değeri " + ImageSize + " Alınan resim sayısı" + getImagesSize() + " eşleşmemektedir");
		return this;
	}

}
