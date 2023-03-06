package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Beforeandaftertest {
	
	@BeforeMethod
	public void Login(){
		
		System.out.println("Login");
		
	}
	@Test(priority=1)
	public void Search() {
		System.out.println("search");
		
	}
	@Test(priority=2)
	public void AdvancedSearch() {
		System.out.println("Adsearch");
	}
	@AfterMethod
	public void Logout() {
		System.out.println("Logout");
		
	}
	
	
  
}
