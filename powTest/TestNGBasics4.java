package powTest;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
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
		Assert.assertTrue(failedcase());
	}
	
	@Test(priority=2)
	public void test2() {
		System.out.println("Test2");
		Assert.assertTrue(passedcase());
	}
	
	@Test(priority=3)
	public void Zest3() {
		System.out.println("Test3");
		Assert.assertTrue(failedcase());
	}
	
	@Test(priority=4)
	public void test4() {
		System.out.println("Test4");
		Assert.assertTrue(passedcase());
	}
	@Test(priority=5)
	public void AdminTest() {
		System.out.println("Test5");
		Assert.assertTrue(passedcase());
	}
	
	
}
