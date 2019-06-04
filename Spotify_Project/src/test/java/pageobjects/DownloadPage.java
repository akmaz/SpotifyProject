package pageobjects;

import org.openqa.selenium.WebDriver;

public class DownloadPage extends HeaderPage {
	
	private String url = "https://www.spotify.com/uk/download/windows/";
	private String title = "Support - Spotify";

	public DownloadPage(WebDriver driver) {
		super(driver);
	}

	public DownloadPage assertUrl() {
		assertCorrectUrl(url);
		
		return this;
	}
	
	public DownloadPage assertTitle() {
		assertCorrectTitle(title);
		
		return this;
	}
	
}
