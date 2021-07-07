package Teknasyon.Teknasyon;

import org.openqa.selenium.By;

import BasePack.BasePageUtil;
import canstants.constants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SetTextPage extends BasePageUtil implements constants {

	public SetTextPage(AndroidDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public SetTextPage setText() {

		driver.findElement(By.id("username")).sendKeys(UserName);
		
		return this;
	}

}
