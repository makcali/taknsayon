package Teknasyon.Teknasyon;

import org.testng.annotations.Test;

import BasePack.BasePageUtil;
import BasePack.BaseTest;

public class MyWorksTest extends BaseTest{
	
	
	//Çalışmalarım sayfasına gidip Bannerları ve uyarı mesajını kontrol eder
	@Test
	public void MyWorks() {
		
		new skipAds(driver).skipAds();
		
		
		new BasePageUtil(driver).clickCalismalarim();
		new MyWorksPage(driver).checkMyWorksTitleDisplay().checkMyWorksWarningMessageDisplay();
		
		
	}

}
