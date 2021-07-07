package Teknasyon.Teknasyon;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePack.BasePageUtil;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MyWorksPage extends BasePageUtil{

	public MyWorksPage(AndroidDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public MyWorksPage checkMyWorksTitleDisplay() {
		MobileElement ele = driver.findElement(By.id("com.teknasyon.coloringbook:id/toolbarTitle"));
		String title = ele.getText();
		assertTrue(title.equals("My Works"), "Çalışmalarım/My Works ekranı açılmadı");
		return this;
	}
	
	public MyWorksPage checkMyWorksWarningMessageDisplay() {
		
		MobileElement ele = driver.findElement(By.id("com.teknasyon.coloringbook:id/textView"));
		String title = ele.getText();
		assertTrue(title.equals("Oppsss! You don't have any painting yet"), "Çalışmalarım ekranındaki uyarı mesajı görünütlenmemekte");
		return this;
		
	}
	
	public MyWorksPage validateSavedPaint() {
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("com.teknasyon.coloringbook:id/templateImage")));
		List<MobileElement> ele = driver.findElements(By.id("com.teknasyon.coloringbook:id/templateImage"));
		int size = ele.size();
		assertTrue(size>0, "Kaydedilen resim çalışmalarımda gözükmemekte");
		return this;
	}
	
	public MyWorksPage clickSavedPainting() {
		driver.findElement(By.id("com.teknasyon.coloringbook:id/templateImage")).click();
		return this;
	}
	
	public MyWorksPage clickDeletePainting() {
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("com.teknasyon.coloringbook:id/delete")));
		driver.findElement(By.id("com.teknasyon.coloringbook:id/delete")).click();
		return this;
	}
	
	public MyWorksPage validateDeleteText() {
		MobileElement ele = driver.findElement(By.id("com.teknasyon.coloringbook:id/deleteText"));
		String text = ele.getText();
		assertTrue(text.contains("Are you sure you want to delete this picture?"), "Resmi silme Pop-up'ı açılmamıştır veya Uyarı mesajı eşleşmemektedir");
		return this;
	}
	
	public MyWorksPage clickOkButton() {
		driver.findElement(By.id("com.teknasyon.coloringbook:id/deleteWork")).click();
		return this;
	}
	
	public MyWorksPage validateDeletedPaint() {
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("com.teknasyon.coloringbook:id/templateImage")));
		List<MobileElement> ele = driver.findElements(By.id("com.teknasyon.coloringbook:id/templateImage"));
		int size = ele.size();
		assertTrue(size <=1, "Kaydedilen resim çalışmalarımda gözükmemekte");
		return this;
	}

}
