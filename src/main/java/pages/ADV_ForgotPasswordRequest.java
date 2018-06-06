package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wrapperMethods.SeMethods;

public class ADV_ForgotPasswordRequest extends SeMethods {

	ADV_ForgotPasswordRequest(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Request to Reset Password']")
	private WebElement passwordReset;
	
	//Verify the Displayed Text
	
	public ADV_ForgotPasswordRequest validateResetPasswordRequest() {
		verifyDisplayed(passwordReset);
		return this;
	}
	
	@FindBy(how=How.ID,using="email")
	private WebElement emailAddress;
	
	//Enter Email Address 
	public ADV_ForgotPasswordRequest enterEmailAddress(String email) {
		type(emailAddress, email);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Send Me A Reset Email']")
	private WebElement resetEmailButton;
	
	
	//Click "Submit" button
	public ADV_HomePage clickResetEmail() {
		click(resetEmailButton);
		return new ADV_HomePage();
		
	}
}
