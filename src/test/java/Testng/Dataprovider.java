package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider {
	 WebDriver driver;
	 @BeforeClass
  public void setup(){
	  WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   
		  
  }
	 @Test(dataProvider="dp")
  public void testlog(String email, String pwd) {
		 driver.get("https://demo.nopcommerce.com/login");
	  driver.findElement(By.className("email")).sendKeys(email);
	  driver.findElement(By.className("password")).sendKeys(pwd);
	 driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	 driver.findElement(By.className("email")).clear();
	 driver.findElement(By.className("password")).clear();
	 
	 
	  String a="nopCommerce demo store";
	  String b=driver.getTitle();
	  Assert.assertEquals(a, b);
  }
	 @AfterClass
  public void logout() {
		 driver.quit();
	  
  }
	 @DataProvider(name="dp")
	 public String[][] LoginData(){
			String data[][]= {  
					{ "abc@gmail.com", "test123" }, 
					{ "pavanol@gmail.com", "test@123" },
					{ "pavanoltraining@gmail.com", "test3" },
					{ "chandanlachar97@gmail.com", "achar1" },
					{ "pavanoltraining@gmail.com", "test@123" } 
				};

return data;
		 
	 }
	 
	 
  }
	 