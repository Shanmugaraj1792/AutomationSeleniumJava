package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wrapperMethods.ProjectMethods;

public class ADV_MyReservation extends ProjectMethods {
	
	public String pickLocation;

	public ADV_MyReservation() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="locations-dropdown-my-reservations")
	private WebElement location;
	
	public ADV_MyReservation typeLocationCode(String rentLocation) {
		pickLocation=rentLocation;
		type(location, rentLocation);
		return new ADV_MyReservation();
	}
	
	//Select pick Location List 
	@FindBy(how=How.ID,using="ui-id-3")
	private WebElement click_Rental_Location;
	
	public ADV_MyReservation clickRentalLocation() {
		try {
			List<WebElement> optionsCount = click_Rental_Location.findElements(By.tagName("li"));
			System.out.println("Total Count:" +optionsCount.size());
			
			//Iterate the Loop to select the valid Location
			for (int i = 1;i<=optionsCount.size(); i++) {
			
					WebElement pickList = driver.findElementByXPath("//ul[@id='ui-id-3']/li["+i+"]/a");
					if(pickList.getText().contains("- "+pickLocation)) {
						pickList.click();
						break;
					}
			}
		
		}		
		catch(Exception e) {
		System.out.println(e.getMessage());
		}
		return this;
	}
	
	
	
	//Enter Lastname  in the last name Field

	@FindBy(how=How.ID,using="renter_last")
	private WebElement lastName;
	
	public ADV_MyReservation enterLastName(String name) {
		type(lastName, name);
		return this;
	}
	
	
	//Enter Confirm Num 
	@FindBy(how=How.ID,using="confirm_num")
	private WebElement confirm_Num;
	
	public ADV_MyReservation enterConfirmNum(String num) {
		type(confirm_Num, num);
		return this;
	}
	

	//Validate Positive flow Click "Search"
	
	@FindBy (how=How.XPATH,using="(//button[@id='adv_rez_submit'])[2]")
	private WebElement searchButton;
	
	public ADV_ViewReservation clickSearchButton() {
		click(searchButton);
		return new ADV_ViewReservation();
	}
	
	//Negative Check Validation
	
	public ADV_MyReservation clickSearchInvalidData() {
		click (searchButton);
		return this;
	}
	
}
