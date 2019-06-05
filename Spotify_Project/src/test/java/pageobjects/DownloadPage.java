package pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

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
	
	public DownloadPage handleDownloadPopUp() {
		Robot robot;
		try {
			robot = new Robot();
			
			robot.delay(1500);
			
			// we tab across to get to the Cancel button
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB);
			
			// we click enter to close the download popup window
			robot.keyPress(KeyEvent.VK_ENTER);
			
		} catch (AWTException e) {
		}
		return this;
	}
	
}
