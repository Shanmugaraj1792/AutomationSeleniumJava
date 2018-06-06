package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wrapperMethods.SeMethods;

public class ADV_Footer extends SeMethods {
	
	public ADV_Footer() {
		PageFactory.initElements(driver, this);
	}
//Social Media icon - Facebook
	@FindBy(how=How.XPATH,using="//ul[@id='menu-social']/li[1]/a")
	private WebElement social_Facebook;
	
	public void clickSocialMedia_Facebook() {
		click(social_Facebook);
	}
	
	//Social Media Icon - Google plus
	@FindBy(how=How.XPATH,using="//ul[@id='menu-social']/li[2]/a")
	private WebElement social_Googleplus;
	
	public void clickSocialMedia_Googleplus() {
		click(social_Googleplus);
	}
	
	//Social Media Icon - Twitter
	@FindBy(how=How.XPATH,using="//ul[@id='menu-social']/li[3]/a")
	private WebElement social_Twitter;
	
	public void clickSocialMedia_Twitter() {
		click(social_Twitter);
	}
	
	//Sign up Email Address Field
	
	@FindBy(how=How.NAME,using="sd_email")
	private WebElement signUpEmailAddress;
	
	public ADV_Footer enterEmailAddress(String email) {
		type(signUpEmailAddress, email);
		return this;
	}
	
	//Sign Up button
	
	@FindBy(how=How.ID,using="receive_specials_discounts_email_button")
	private WebElement signUp;
	public ADV_Footer clickSignUpButton() {
		click(signUp);
		return this;
	}
	
	
	//find a car Footer link
	@FindBy(how=How.XPATH,using="//ul[@id='menu-main-menu-1']/li[1]/a")
	private WebElement findAcarFooter;
	
	public ADV_FindACar clickFindACar_Footer() {
		click(findAcarFooter);
		return new ADV_FindACar();
	}
	
	//My Reservation Footer link
	
	@FindBy(how=How.XPATH,using="//ul[@id='menu-main-menu-1']/li[2]/a")
	private WebElement myReservationFooter;
	
	public ADV_MyReservation clickmyReservation_Footer() {
		click(myReservationFooter);
		return new ADV_MyReservation();
	}
	
	//Locations Footer link
	@FindBy(how=How.XPATH,using="//ul[@id='menu-main-menu-1']/li[3]/a")
	private WebElement locationFooter;
	
	public ADV_Locations clickLocation_Footer() {
		click(locationFooter);
		return new ADV_Locations();
	}
	
	//Vehicles Footer Link
	
	@FindBy(how=How.XPATH,using="//ul[@id='menu-main-menu-1']/li[4]/a")
	private WebElement vehiclesFooter;
	
	public ADV_Vehicles clickVehicles_Footer() {
		click(vehiclesFooter);
		return new ADV_Vehicles();
	}
	
	//About Advantage Footer Link
	
	@FindBy(how=How.XPATH,using="//ul[@id='menu-main-menu-1']/li[5]/a")
	private WebElement aboutAdvantageFooter;
	
	public void clickAboutAdvantage_Footer() {
		click(aboutAdvantageFooter);
	}
	
	//Awards link
	@FindBy(how=How.XPATH,using="//ul[@id='menu-main-menu-1']/li[6]/a")
	private WebElement awardsFooter;
	
	public ADV_Footer clickAwards() {
		click(awardsFooter);
		return new ADV_Footer();
	}
	
	//Advantage Rental Car Blog Footer
	
	@FindBy(how=How.XPATH,using="//ul[@id='menu-secondary-menu-1']/li[1]/a")
	private WebElement blog;
	
	public void clickRentalCarBlog() {
		click(blog);
	}
	
	//Careers Footer link
	
	@FindBy(how=How.XPATH,using="//ul[@id='menu-secondary-menu-1']/li[2]/a")
	private WebElement careers_Footer;
	
	public void clickCareers_Footer() {
		click(careers_Footer);
	}
	
	//Signup Footer link
	
	@FindBy(how=How.XPATH,using="//ul[@id='menu-secondary-menu-1']/li[3]/a")
	private WebElement signUpFooter;
	
	public ADV_SignUp clickSignup_Footer() {
		click(signUpFooter);
		return new ADV_SignUp();
	}
	
	//Login Footer Link
	
	@FindBy(how=How.XPATH,using="//ul[@id='menu-secondary-menu-1']/li[4]/a")
	private WebElement loginFooter;
	
	public ADV_Login clickLogin_Footer() {
		click(loginFooter);
		return new ADV_Login();
	}
}
