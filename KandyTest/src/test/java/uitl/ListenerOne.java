package uitl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

import RegistrationTest.AbstractTest;

public class ListenerOne extends TestListenerAdapter {
	
	protected ByteArrayOutputStream ous = null;
    protected InputStream ios = null;
    
	 @Step("Hi, I'm step in your testng listener")
	    @Override
	    public void onTestFailure(ITestResult testResult) {
		 
		         takeScreenShotOnFailure(testResult);
	    }

	
	@Attachment(value = "Page screenshot", type = "image/png")
	public byte [] takeScreenShotOnFailure(ITestResult testResult) {
		Object currentClass = testResult.getInstance();
        WebDriver driver = ((AbstractTest)currentClass).getDriver();
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);		

//        if (driver != null)
//        {
//
//        	if (testResult.getStatus() == ITestResult.FAILURE) {
//    			System.out.println("щас скриншотну"+testResult.getStatus());
//    			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//    			try {
//    		        byte[] buffer = new byte[4096];
//    		        ous = new ByteArrayOutputStream();
//    		        try {
//    					ios = new FileInputStream(scrFile);
//    				} catch (FileNotFoundException e) {
//    					// TODO Auto-generated catch block
//    					e.printStackTrace();
//    				}
//    		        int read = 0;
//    		        try {
//    					while ( (read = ios.read(buffer)) != -1 ) {
//    					    ous.write(buffer, 0, read);
//    					}
//    				} catch (IOException e) {
//    					// TODO Auto-generated catch block
//    					e.printStackTrace();
//    				}
//    		    } finally { 
//    		        try {
//    		             if ( ous != null ) 
//    		                 ous.close();
//    		        } catch ( IOException e) {
//    		        }
//
//    		        try {
//    		             if ( ios != null ) 
//    		                  ios.close();
//    		        } catch ( IOException e) {
//    		        }
//    		    }
//    		    
//    			try {
//    				FileUtils.copyFile(scrFile, new File("D:\\testScreenShot.jpg"));
//    			} catch (IOException e) {
//    				// TODO Auto-generated catch block
//    				e.printStackTrace();
//    			}
//    			
//    		}
//
//           //etc.
//        }
//		
//		return ous.toByteArray();
		
	} 
	
}
