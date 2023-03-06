package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencymethods {
    @Test(priority=1)
  public void Login() {
	  Assert.assertTrue(true);
  
  }
    @Test(priority=2,dependsOnMethods= {"Login"})
  public void Search() {
	  Assert.assertTrue(false);
  
  }
    @Test(priority=2,dependsOnMethods= {"Search"})
  public void Adsearch() {
	  Assert.assertTrue(true);
  
  }
    @Test(priority=3,dependsOnMethods= {"Adsearch"})
  public void Logout() {
	  Assert.assertTrue(true);
  
  }
  
  
}
