package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/* * SET FIRST NAME
 * SET LAST NAME
 * SELECT DOB
 * PASSWORD 
 * CONFIRM PASSWORD
 */

public class Register {
	public WebDriver driver;
	//constructor
	public Register (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	//webelements
	
   @FindBy(id="FirstName")  WebElement txt_username;
   @FindBy(id="LastName")    WebElement txt_lastname;
   @FindBy(name="DateOfBirthDay")   WebElement dd_date;
    @FindBy(id="Email")           WebElement txt_email;
    @FindBy(id="Password")           WebElement txt_password;
    @FindBy(id="ConfirmPassword")    WebElement txt_confirmpassword;
     @FindBy(name="register-button") WebElement btn_submit;
     
     public  void setfirstname(String firstname) {
    	 txt_username.sendKeys(firstname);
     }
     public void setlastname(String lastname ) {
    	 txt_lastname.sendKeys(lastname);
     }
     public void setdate() {
    	 	Select dates=new Select(dd_date);
    	 	dates.selectByIndex(5);
     }
     public void setemail(String email ) {
    	 txt_email.sendKeys(email);
     }
     public void setpassword(String password) {
    	 txt_password.sendKeys(password);
     }
     public void setconfirmpassword(String confirmpassword) {
    	 txt_confirmpassword.sendKeys(confirmpassword);
     }
     public void clicksubmit( ) {
    	 btn_submit.click();
    	 
     }
	
    
     
}
