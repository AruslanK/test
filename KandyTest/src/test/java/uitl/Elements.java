package uitl;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements {
	//number field
	@FindBy(xpath="//input[contains(@placeholder,'Your mobile number')]")
	protected WebElement inputField;
	
	//continue button
	@FindBy(xpath="//button[contains(@type,'submit')]")
	protected WebElement continueButton;
	
	// OTP field#1
	@FindBy(xpath="//*[@id='registrationView']/div/div/div[2]/form/div[1]/input[1]")
	protected WebElement OTPField;

}

