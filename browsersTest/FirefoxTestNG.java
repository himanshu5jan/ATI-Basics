package browsersTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class FirefoxTestNG {

	@Test
	public  void firefoxBrowserTest() {
		WebDriver driver;
        
		System.setProperty("webdriver.gecko.driver", "c:\\BDrivers\\geckodriver.exe"); 
    	driver=new FirefoxDriver();
    	
    	driver.get("https://www.facebook.com");
    	
    	driver.quit();
	}

}
