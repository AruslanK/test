package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import uitl.Elements;

public class AbstarctPage extends Elements{
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public AbstarctPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 60);
	}
	
//	Elements elem = PageFactory.initElements(driver, Elements.class);
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public RegistrationPage goToRegistrationPage() {
		driver.navigate().to("https://fringkandy.pub.globallogic.com/popup.html");
		
		return PageFactory.initElements(driver, RegistrationPage.class);
//				RegistrationPage(driver);
	}
	
	public void waitUntilClickable(WebElement elm) {
		wait.until((ExpectedConditions.elementToBeClickable(elm)));
		
	}
	public void waitUntilVisible(WebElement elm) {
		wait.until((ExpectedConditions.visibilityOf(elm)));
	}
}
