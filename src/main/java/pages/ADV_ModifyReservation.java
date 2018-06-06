package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wrapperMethods.SeMethods;

public class ADV_ModifyReservation extends SeMethods {
	
	ADV_ModifyReservation(){
		PageFactory.initElements(driver, this);
	}
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	@FindBy(how=How.ID,using="rental_location_id")
	private WebElement rentalLocationId;
	
	
	@FindBy(how=How.ID,using="return_location_id")
	private WebElement returnLocationId;
	
	@FindBy(how=How.ID,using="return_to_same")
	private WebElement returntoSameCheck;
	
	public ADV_ModifyReservation verifyReturntoSameCheckboxEnabled() {
		if(returntoSameCheck.isEnabled()) {
			click(returntoSameCheck);
		}
		return this;
	}
	
	
	//Enter Pick up date in MM/DD/YYYY format

	public ADV_ModifyReservation enterPickUpdate(String pickDate) {
		js.executeScript("document.getElementById('pickup_date').value='"+pickDate+"'");
		return this;
	}
	
	//Enter Return Date in MM/DD/YYYY format

		public ADV_ModifyReservation enterDropoffDate(String dropDate) {
			js.executeScript("document.getElementById('dropoff_date').value='"+dropDate+"'");
			return this;
		}
		
		
		@FindBy(how=How.ID,using="pickup_time")
		private WebElement pickTime;

		//Select pick Time 
		public ADV_ModifyReservation selectPickTime(String text) {
			selectDropDownUsingText(pickTime, text);
			return this;
		}

		@FindBy(how=How.ID,using="dropoff_time")
		private WebElement DropTime;

		//Select Drop Time

		public ADV_ModifyReservation selectDropTime(String dropValue) {
			selectDropDownUsingText(DropTime, dropValue);
			return this;
		}
		
		@FindBy(how=How.ID,using="promo_code1")
		private WebElement promoCode_1;


		//Enter Promo code data in the field 1

		public ADV_ModifyReservation enterPromocode_1(String pCode1) {
			type(promoCode_1, pCode1);
			return this;
		}

		@FindBy(how=How.CLASS_NAME,using="aez-add-btn")
		private WebElement addPromoCode;

		//Click ADD Promocode Icon
		public ADV_ModifyReservation clickAddPromoCodeIcon() {
			click(addPromoCode);
			return this;
		}


		@FindBy(how=How.CLASS_NAME,using="aez-remove-btn")
		private WebElement removePromocode;

		//Remove Promocode Icon

		public ADV_ModifyReservation clickRemovePromoCodeIcon() {
			click(removePromocode);
			return this;
		}
		
		@FindBy(how=How.ID,using="update_rez_submit")
		private WebElement update;

		//Click Search Button

		public void clickSearch() {
			click(update);
		}
}
