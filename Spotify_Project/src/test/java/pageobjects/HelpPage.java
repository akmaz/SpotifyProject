package pageobjects;

import org.openqa.selenium.WebDriver;

public class HelpPage extends HeaderPage{
	
	private String url = "https://support.spotify.com/uk/";
	private String title = "Support - Spotify";

	public HelpPage(WebDriver driver) {
		super(driver);
	}
	
	public HelpPage assertUrl() {
		assertUrlContains(url);
		
		return this;
	}
	
	public HelpPage assertTitle() {
		assertCorrectTitle(title);
		
		return this;
	}

}
