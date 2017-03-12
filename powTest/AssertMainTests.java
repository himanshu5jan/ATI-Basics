package powTest;

import org.testng.Assert;

public class AssertMainTests {
	
	/*
	 * This method takes 2 arguments (both strings)
	 * This method returns boolean
	 */
	public static boolean verifyTitle(String actual, String expected) {
		//boolean variable declared and initialised
		boolean returnVal=false;
		
		//exact comparison of string
		if (actual.contentEquals(expected)) {
			System.out.println("match successful");
			returnVal=true;
		} else {
			
			System.out.println("match not successful");
		}
		
		return returnVal;
	}
	
	
	public static boolean verifySrc(String actual, String expected) {
		boolean returnVal=false;
	//	"test string" "test"
		
		if (actual.contains(expected)) {
			System.out.println("SRC match successful");
			returnVal=true;
		} else {
			System.out.println("SRC match not successful");
		}
		
		return returnVal;
		
	}
	

	public static void main(String[] args) {
		
		//Assert Class to validate
		//assertTrue expects True
		//assertFalse expects False
		/*
		Assert.assertTrue(true);   //PASS    
		Assert.assertTrue(false);  //FAIL
		Assert.assertFalse(false);  //PASS  
		Assert.assertFalse(true);  //FAIL
		&& -> AND
		|| -> OR
		!  -> NOT
		=  -> assignment
		== -> equality
		*/
		System.out.println("TEST 1");
		Assert.assertTrue(verifyTitle("test","test"));
		System.out.println("TEST 2");
		Assert.assertTrue(verifySrc("test string","test"));
		System.out.println("TEST 3");
		Assert.assertTrue(verifyTitle("test","test") && verifySrc("test string","test"));
		System.out.println("TEST 4");
		Assert.assertTrue(verifyTitle("test","test1") && verifySrc("test string","test"));
		
		
	}

}
