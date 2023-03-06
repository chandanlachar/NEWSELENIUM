package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertion {
  @Test
  public void test() {
	  
	  
		String c="abc";
		String v="1abc";
		// Assert.assertEquals(c, v , "Not equal");
		 
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(c, v);
		System.out.println("executed");
		
		System.out.println("executed");
		sa.assertAll();
		
	  
	  
  }
}
