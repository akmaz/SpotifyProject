package pageobjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LogInPage extends BasePage{
	
	private String url = "https://accounts.spotify.com/pl/login/?continue=https:%2F%2Fwww.spotify.com%2Fuk%2Faccount%2Foverview%2F&_locale=en-GB";
	private String title = "Logowanie - Spotify";

	public LogInPage(WebDriver driver) {
		super(driver);
	}
	
	public LogInPage assertUrl() {
		Assert.assertTrue(driver.getCurrentUrl().contains("https://accounts.spotify.com/"));
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
		
		return this;
	}

}
