package powTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdminLoginTest2 {

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
    	
    	//fetch the title of the page
    	String title=driver.getTitle();
    	//To match the exact contents use contentEquals method
    	boolean result1=title.contentEquals("POW Admin | Log in");
    	
    	//To view the pagesource
    	String pageSrc=driver.getPageSource();
    	//To do a partial match use method : contains()
    	boolean result2=pageSrc.contains("Sign In");

    	//AND of result1 and result2 will be true only if both are true else it will be false
    	// || -> OR
    	// && -> AND
    	if(result1 && result2) {
    		System.out.println("Page Load Successful");
    	} else {
    		System.out.println("Page Load Failed");
    	}

	}

	
}
