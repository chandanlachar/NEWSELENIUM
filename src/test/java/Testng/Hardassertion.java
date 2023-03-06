package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassertion {
  @Test
  public void test() {
	  
	  
	String c="abc";
	String v="1abc";
	 Assert.assertEquals(c, v , "Not equal");
	 
	System.out.print("passed");   //not executed in hardassertion
  }
}
