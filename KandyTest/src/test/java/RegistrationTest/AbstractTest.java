package RegistrationTest;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import ru.yandex.qatools.allure.annotations.Attachment;
import uitl.ParameterManager;
import Pages.RegistrationPage;

public class AbstractTest {
	
	protected WebDriver driver;
	protected RegistrationPage newPage;
	protected ParameterManager param;
	
	public WebDriver getDriver() {
		return driver;
	}
    	
	@BeforeClass(alwaysRun = true)
    public void setUpTest() throws MalformedURLException {
		param = new ParameterManager ();
		param.generateProp();
//		 initiate chrome driver to run locally
//		System.setProperty("webdriver.chrome.driver",
//				 "D:\\ProgrameForUse\\TestProject\\SeleniumTests\\chromedriver_win32\\chromedriver.exe");
//
		driver = new ChromeDriver();
//		driver = new FirefoxDriver();
		
		//initiate chrome driver to run remotely
//		DesiredCapabilities dc = DesiredCapabilities.firefox();
//		dc.setCapability();
//		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		
		newPage = new RegistrationPage(driver);
		newPage = newPage.goToRegistrationPage();
		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 
	}
	
	@AfterClass(alwaysRun = true)
	public void shutDown() {
		System.out.print("check close");
	  	driver.close();
	  	driver.quit();
	  
	}
	
//	@AfterMethod(alwaysRun = true)
//	public void tear(ITestResult testResult) {
//		takeScreenShotOnFailure(testResult);
//		
//	}
	
	


}
