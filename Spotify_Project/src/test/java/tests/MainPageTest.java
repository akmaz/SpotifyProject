package tests;

import org.testng.annotations.Test;

import pageobjects.MainPage;


public class MainPageTest extends BaseTest{
	
	/*
	 * TS001	Verify if the main page loads correctly
	 */
	
	@Test
	public void mainPageLoading() {
		
		MainPage mainPage = new MainPage(driver);
		
		mainPage.goToMainPage()
				.assertUrl();
	}
	
	/*
	 * TS002	Verify if the cookie policy field appears
	 */
	
	@Test
	public void cookies() {
		MainPage mainPage = new MainPage(driver);
		
		mainPage.goToMainPage()
				.clickOnTheCloseCookiesButton()
				.checkCookiesFieldRemoved();
	}
	
	
	/*
	 * TS003	Verify if the links in the header work correctly and bring user to the correct page
	 */
	
	@Test
	public void headerLinks() {
		
		MainPage mainPage = new MainPage(driver);
		
		/*
		 * verifying the SPotify icon
		 */
		mainPage.goToMainPage()
				.clickOnSpotifyIcon()
				.assertUrl()
				.assertTitle();
		
		/*
		 * verifying the Premium link
		 */
		mainPage.goToMainPage()
				.clickOnPremiumLink()
				.assertUrl()
				.assertTitle();
		
		/*
		 * verifying the Help link
		 */
		mainPage.goToMainPage()
				.clickOnHelpLink()
				.assertUrl()
				.assertTitle();
		
		/*
		 * verifying the Sign Up link
		 */
		mainPage.goToMainPage()
				.clickOnSignUpLink()
				.assertUrl()
				.assertTitle();
		
		/*
		 * verifying the Log In link
		 */
		mainPage.goToMainPage()
				.clickOnLogInLink()
				.assertUrl();
		
	}
	
	
	
}
