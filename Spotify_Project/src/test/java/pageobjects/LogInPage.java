package pageobjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LogInPage extends BasePage{
	
	private String url = "https://accounts.spotify.com/";
	private String title = "Logowanie - Spotify";

	public LogInPage(WebDriver driver) {
		super(driver);
	}
	
	public LogInPage assertUrl() {
		Assert.assertTrue(driver.getCurrentUrl().contains(url));
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
		
		return this;
	}

}
