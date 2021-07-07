package Teknasyon.Teknasyon;

import org.testng.annotations.Test;

import BasePack.BaseTest;

public class ChooseImageRandomlyTest extends BaseTest{
	
	
	//Anasayfada resimlerden rastgele seçer açar ve resmin açıldığını kontrol eder
	@Test
	public void skipAds() {
		
		new skipAds(driver).skipAds();

		
		new PaintPage(driver).clickPaintRandomly().checkImageIsDisplayed();
		
	}

}
