package browsersTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ChromeTestNG {

	@Test
	public  void chromeBrowserTest() {
		WebDriver driver;
        
		System.setProperty("webdriver.chrome.driver", "c:\\BDrivers\\ChromeDriver.exe"); 
    	driver=new ChromeDriver();
    	
    	driver.get("http://www.seleniumhq.org/download/");
    	
    	
    	driver.close();

	}

}
