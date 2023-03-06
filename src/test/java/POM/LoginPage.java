/* set user name
 * set password
 * click login
 * check logo
 */
package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver; 

	
	//constructor creation
	public  LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	//web elements
	@FindBy(xpath="//img[@alt='company-branding']")    WebElement img_logo;
	@FindBy(name="username") WebElement txt_username;
	@FindBy(name="password") WebElement txt_password;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement btn_submit;
	//@FindBy(xpath="//button[normalize-space()='Login']")
	//WebElement btn_submit;
	
	
	//Actioms methods
	public void SetUserName(String username) {
		txt_username.sendKeys(username);
	}
	public void SetPassword(String password) {
	    txt_password.sendKeys(password);
	}
	public void ClickSubmit() {
		btn_submit.click();
		
	}
	public boolean CheckLogo() {
	boolean	status=img_logo.isDisplayed();
		return status;
	}
	
}
