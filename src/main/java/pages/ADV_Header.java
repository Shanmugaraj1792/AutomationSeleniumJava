package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wrapperMethods.SeMethods;

public class ADV_Header extends SeMethods {
	
	public ADV_Header() {
		PageFactory.initElements(driver, this);
	}
	
	//Header Find A Car link
	@FindBy(how=How.XPATH,using="//ul[@id='menu-main-menu']/li[1]/a")
	private WebElement findACar;
	
	public ADV_FindACar clickFindACar() {
		click(findACar);
		return new ADV_FindACar();	
	}
	
	//Header My Reservation Link
	@FindBy(how=How.XPATH,using="//ul[@id='menu-main-menu']/li[2]/a")
	private WebElement myReservation;
	
	public ADV_MyReservation clickMyReservation() {
		click(myReservation);
		return new ADV_MyReservation();
	}
	
	//Header Locations link
	@FindBy(how=How.XPATH,using ="//ul[@id='menu-main-menu']/li[3]/a")
	private WebElement location;
	
	public ADV_Locations clickLocations() {
		click(location);
		return new ADV_Locations();
	}
	
	//Header Vehicles link
	@FindBy(how=How.XPATH,using="//ul[@id='menu-main-menu']/li[4]/a")
	private WebElement vehicles;
	
	public ADV_Vehicles clickVehicles() {
		click (vehicles);
		return new ADV_Vehicles();
	}
	
	
	//Header aboutAdvantage Link
	@FindBy(how=How.XPATH,using="//ul[@id='menu-main-menu']/li[5]/a")
	private WebElement aboutAdvantage;
	
	public void clickAboutAdvantage() {
		click(aboutAdvantage);
	}
	
	//Header Blog link
	@FindBy(how=How.XPATH,using="//ul[@id='menu-secondary-menu']/li[1]/a")
	private WebElement blog;
	
	public void clickBlog() {
		click(blog);
	}
	
	//Header Careers Link
	@FindBy(how=How.XPATH,using="//ul[@id='menu-secondary-menu']/li[2]/a")
	private WebElement careers;
	
	public void clickCareers() {
		click(careers);
	}
	
	//Header SignUp link
	
	@FindBy(how=How.XPATH,using="//ul[@id='menu-secondary-menu']/li[3]/a")
	private WebElement signUp;
	
	public ADV_SignUp clickSignUp() {
		click(signUp);
		return new ADV_SignUp();
	}
	
	//Header Login Link
	@FindBy(how=How.XPATH,using="//ul[@id='menu-secondary-menu']/li[4]/a")
	private WebElement login;
	
	public ADV_Login clickLogin() {
		click(login);
		return new ADV_Login();
	}
}
