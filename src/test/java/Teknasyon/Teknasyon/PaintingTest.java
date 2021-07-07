package Teknasyon.Teknasyon;

import org.testng.annotations.Test;

import BasePack.BasePageUtil;
import BasePack.BaseTest;

public class PaintingTest extends BaseTest{
	
	@Test
	public void painting() {
		new skipAds(driver).skipAds();
		
		//rastgele resim seçer
		new PaintPage(driver).clickPaintRandomly().checkImageIsDisplayed();
		//boyar ve kaydeder
		new PaintingPage(driver).painting().clickSaveButton().validateSavePage().clickSaveOnSavePage();
		
		//çalışmalarıma gider, rkaydedilen resmi kontrol eder
		new BasePageUtil(driver).clickCalismalarim();
		new MyWorksPage(driver).validateSavedPaint().clickSavedPainting();
		//kaydedilen resmi siler
		new MyWorksPage(driver).clickDeletePainting().validateDeleteText().clickOkButton();
		
		
		//Silme işlemini kontrol eder
		
		new MyWorksPage(driver).checkMyWorksTitleDisplay().checkMyWorksWarningMessageDisplay();
		
	}

}
