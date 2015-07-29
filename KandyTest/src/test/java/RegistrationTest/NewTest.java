package RegistrationTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Stories;



@Features("Registration issues")
public class NewTest extends AbstractTest{
	
	@Stories("Check text above number field")
	@Test(groups = "functest")
	//comment checking text above number field
	public void testUINote1() {
//		System.out.println("Check text above number field");
		Assert.assertEquals(newPage.getTextAboveNumberField(), param.getValue(2), "\n Something wrong in text");
	}
//		
	@Stories("Check link under continue button")
	@Test(groups = "functest")
	//comment checking link under Continue button
	public void testUILink1() {
//		System.out.println("Check link under continue button");
		Assert.assertTrue(newPage.linkIsPresent(), "link is not present");
	}
	@Stories("Input number to number field and verify text displaying")
	@Test(groups = "functest")
	public void NumberInput1() {
//		System.out.println("This should run");
		newPage.inputNumber(param.getValue(0));
		Assert.assertEquals(newPage.getInputNumber(), param.getValue(0), "Number +380661849890 is not present in field");
//		param.getOTP();
    }
	
//	@Stories("Flag detection")
//	@Test(groups = "functest")
//	public void flagDetection(){
//		Assert.assertEquals(newPage.detectFlagIcon(), param.getValue(3),"Flag incorrectly detected for UA");
//	}
//	
//	@Stories("Country code detection")
//	@Test(groups = "functest")
//	public void codeDetection() {
//		Assert.assertEquals(newPage.detectCountryCode(), param.getValue(4),"Code incorrectly detected for UA");
//	}
//	@Test(groups = "checkintest")
//
//	public void NumberInput2() {
//		System.out.println("This should be skipped");
//		newPage.inputNumber(param.getValue(1));
//		Assert.assertEquals(newPage.getInputNumber(), param.getValue(1), "Number +380661849895 is not present in field");
//	  }
//	@Features("Activation issues")
//	@Test(groups = "functest")
//
//	public void toActivationScreen() {
//		newPage.inputNumber(param.getValue(0));
//		newPage.goToActivationPage().inputOTP();
//		
//
//	}
}
	
