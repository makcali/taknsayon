package Teknasyon.Teknasyon;

import org.testng.annotations.Test;

import BasePack.BasePageUtil;
import BasePack.BaseTest;
import canstants.constants;

public class SelectLanguageTest extends BaseTest implements constants{
	
	//Ayarlardan dillere gidip dil seçer
	
	@Test
	
	public void selectLanguage() throws InterruptedException {
		
		new skipAds(driver).skipAds();
		
		new BasePageUtil(driver).clickSettings();
		
		new SelectLanguagePage(driver).goToLanguages().scrollIntoView(Language);
		
		Thread.sleep(5000);
		
	}

}
