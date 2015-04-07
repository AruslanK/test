package RegistrationTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest extends AbstractTest{
	
	@Test(groups = "functest")

	public void NumberInput1() {
		System.out.println("This should run");
		newPage.inputNumber(param.getNumber()[0]);
		Assert.assertEquals(newPage.getInputNumber(), param.getNumber()[0], "...");
//		param.getOTP();
  }
	@Test(groups = "checkintest")

	public void NumberInput2() {
		System.out.println("This should be skipped");
		newPage.inputNumber(param.getNumber()[1]);
		Assert.assertEquals(newPage.getInputNumber(), param.getNumber()[1]);
	  }
	@Test(groups = "functest")

	public void NumberInput3() {
		newPage.inputNumber(param.getNumber()[0]);
		newPage.goToActivationPage().inputOTP();

	}
}
	
