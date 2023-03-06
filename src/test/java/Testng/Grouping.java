package Testng;

import org.testng.annotations.Test;

public class Grouping {
	
	/*
	loginByEmail  - sanity & regression
	loginByfacebook - sanity
	loginBytwitter  - sanity

	signupbyemail - sanity & regression
	signupbyfacebook  - regression
	signupbytwitter  - regression

	paymentinrupees - sanity & regression
	paymentindollar - sanity  
	paymentReturnbyBank  - regression
	*/
    @Test(priority=1,groups= {"sanity","regression"})
	public void loginbyemail() {
	    System.out.println("login by email");
	}
    @Test(priority=2,groups= {"sanity"})
	public void loginbyfacebook() {
    	System.out.println("login by facebook");
		
	}
    @Test(priority=3,groups= {"sanity"})
	public void loginbytwitter() {
    	System.out.println("login by twitter");
		
	}
    @Test(priority=4,groups= {"sanity","regression"})
	public void signupbyemail() {
    	System.out.println("signup email");
		
	}
    @Test(priority=5,groups= {"regression"})
	public void signupbytfacebook() {
    	System.out.println("signup by email");
		
	}
    @Test(priority=6,groups= {"regression"})
	public void signupbytwitter() {
    	System.out.println("signup by email");
		
	}
    @Test(priority=7,groups= {"sanity","regression"})
	public void paymentinrupees() {
    	System.out.println("payment in rupees");
		
	}
    @Test(priority=8,groups= {"sanity"})
	public void paymentindollar() {
    	System.out.println("payment in dollar");
		
	}
    @Test(priority=9,groups= {"regression"})
	public void paymentreturnbybank() {
    	System.out.println("payment return by bank");
		
	}
	}

