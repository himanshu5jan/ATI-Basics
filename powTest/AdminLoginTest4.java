package powTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdminLoginTest4 {

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
    	if(driver.getTitle().contentEquals("POW Admin | Log in") && driver.getPageSource().contains("Sign In")) {
    		System.out.println("Page Load Successful");
    	} else {
    		System.out.println("Page Load Failed");
    	}

	}

	
}
