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
	private static final String text1Container1 = "Music for everyone.";
	private static final String text2Container1 = "Millions of songs. No credit card needed.";
	private static final String text1Container2 = "Get 3 months of Premium for £0.99.";
	private static final String text2Container2 = "Only £9.99/month after. Cancel anytime.";
	private static final String text3Container2 = "Offer not available to users who already tried Premium. Offer ends 30 Jun 2019. Terms apply.";
	
	
	/*
	 * page elements
	 */
	
	@FindBy(xpath="//div[@id='js-message-bar-cookie-notice']")
	private WebElement cookiesField;
	
	@FindBy(xpath="//div[@id='js-message-bar-cookie-notice']//button[@class='close']")
	private WebElement cookiesCloseButton;
	
	@FindBy(css=".row.row-simplified")
	private WebElement textFieldAboveSpotifyButton;
	
	@FindBy(xpath="//header[@class='promotion-header']")
	private WebElement textFieldAbovePremiumButton;
	
	@FindBy(xpath="//a[@id='generic-btn-premium']")
	private WebElement getSpotifyFreeButton;
	
	@FindBy(xpath="//a[@href='/purchase/offer/3m-for-cheap']")
	private WebElement getPremiumButton;
	
	@FindBy(xpath="//p[@class='legal_disclaimer']")
	private WebElement textBelowPremiumButton;
	

	@FindBy(xpath="//p[@class='legal_disclaimer'/a]")
	private WebElement termsApplyLink;
	
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
	
	public SignUpPage clickOnGetSpotifyFreeButton() {
		click(getSpotifyFreeButton);
		
		return new SignUpPage(driver);
	}
	
	public MainPage assertTextContainer1() {
		assertTrue(textFieldAboveSpotifyButton.getText().contains(text1Container1));
		assertTrue(textFieldAboveSpotifyButton.getText().contains(text2Container1));
		
		return this;
	}
	
	public MainPage assertTextContainer2() {
		assertTrue(textFieldAbovePremiumButton.getText().contains(text1Container2));
		assertTrue(textFieldAbovePremiumButton.getText().contains(text2Container2));
		assertTrue(textBelowPremiumButton.getText().contains(text3Container2));
		
		return this;
	}
	
	public MainPage checkCookiesFieldRemoved() {
		assertTrue(driver.findElements(By.xpath("//div[@id='js-message-bar-cookie-notice']")).size()==0);
		
		return this;
	}
	
	public LogInPage clickOnGetPremiumButton() {
		click(getPremiumButton);
		
		return new LogInPage(driver);
	}
	
	public TermsConditionsPage clickOnTermsApplyLink() {
		click(termsApplyLink);
		
		return new TermsConditionsPage(driver);
	}
}
