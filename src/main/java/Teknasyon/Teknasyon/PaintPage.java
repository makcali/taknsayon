package Teknasyon.Teknasyon;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePack.BasePageUtil;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PaintPage extends BasePageUtil{

	public PaintPage(AndroidDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public PaintPage clickPaintRandomly() {

		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		 wait.until(ExpectedConditions.elementToBeClickable(By.id("com.teknasyon.coloringbook:id/templateImage")));
		

		List<MobileElement> ele = driver.findElements(By.id("com.teknasyon.coloringbook:id/templateImage"));
		
		Random r = new Random();
		int randomValue = r.nextInt(ele.size()); //Getting a random value that is between 0 and (list's size)-1
		ele.get(randomValue).click(); //Clicking on the random item in the list.
		
		sleep(5);
		return this;
	}
	
	public PaintPage checkImageIsDisplayed() {
		
		MobileElement ele = driver.findElement(By.id("com.teknasyon.coloringbook:id/colorImageView"));
		
		assertTrue(ele.isDisplayed(), "Paint ekranı açılmadı");
		return this;
	}

}
