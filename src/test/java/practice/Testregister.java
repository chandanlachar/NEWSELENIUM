package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Testregister {
	public WebDriver driver;
	public Register rr;
 //setup
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	}
	@Test(priority=1)
	public void testregister() {
		rr =new Register(driver);
		 rr.setfirstname("chandanl");
		rr.setlastname("2939ub");
		rr.setemail("cha123@.com");
		rr.setpassword("cfncn");
		rr.setconfirmpassword("cfncn");
		rr.clicksubmit();
		Assert.assertNotEquals(driver.getTitle(), "nopCommerce demo store. Register");
	}
	@AfterClass
	public void close() {
		driver.close();
	}
	
	
	
	
	
}
