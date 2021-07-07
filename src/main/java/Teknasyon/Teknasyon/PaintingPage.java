package Teknasyon.Teknasyon;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

import BasePack.BasePageUtil;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class PaintingPage extends BasePageUtil{

	public PaintingPage(AndroidDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public PaintingPage painting() {
		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(new PointOption().withCoordinates(388, 959)).perform();
		return this;
	}
	
	public PaintingPage clickSaveButton() {
		MobileElement ele = driver.findElement(By.id("com.teknasyon.coloringbook:id/doneIcon"));
		driver.findElement(By.id("com.teknasyon.coloringbook:id/doneIcon")).click();
		return this;
	}
	

	
	public PaintingPage validateSavePage() {
		MobileElement ele = driver.findElement(By.id("com.teknasyon.coloringbook:id/save"));
		String save = ele.getText();
		assertTrue(save.contains("Save"), "Save butonu görüntülenmemekte");
		MobileElement ele1 = driver.findElement(By.id("com.teknasyon.coloringbook:id/shareText"));
		String share = ele1.getText();
		assertTrue(share.contains("Share"), "Share butonu görüntülenmemekte");
		return this;
	}
	
	public PaintingPage clickSaveOnSavePage() {
		MobileElement ele = driver.findElement(By.id("com.teknasyon.coloringbook:id/save"));
		driver.findElement(By.id("com.teknasyon.coloringbook:id/save")).click();
		return this;
	}

}
