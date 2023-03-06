package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instalogin {
	
	public WebDriver driver;

	
	//construtor
    public Instalogin(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this); 	
    }
    
    @FindBy(name="username" ) WebElement  txt_username;
    @FindBy(name="password" ) WebElement  txt_password;
    @FindBy(xpath="//a[normalize-space()='Forgotten your password?']" ) WebElement lk_forgottenlink ;
    
    public void setusername(String username) {
    	txt_username.sendKeys(username);
    }
    public void setpassword(String password) {
    	txt_password.sendKeys(password);
    }
    public void click() {
    	lk_forgottenlink.click();
    }
}
