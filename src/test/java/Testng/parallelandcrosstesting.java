package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallelandcrosstesting {
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	public void setup(String br) {
		if(br.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		else if (br.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
	}
	@Test(priority=1)
	public void testlogo() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		try {
	boolean b=	driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(true, b);
		}
		catch(Exception e) {
			Assert.fail();
		}
		
	}
	@Test(priority=2)
	public void homepagetitle() {
		Assert.assertEquals(driver.getTitle(),"OrangeHRM","Titles are matched");
		 
		}
	@AfterClass
	public void exit() {
		driver.close();
	}
	

}
