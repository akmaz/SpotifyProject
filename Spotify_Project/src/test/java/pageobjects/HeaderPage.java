package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Class contains variables and methods for the top header of the page
 * For the links such as: Premium, Help, Download, Sign up, Log in
 * 
 * @author aleks
 *
 */

public class HeaderPage extends BasePage {
	
	// page elements

	@FindBy(xpath="//header[@id='js-navbar']//a[@href='/uk/account/overview/']")
	public WebElement spotifyIcon;
	
	@FindBy(xpath="//a[@id='nav-link-premium']")
	private WebElement premiumLink;
	
	@FindBy(xpath="//a[@id='nav-link-help']")
	private WebElement helpLink;

	@FindBy(xpath="//a[@id='nav-link-download']")
	private WebElement downloadLink;
	
	@FindBy(xpath="//a[@id='nav-link-sign-up']")
	private WebElement signUpLink;
	
	@FindBy(xpath="//a[@id='header-login-link']")
	private WebElement logInLink;
	
	// constructor
	
	public HeaderPage(WebDriver driver) {
		super(driver);
		
		PageFactory.initElements(driver, this);
	}
		
	// page methods
	
	public MainPage clickOnSpotifyIcon() {
		click(spotifyIcon);
		
		return (MainPage) this;
	}
	
	public PremiumPage clickOnPremiumLink() {
		click(premiumLink);
		
		return new PremiumPage(driver);
	}
	
	public HelpPage clickOnHelpLink() {
		click(helpLink);
		
		return new HelpPage(driver);
	}
	
	public DownloadPage clickOnDownloadLink() {
		click(downloadLink);
		
		return new DownloadPage(driver);
	}
	
	public SignUpPage clickOnSignUpLink() {
		click(signUpLink);
		
		return new SignUpPage(driver);
	}
	
	public LogInPage clickOnLogInLink() {
		click(logInLink);
		
		return new LogInPage(driver);
	}
	
	
}
