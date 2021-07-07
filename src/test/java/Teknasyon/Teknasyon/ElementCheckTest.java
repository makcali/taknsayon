package Teknasyon.Teknasyon;

import org.testng.annotations.Test;

import BasePack.BaseTest;

public class ElementCheckTest extends BaseTest {

	
	//Ana ekrandaki elementlerin kontrolü
	@Test
	public void checkElements() {
		new skipAds(driver).skipAds();

		new ElementCheckPage(driver).checkCategoriesButtonExists().checkHomeButtonExists().checkMyWorkButtonExists()
				.checkSliderExists().checkSliderIndicatorExists();
	}

}
