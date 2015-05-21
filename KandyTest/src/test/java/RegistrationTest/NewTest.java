package RegistrationTest;

import org.apache.bcel.verifier.exc.LinkingConstraintException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest extends AbstractTest{
	
	@Test(groups = "functest")
	//comment checking text above number field
		public void testUINote1() {
			System.out.println("Check text above number field");
			Assert.assertEquals(newPage.getTextAboveNumberField(), param.getValue(2), "Something wrong in text");

	  }
	
	@Test(groups = "functest")
	//comment checking link under Continue button
		public void testUILink1() {
			System.out.println("Check link under continue button");
			Assert.assertTrue(newPage.linkIsPresent(), "link is present");
	  }
	
//	@Test(groups = "functest")
////comment
//	public void NumberInput1() {
//		System.out.println("This should run");
//		newPage.inputNumber(param.getValue(0));
//		Assert.assertEquals(newPage.getInputNumber(), param.getValue(0), "Number +380661849890 is not present in field");
////		param.getOTP();
//  }
//	
//	@Test(groups = "checkintest")
//
//	public void NumberInput2() {
//		System.out.println("This should be skipped");
//		newPage.inputNumber(param.getValue(1));
//		Assert.assertEquals(newPage.getInputNumber(), param.getValue(1), "Number +380661849895 is not present in field");
//	  }
//	
//	@Test(groups = "functest")
//
//	public void toActivationScreen() {
//		newPage.inputNumber(param.getValue(0));
//		newPage.goToActivationPage().inputOTP();
//		
//
//	}
}
	
