package browsersSrc;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IETest {

	public static void main(String[] args) {
		WebDriver driver;
        
		System.setProperty("webdriver.ie.driver", "c:\\BDrivers\\IEDriverServer.exe"); 
    	driver=new InternetExplorerDriver();
    	
    	driver.get("http://www.seleniumhq.org/download/");
    	
    	
    	driver.close();

	}

}
