package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wrapperMethods.SeMethods;

public class ADV_FindACar extends SeMethods {

	ADV_FindACar(){
		PageFactory.initElements(driver, this);
	}

	JavascriptExecutor js= (JavascriptExecutor)driver;
	ArrayList<String> myArray = new ArrayList<String>();
	public String pL,dL;

	@FindBy(how=How.ID,using="pickupValue")
	private WebElement pickUpValue;

	//Enter Rental Location Airport Code
	public ADV_FindACar enterRentalLocation(String pickUp) {
		pL=pickUp;
		type(pickUpValue, pickUp);
		return this;
	}

	@FindBy(how=How.ID,using="ui-id-1")
	private WebElement pickLoc;

	//Select pickLocation based on the Airport Code
	public ADV_FindACar selectPickLocation() {
		List<WebElement> optionsCount = pickLoc.findElements(By.tagName("li"));
		for (int i = 1;i<=optionsCount.size(); i++) {

			WebElement pickList = driver.findElementByXPath("//ul[@id='ui-id-1']/li["+i+"]/a");
			if(pickList.getText().contains("- "+pL)) {
				pickList.click();
				break;
			}
		}
		return this;
	}

	@FindBy(how=How.ID,using="dropoffValue")
	private WebElement dropOffValue;

	//Enter Dropoff Location Airport Code
	public ADV_FindACar enterDropLocation(String dropoff) {
		dL=dropoff;
		if(!pL.equalsIgnoreCase(dL)) {
			type(dropOffValue,dropoff);}
		return this;
	}

	@FindBy(how=How.ID,using="ui-id-2")
	private WebElement dropLoc;

	//Select DropLocation based on the Location entered

	public ADV_FindACar selectDropLocation() {
		if(!pL.equalsIgnoreCase(dL)) {
			List<WebElement> dropOptions = dropLoc.findElements(By.tagName("li"));
			//System.out.println(
			js.executeScript("window.scrollBy(0,400)");
			for (int j = 1;j<=dropOptions.size(); j++) {

				WebElement dropList = driver.findElementByXPath("//ul[@id='ui-id-2']/li["+j+"]/a");
				String[] text = dropList.getText().split(" - ");
				if(dL.equals(text[1])) {
					dropList.click();
					System.out.println(text[1]);
					break;
				}
			}
		}
		return this;
	}

	//Enter Pick up date in MM/DD/YYYY format

	public ADV_FindACar enterPickUpdate(String pickDate) {
		js.executeScript("document.getElementById('pickup_date').value='"+pickDate+"'");
		return this;
	}

	//Enter Return Date in MM/DD/YYYY format

	public ADV_FindACar enterDropoffDate(String dropDate) {
		js.executeScript("document.getElementById('dropoff_date').value='"+dropDate+"'");
		return this;
	}

	@FindBy(how=How.ID,using="pickup_time")
	private WebElement pickTime;

	//Select pick Time 
	public ADV_FindACar selectPickTime(String text) {
		selectDropDownUsingText(pickTime, text);
		return this;
	}

	@FindBy(how=How.ID,using="dropoff_time")
	private WebElement DropTime;

	//Select Drop Time

	public ADV_FindACar selectDropTime(String dropValue) {
		selectDropDownUsingText(DropTime, dropValue);
		return this;
	}


	@FindBy(how=How.ID,using="promo_code1")
	private WebElement promoCode_1;


	//Enter Promo code data in the field 1

	public ADV_FindACar enterPromocode_1(String pCode1) {
		type(promoCode_1, pCode1);
		return this;
	}

	@FindBy(how=How.CLASS_NAME,using="aez-add-btn")
	private WebElement addPromoCode;

	//Click ADD Promocode Icon
	public ADV_FindACar clickAddPromoCodeIcon() {
		click(addPromoCode);
		return this;
	}


	@FindBy(how=How.CLASS_NAME,using="aez-remove-btn")
	private WebElement removePromocode;

	//Remove Promocode Icon

	public ADV_FindACar clickRemovePromoCodeIcon() {
		click(removePromocode);
		return this;
	}

	@FindBy(how=How.CLASS_NAME,using="express_checkbox")
	private WebElement expressCheckbox;

	//Enable or Disable Checkbox

	public ADV_FindACar clickExpressCheckBox() {
		click(expressCheckbox);
		return this;
	}

	@FindBy(how=How.ID,using="adv_rez_submit")
	private WebElement search;

	//Click Search Button

	public void clickSearch() {
		click(search);
	}

	@FindBy(how=How.CLASS_NAME,using="aez-error__message")
	private WebElement errorMsg;

	public ADV_FindACar validateErrorMsg() {
		List<WebElement> errorsText = errorMsg.findElements(By.tagName("span"));
		for (WebElement text : errorsText) {
			text.getText();
		}
		return this;
	}



}
