package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Class contains variabes and functionalisties of the Main Spotify Page, UK version
 * Address URL: https://www.spotify.com/uk/
 * 
 * @author aleks
 *
 */

public class MainPage extends HeaderPage {
	
	/*
	 * page variables
	 */
	
	private static final String path = "https://www.spotify.com/uk/";
	private static final String title = "Music for everyone - Spotify";
	
	/*
	 * page elements
	 */
	
	@FindBy(xpath="//div[@id='js-message-bar-cookie-notice']")
	private WebElement cookiesField;
	
	@FindBy(xpath="//div[@id='js-message-bar-cookie-notice']//button[@class='close']")
	private WebElement cookiesCloseButton;

	
	//constructor

	public MainPage(WebDriver driver){
		super(driver);
	}
	
	// methods

	public MainPage assertUrl() {
		assertCorrectUrl(path);
		
		return this;
	}
	
	public MainPage goToMainPage() {
		driver.get(path);
		return this;
	}
	
	public MainPage clickOnTheCloseCookiesButton() {
		click(cookiesCloseButton);
		
		return this;
	}

	
	public MainPage checkCookiesFieldRemoved() {
		assertTrue(driver.findElements(By.xpath("//div[@id='js-message-bar-cookie-notice']")).size()==0);
		
		return this;
	}
	
	public MainPage assertTitle() {
		assertCorrectTitle(title);
		
		return this;
	}
	
}
