package Teknasyon.Teknasyon;

import org.testng.annotations.Test;

import BasePack.BaseTest;

public class skipAdsTest extends BaseTest{
	
	
	//Başlangıçtaki reklamları kapatır
	
	@Test
	public void skipAds() {
		
		new skipAds(driver).skipAds();

	}

}
