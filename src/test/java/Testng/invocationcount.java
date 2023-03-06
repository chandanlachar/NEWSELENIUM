package Testng;

import org.testng.annotations.Test;

public class invocationcount {
  @Test(invocationCount=9)
  public void f() {
	  System.out.println("chandan");
	  }
}
