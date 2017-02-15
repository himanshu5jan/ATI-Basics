package browsersTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class AllBrowsersTest {

	@Test
	public  void chromeBrowserTest() {
		WebDriver driver;
        
		System.setProperty("webdriver.chrome.driver", "c:\\BDrivers\\ChromeDriver.exe"); 
    	driver=new ChromeDriver();
    	
    	driver.get("http://www.seleniumhq.org/download/");
    	
    	
    	driver.close();

	}
	
	@Test
	public  void edgeBrowserTest() {
		WebDriver driver;
        
		System.setProperty("webdriver.edge.driver", "c:\\BDrivers\\MicrosoftWebDriver.exe"); 
    	driver=new EdgeDriver();
    	
    	driver.get("http://www.seleniumhq.org/download/");
    	
    	
    	driver.close();

	}
	
	
	@Test
	public  void firefoxBrowserTest() {
		WebDriver driver;
        
		System.setProperty("webdriver.gecko.driver", "c:\\BDrivers\\geckodriver.exe"); 
    	driver=new FirefoxDriver();
    	
    	driver.get("https://www.facebook.com");
    	
    	driver.quit();
	}
	

	@Test
	public  void ieBrowserTest() {
		WebDriver driver;
        
		System.setProperty("webdriver.ie.driver", "c:\\BDrivers\\IEDriverServer.exe"); 
    	driver=new InternetExplorerDriver();
    	
    	driver.get("http://www.seleniumhq.org/download/");
    	
    	
    	driver.quit();

	}
	
}
