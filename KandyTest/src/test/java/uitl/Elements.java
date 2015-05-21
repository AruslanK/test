package uitl;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements {
	//Registration Page
	//text above number field (NF)
	@FindBy(xpath="//*[@id=\"registrationView\"]/div/div/div[1]/p[2]")
	protected WebElement textAboveNF;
		
	//number field
	@FindBy(xpath="//input[contains(@placeholder,'Phone number')]")
	protected WebElement inputField;
	
	//continue button
	@FindBy(xpath="//button[contains(@type,'submit')]")
	protected WebElement continueButton;
	
	//link under Continue button
	@FindBy(xpath="//a[contains(@data-bind,'click: changeDomain')]")
	protected WebElement linkUnderContinue;
	
	//Activation Page
	
	// OTP field#1
	@FindBy(xpath="//*[@id='registrationView']/div/div/div[2]/form/div[1]/input[1]")
	protected WebElement OTPField;

}

