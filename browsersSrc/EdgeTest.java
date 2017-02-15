package browsersSrc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class EdgeTest {

	public static void main(String[] args) {
		WebDriver driver;
        
		System.setProperty("webdriver.edge.driver", "c:\\BDrivers\\MicrosoftWebDriver.exe"); 
    	driver=new EdgeDriver();
    	
    	driver.get("http://www.seleniumhq.org/download/");
    	
    	
    	driver.close();

	}

}
