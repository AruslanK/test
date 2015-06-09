package uitl;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import RegistrationTest.AbstractTest;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;


public class ListenerOne extends TestListenerAdapter {
		
	    @Step("Hi, I'm step in your testng listener")
	    @Override
	    public void onTestFailure(ITestResult tr) {
	    	Object currentClass = tr.getInstance();
	        WebDriver driver = ((AbstractTest) currentClass).getDriver();
	        createAttachment(driver);
	    }

	    @Attachment("Somthing wrong on this screen shot")
	    public byte[]  createAttachment(WebDriver driver) {
		    return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);			    
		}
	}
