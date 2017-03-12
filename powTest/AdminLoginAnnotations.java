package powTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class AdminLoginAnnotations {
	
	public boolean verifyTitle(String actual, String expected) {
		//boolean variable declared and initialised
		boolean returnVal=false;
		
		//exact comparison of string
		if (actual.contentEquals(expected)) {
			System.out.println("match successful");
			returnVal=true;
		} else {
			
			System.out.println("match not successful");
		}
		
		return returnVal;
	}
	
	
	public boolean verifySrc(String actual, String expected) {
		boolean returnVal=false;
	//	"test string" "test"
		
		if (actual.contains(expected)) {
			System.out.println("SRC match successful");
			returnVal=true;
		} else {
			System.out.println("SRC match not successful");
		}
		
		return returnVal;
		
	}
	

	@Test
	public  void chromeBrowserTest() {
		//Declaring the WebDriver object
		WebDriver driver;
		//Set up the property for chrome
        System.setProperty("webdriver.chrome.driver", "c:\\BDrivers\\ChromeDriver.exe");
        //Instantiate chrome driver
    	driver=new ChromeDriver();
    	//open the website
    	driver.get("http://104.238.103.200:8080/POWNew/startadmin.do");
    	
    	//AND of result1 and result2 will be true only if both are true else it will be false
    	// || -> OR
    	// && -> AND
    	
    	//verifyTitle(driver.getTitle(),"POW Admin | Log in");
    	
    	//driver.getPageSource().contains("Sign In")
    	//verifySrc(driver.getPageSource(),"Sign In")
    	
//    	
//    	if( verifyTitle(driver.getTitle(),"POW Admin | Log in") && verifySrc(driver.getPageSource(),"Sign In")) {
//    		System.out.println("Page Load Successful");
//    	} else {
//    		System.out.println("Page Load Failed");
//    	}

    	Assert.assertTrue(verifyTitle(driver.getTitle(),"POW Admin | Log in")
    			&& verifySrc(driver.getPageSource(),"Sign In"));
	}
	
	
	

	
}
