package Teknasyon.Teknasyon;

import org.testng.annotations.Test;

import BasePack.BaseTest;

public class ValidateImageCountTest extends BaseTest {

	
	//Ana ekranda görüntülenen resimlerin sayılarını kontrol eder
	
	@Test
	public void validateImageCount() {
		new skipAds(driver).skipAds();
		
		new ValidateImagesElementsPage(driver).validateImageSize();
	}
	

}
