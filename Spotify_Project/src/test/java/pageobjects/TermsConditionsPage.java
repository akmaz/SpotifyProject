package pageobjects;

import org.openqa.selenium.WebDriver;

public class TermsConditionsPage extends HeaderPage{
	
	private String url = "https://www.spotify.com/uk/legal/intro-offer-terms-and-conditions/";
	private String title = "Introductory Trial Offer Terms and Conditions";

	public TermsConditionsPage(WebDriver driver) {
		super(driver);
	}
	
	public TermsConditionsPage assertUrl() {
		assertTrue(getUrl().contains(url));
		
		return this;
	}
	
	public TermsConditionsPage assertTitle() {
		assertCorrectTitle(title);
		
		return this;
	}
	
}
