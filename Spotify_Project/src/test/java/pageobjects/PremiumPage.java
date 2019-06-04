package pageobjects;

import org.openqa.selenium.WebDriver;

public class PremiumPage extends HeaderPage{
	
	private String url = "https://www.spotify.com/uk/premium/";
	private String title = "Spotify Premium, 3 months for £0.99.";

	public PremiumPage(WebDriver driver) {
		super(driver);
	}
	
	public PremiumPage assertUrl() {
		assertTrue(getUrl().contains(url));
		
		return this;
	}
	
	public PremiumPage assertTitle() {
		assertCorrectTitle(title);
		
		return this;
	}

}
