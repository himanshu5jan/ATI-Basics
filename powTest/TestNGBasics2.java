package powTest;

import org.testng.annotations.Test;

public class TestNGBasics2 {
	
	@Test(priority=1)
	public void ZTest() {
		System.out.println("Test1");
	}
	
	@Test(priority=2)
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test(priority=3)
	public void Zest3() {
		System.out.println("Test3");
	}
	
	@Test(priority=4)
	public void test4() {
		System.out.println("Test4");
	}
	@Test(priority=5)
	public void AdminTest() {
		System.out.println("Test5");
	}
	
	
}
