/* setup
 * drop down 
   search
   exit */

package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
 public void setup(String br) {
		if(br.equals("chrome")) {
	 WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
		}
		else if(br.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
	 
 }
 @Test(priority=1)
 public void dropdown() {
	 driver.get("https://www.amazon.in/");
	 driver.manage().window().maximize();
	 WebElement e=driver.findElement(By.id("searchDropdownBox"));
	 Select all=new Select(e);
	  all.selectByVisibleText("Appliances");
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("charger");
	 
	 
 }
 @AfterClass
	public void exit() {
  driver.close();
}
}