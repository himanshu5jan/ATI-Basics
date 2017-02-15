package browsersTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class EdgeTestNG {

	@Test
	public  void edgeBrowserTest() {
		WebDriver driver;
        
		System.setProperty("webdriver.edge.driver", "c:\\BDrivers\\MicrosoftWebDriver.exe"); 
    	driver=new EdgeDriver();
    	
    	driver.get("http://www.seleniumhq.org/download/");
    	
    	
    	driver.close();

	}

}
