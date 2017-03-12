package powTest;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class TestNGBasics4 {
	
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
	
	@Test(priority=1)
	public void ZTest() {
		System.out.println("Test1");
		AssertJUnit.assertTrue(failedcase());
	}
	
	@Test(priority=2)
	public void test2() {
		System.out.println("Test2");
		AssertJUnit.assertTrue(passedcase());
	}
	
	@Test(priority=3)
	public void Zest3() {
		System.out.println("Test3");
		AssertJUnit.assertTrue(failedcase());
	}
	
	@Test(priority=4)
	public void test4() {
		System.out.println("Test4");
		AssertJUnit.assertTrue(passedcase());
	}
	@Test(priority=5)
	public void AdminTest() {
		System.out.println("Test5");
		AssertJUnit.assertTrue(passedcase());
	}
	
	
}
