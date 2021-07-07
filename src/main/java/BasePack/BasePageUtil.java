package BasePack;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BasePageUtil {
	
	public static AndroidDriver<MobileElement> driver;



	public BasePageUtil(AndroidDriver<MobileElement> driver) {

		this.driver = driver;
	}

	
	public void sleep(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickCalismalarim() {

		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(By.id("com.teknasyon.coloringbook:id/myWork")));

		driver.findElement(By.id("com.teknasyon.coloringbook:id/myWork")).click();
	}

	public void clickSettings() {

		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(By.id("com.teknasyon.coloringbook:id/others")));

		driver.findElement(By.id("com.teknasyon.coloringbook:id/others")).click();
	}

	

}
