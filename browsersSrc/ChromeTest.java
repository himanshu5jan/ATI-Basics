package browsersSrc;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeTest {

	public static void main(String[] args) {
		WebDriver driver;
        
		System.setProperty("webdriver.chrome.driver", "c:\\BDrivers\\ChromeDriver.exe"); 
    	driver=new ChromeDriver();
    	
    	driver.get("http://www.seleniumhq.org/download/");
    	
    	
    	driver.close();

	}

}
