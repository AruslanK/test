package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends AbstarctPage {
	
//	private WebDriverWait wait = new WebDriverWait(driver, 30000); //moved to Abstaract Page
	
	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
				
	public ActivationPage clickContiunueButton() {
		return new ActivationPage(driver);
	}
	// input number to number field
	public RegistrationPage inputNumber(String number) {

//		WebElement inputField = wait.until(ExpectedConditions
//                .elementToBeClickable(
//                		By.xpath("//input[contains(@placeholder,'Your mobile number')]"))); //moved to Elements class
//		wait.until(ExpectedConditions.elementToBeClickable(inputField));
		
		waitUntilClickable(inputField); //use short func from AbstracPage class to wait
		inputField.clear();
		inputField.sendKeys(number);
				
		return PageFactory.initElements(driver, RegistrationPage.class); //No need, method return void
//				new RegistrationPage(driver);
	}
	
	public String getInputNumber() {

//		WebElement inputField = wait.until(ExpectedConditions
//                .elementToBeClickable(
//                		By.xpath("//input[contains(@placeholder,'Your mobile number')]"))); //moved to Elements class
//		wait.until(ExpectedConditions.elementToBeClickable(inputField));
		
		waitUntilClickable(inputField);
		System.out.println(inputField.getAttribute("value"));
		return inputField.getAttribute("value");
	}
	public ActivationPage goToActivationPage(){
		continueButton.click();
		return PageFactory.initElements(driver, ActivationPage.class);

		//		new ActivationPage(driver);
	}
}
