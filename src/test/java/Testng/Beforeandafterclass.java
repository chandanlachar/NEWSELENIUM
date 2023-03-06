package Testng;

import org.testng.annotations.*;

public class Beforeandafterclass {
	@AfterClass
	public void Logout() {
		System.out.println("Logout");
	}
	@Test(priority=2)
	public void Advancedsearch() {
		System.out.println("Advnsearch");
	}
	@BeforeClass
	public void Login() {
		System.out.println("Login");
	}
	@Test(priority=1)
	public void Search() {
		System.out.println("Search");
	}
  

}
