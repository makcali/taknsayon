package Teknasyon.Teknasyon;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePack.BasePageUtil;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class skipAds extends BasePageUtil {
	
	public skipAds(AndroidDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void skipAds() {
		
		skipFirstAds1();
		skipFirstAds2();
	}
	

	public void skipFirstAds1() {
		
		//skip butonunun açılmasını 10 saniye içinde ara
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("skipButton")));

		System.out.println("başladı");

		driver.findElement(By.id("skipButton")).click();
		driver.findElementById("skipButton").click();
		driver.findElementById("skipButton").click();

		
	}
	
	public void skipFirstAds2() {
		
		
		sleep(8);
		System.out.println("başladı");

		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(new PointOption().withCoordinates(105, 95)).perform();
		
		System.out.println("skip ads");
		
	}

}
