package browsersSrc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxTest {

	public static void main(String[] args) {
		WebDriver driver;
        
		System.setProperty("webdriver.gecko.driver", "c:\\BDrivers\\geckodriver.exe"); 
    	driver=new FirefoxDriver();
    	
    	driver.get("http://www.seleniumhq.org/download/");
    	
    	
    	driver.close();

	}

}
