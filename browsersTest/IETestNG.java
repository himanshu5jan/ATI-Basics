package browsersTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class IETestNG {

	@Test
	public  void ieBrowserTest() {
		WebDriver driver;
        
		System.setProperty("webdriver.ie.driver", "c:\\BDrivers\\IEDriverServer.exe"); 
    	driver=new InternetExplorerDriver();
    	
    	driver.get("http://www.seleniumhq.org/download/");
    	
    	
    	driver.quit();

	}

}
