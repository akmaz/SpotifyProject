package pageobjects;

import org.openqa.selenium.WebDriver;

public class PremiumFamilyPage extends HeaderPage{
	
	private String url = "https://www.spotify.com/uk/family/";
	private String title = "Spotify";

	public PremiumFamilyPage(WebDriver driver) {
		super(driver);
	}
	
	public PremiumFamilyPage assertUrl() {
		assertTrue(getUrl().contains(url));
		
		return this;
	}
	
	public PremiumFamilyPage assertTitle() {
		assertCorrectTitle(title);
		
		return this;
	}

}
