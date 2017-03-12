package powTest;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestNGBasics7 {
	//Explain how to use AfterMethod to take some decisions when TestCases have failed
	//or passed
	public boolean failedcase() {
		return false;
	}

	public boolean passedcase() {
		return true;
	}
	
	//this method gets executed once before any other test case is executed
	@BeforeClass
	public void setup() {
		System.out.println("******SETUP THE DRIVERS*******");

	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("******Close the driver*******");
	}
	
	@BeforeMethod
	public void beforeEachTest() {
		System.out.println("------Before Test------");
	}
	
	/*
	 * ITestResult interface/class
	 */
	
	@AfterMethod
	public void afterEachTest(ITestResult result) {
		System.out.println("------After Test------");
		
		boolean testResult=result.isSuccess();
		String testname=result.getName();
		
		//emre.isSuccess()
		if (testResult) {
			System.out.println("Successfully executed : "+testname);
		} else {
			System.out.println("Execution failed : "+testname);
//			System.out.println("PUT something in log file");
//			System.out.println("Print the ERR");
//			System.out.println("Take the screenshot");
		}
	}
	//pageLoadTest  must pass to execute anything else
	
	
	@Test(priority=1)
	public void pageLoadTest() {
		System.out.println("Test1");
		AssertJUnit.assertTrue(failedcase());
	}
	
	@Test(priority=2,dependsOnMethods= {"pageLoadTest"})
	public void loginTest() {
		System.out.println("Test2");
		AssertJUnit.assertTrue(passedcase());
	}
	
	@Test(priority=3)
	public void adminLinkTest() {
		System.out.println("Test3");
		AssertJUnit.assertTrue(failedcase());
	}
	
	@Test(priority=4)
	public void shopUserLinksTest() {
		System.out.println("Test4");
		AssertJUnit.assertTrue(passedcase());
	}
	@Test(priority=5)
	public void adminPORTest() {
		System.out.println("Test5");
		AssertJUnit.assertTrue(passedcase());
	}
	
	
}
