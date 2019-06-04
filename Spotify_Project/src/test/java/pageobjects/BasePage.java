package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Class contains common methods for all page classes, such as:
 * write(), read(), click(), assertEquals()
 * 
 * @author aleks
 *
 */

public class BasePage {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 15);
	}
	
	public void waitVisibility(WebElement element) {
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	
	public void waitPageLoad() {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//body")));
	}
	
	public void click(WebElement element) {
		waitVisibility(element);
		
		element.click();
	}
	
	public void write(WebElement element, String text) {
		waitVisibility(element);
		
		element.sendKeys(text);
	}
	
	public String read(WebElement element) {
		waitVisibility(element);
		
		return element.getText();
	}
	
	public void assertEquals(String text, WebElement element) {
		waitVisibility(element);
		
		Assert.assertEquals(read(element), text);
		
	}
	
	public void assertEquals(boolean text, boolean text2) {
		Assert.assertEquals(text, text2);
		
	}
	
	public void assertCorrectUrl(String url) {
		waitPageLoad();
		
		Assert.assertEquals(driver.getCurrentUrl(), url);
	}
	
	public void assertUrlContains(String text) {
		waitPageLoad();
		
		Assert.assertTrue(driver.getCurrentUrl().contains(text));
	}
	
	public void assertCorrectTitle(String title) {
		waitPageLoad();
		
		Assert.assertEquals(driver.getTitle(), title);
	}
	
	public void assertTrue(boolean condition) {
		Assert.assertTrue(condition);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getUrl() {
		return driver.getCurrentUrl();
	}
	
}
