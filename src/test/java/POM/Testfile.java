package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testfile {
	public WebDriver driver;
	 LoginPage lp;
	@BeforeClass
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		
		}
	@Test(priority=1)
	void testLogo()
	{
		lp=new LoginPage(driver);
		
		Assert.assertEquals(lp.CheckLogo()   , true);
	}

 @Test(priority=2)
	public void testlogin() {
	   
		lp.SetUserName("Admin");
		lp.SetPassword("admin123");
		lp.ClickSubmit();
		
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
 @AfterClass
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
}
