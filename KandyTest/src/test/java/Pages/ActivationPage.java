package Pages;

import org.openqa.selenium.WebDriver;

public class ActivationPage extends AbstarctPage{
	protected WebDriver driver;
//	private WebDriverWait wait = new WebDriverWait(driver, 30000); 
	public ActivationPage(WebDriver driver){
		super(driver);
	}
//	private WebDriverWait wait = new WebDriverWait(driver, 30000);
	
	public void inputOTP() {
//		wait.until((ExpectedConditions.elementToBeClickable(OTPField)));
		waitUntilClickable(OTPField);
		System.out.print(OTPField);
		OTPField.sendKeys("1");
	}
}
