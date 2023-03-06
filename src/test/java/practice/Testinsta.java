package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testinsta {
	public WebDriver driver;
	public Instalogin in;
	
 //setup
	@Parameters({"browser"})
	@BeforeClass
	public void setup(String br) {
		if(br.equals("chrome")) {
			
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.instagram.com/");	
		}
		 else if(br.equals("edge")) {
			
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.instagram.com/");
		}
		 else {
			 WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://www.instagram.com/");
		 }
	}
	@Test(priority=1)
	public void login() {
	in=new Instalogin(driver);
	in.setusername("hvv");
	in.setpassword("vgcgc");
 
}
	@AfterClass
	public void close() {
		driver.close();
	}
}