package pageobjects;

import org.openqa.selenium.WebDriver;

public class SignUpPage extends BasePage{
	
	private String url = "https://www.spotify.com/uk/signup/";
	private String title = "Sign up - Spotify";
	
	public SignUpPage(WebDriver driver) {
		super(driver);
	}
	
	public SignUpPage assertUrl() {
		assertCorrectUrl(url);
		
		return this;
	}
	
	public SignUpPage assertTitle() {
		assertCorrectTitle(title);
		
		return this;
	}

}
