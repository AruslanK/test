package uitl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.net.ssl.SSLSession;

public class ParameterManager {
	
	private String firstNumber;
	private String secondNumber;
	private String textAboveNumberField;
	
	private ArrayList <String> paramArray = new ArrayList <String>();;

	public void generateProp() {
		Properties prop = new Properties();
		InputStream input = null;
		
		try {
			input = new FileInputStream("src/parameters.properties");
			prop.load(input);
			
			textAboveNumberField = prop.get("textAboveNF").toString();
			firstNumber = prop.get("number1").toString();
			secondNumber = prop.get("number2").toString();
			paramArray.add(firstNumber);
			paramArray.add(secondNumber);
			paramArray.add(textAboveNumberField);
			paramArray.add(prop.get("flagIconClass").toString());
			paramArray.add(prop.getProperty("countryCode").toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public String getValue(int index) {
		return  paramArray.get(index);
	}
	
	//Get OTP from mail
//	public void getOTP() {
//		String otp = new String();
//		StringBuilder mailContent =  new StringBuilder();
//
//		String host = "imap.gmail.com";
//	    String username = "Shaman2804.RK";
//	    String password = "Nordius2804";
//
//		//create properties field
//		Properties prop = new Properties();
//		prop.setProperty("mail.store.protocol", "imaps");
//
//		Session session = Session.getInstance(prop);
//		//create the IMAP store object and connect with the pop server
//		Store store;
//		try {
//			store = session.getStore("imaps");
//			store.connect(host, username, password);
//
//			Folder emailFolder = store.getFolder("INBOX");
//			// Check store content
//			Folder[] folders = store.getDefaultFolder().list("*");
//			for (Folder folder : folders) {
//		        if ((folder.getType() & Folder.HOLDS_MESSAGES) != 0) {
//		            System.out.println(folder.getFullName() + ": " + folder.getMessageCount());
//		        }
//			}
//
//
//			emailFolder.open(Folder.READ_ONLY);
//
//			// retrieve the messages from the folder in an array and print it
//		    Message[] messages = emailFolder.getMessages();
//
////		    for (int i = 0, n = messages.length; i < n; i++) {
//		         Message message = messages[0];
//		         System.out.println("---------------------------------");
//		         System.out.println("Email Number " + 1);
//		         System.out.println("Subject: " + message.getSubject());
//		         System.out.println("From: " + message.getFrom()[0]);
//		         System.out.println("Text: " + message.getContent().toString());
//
////		      }
//
//		      //close the store and folder objects
//		      emailFolder.close(false);
//		      store.close();
//
//		} catch (NoSuchProviderException e) {
//			e.printStackTrace();
//		} catch (MessagingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
}
