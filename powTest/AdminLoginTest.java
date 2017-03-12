package powTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdminLoginTest {

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
    	boolean result=title.contentEquals("POW Admin | Log in");
    	
    	if(result) {
    		System.out.println("Verification Pass");
    	} else {
    		System.out.println("Page load Failed");
    	}
    	
    	
    	String pageSrc=driver.getPageSource();
    	
    	//To do a partial match use method : contains()
    	boolean result2=pageSrc.contains("Admin - Sign In");
    	
    	if(result) {
    		System.out.println("Verification Pass 2");
    	} else {
    		System.out.println("Page load Failed 2");
    	}

	}

	
}
