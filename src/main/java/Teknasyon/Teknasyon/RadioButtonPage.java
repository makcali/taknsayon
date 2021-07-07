package Teknasyon.Teknasyon;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

import BasePack.BasePageUtil;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class RadioButtonPage extends BasePageUtil{

	public RadioButtonPage(AndroidDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//radio butona tıklar
	public RadioButtonPage clickRadioButton() {
		
		driver.findElement(By.id("radioButton")).click();
		return this;
	}
	
	//radio butonun seçildiğini kontrol eder
	public RadioButtonPage validateRadioButtonSelected() {
		
		assertTrue(driver.findElements(By.xpath("//['radio']:checked'")).size() > 0 , "Radio button seçili değildir");
		return this;
	}

}
