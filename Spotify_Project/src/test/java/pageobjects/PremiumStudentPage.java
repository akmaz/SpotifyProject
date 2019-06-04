package pageobjects;

import org.openqa.selenium.WebDriver;

public class PremiumStudentPage extends HeaderPage{

	private String url = "https://www.spotify.com/uk/student/";
	private String title = "Spotify";

	public PremiumStudentPage(WebDriver driver) {
		super(driver);
	}
	
	public PremiumStudentPage assertUrl() {
		assertTrue(getUrl().contains(url));
		
		return this;
	}
	
	public PremiumStudentPage assertTitle() {
		assertCorrectTitle(title);
		
		return this;
	}

}
