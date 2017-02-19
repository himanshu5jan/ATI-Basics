package inClass1902;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	/*
	 * Step1a: Setup Chrome 
	 * Step1b: go to facebook.com
	 * Step2: enter 'wronguser' in Email or Phone textbox
	 * Step3: enter 'wrongpass' in password textbox
	 * Step4: Click on 'LogIn' button
	 */
	public static void main(String args[]) throws InterruptedException {
		//Step1:
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "c:\\BDrivers\\ChromeDriver.exe"); 
		driver=new ChromeDriver();
		
		//Step2:
		driver.get("https://web.facebook.com/?_rdr");
		Thread.sleep(2000);
		//Step3:
		//locating the textbox, by cssSelector= input#email
		
		//driver.findElement(By.cssSelector("input#email")).sendKeys("wronguser");
		
		//step3a: locate the element by specifying the locator
		By username=By.cssSelector("input#email");
		//step3b: find the element on the browser
		WebElement usernameWE=driver.findElement(username);
		//step3c: perform action on the element found on the browser
		usernameWE.sendKeys("hp5jan@gmail.com");
		
		Thread.sleep(2000);
		By password=By.cssSelector("input.inputtext[name='pass']");
		WebElement passwordWE=driver.findElement(password);
		passwordWE.sendKeys("wrongpass");
		Thread.sleep(2000);
		By loginButton=By.xpath("//input[@value='Log In']");
		WebElement loginButtonWE=driver.findElement(loginButton);
		loginButtonWE.click();
		Thread.sleep(2000);
		
			
	}
	
	
	
}
