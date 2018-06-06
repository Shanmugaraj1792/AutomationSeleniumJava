package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wrapperMethods.ProjectMethods;

public class ADV_Login extends ProjectMethods  {
	
	public ADV_Login() {
		PageFactory.initElements(driver, this);
	}

	
	//Enter UserName in the Login Page
	@FindBy(how=How.ID,using="user_name")
	private WebElement userName;
	
	public ADV_Login typeUserName(String email) {
		type(userName, email);
		takeSnap();
		return this;	
	}
	
	//Enter Password in the Login Page
	@FindBy(how=How.ID,using="password")
	private WebElement password;
	
	public ADV_Login typePassword(String pwd) {
		type(password,pwd);
		takeSnap();
		return this;	
	}
	
	//Click Forgot Password link
	
	@FindBy(how=How.LINK_TEXT,using="Forgot Password?")
	private WebElement forgotPassword;
	
	public ADV_ForgotPasswordRequest clickForgotPassword() {
		click(forgotPassword);
		return new ADV_ForgotPasswordRequest();
		
	}
	
	
	//Click "Login" button
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	private WebElement loginButton;
	
	public ADV_AwardsPage clickLoginButton() {
		click(loginButton);
		return new ADV_AwardsPage();
	}
	
	//Click "Start Earning Now! button"
	
	@FindBy(how=How.LINK_TEXT,using="Start Earning Now!")
	private WebElement startEarning;
	
	public ADV_SignUp clickStartEarningNow() {
		clickWithNoSnap(startEarning);
		return new ADV_SignUp();
	}
}
