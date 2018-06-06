package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wrapperMethods.SeMethods;

public class ADV_SignUp extends SeMethods {
	
	public String fNameValue;
	public String lNameValue;
	
	public ADV_SignUp() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="first_name")
	private WebElement firstName;
	
	//Enter First name in the MyProfile
	public ADV_SignUp enterFirstName(String fName) {
		type(firstName, fName);;
		return this;
	}
	
	
	@FindBy(how=How.ID,using="last_name")
	private WebElement lastName;
	
	//Enter Last name in the My profile
	public ADV_SignUp enterLastName(String lName) {
		type(lastName, lName);
		return this;
	}
	
	@FindBy(how=How.ID,using="email")
	private WebElement email;
	
	//Enter Email Address in the My profile
	public ADV_SignUp enterEmailAddress(String emailAddress ) {
		type(email,emailAddress);
		return this;
	}
	
	@FindBy(how=How.ID,using="confirm_email")
	private WebElement confirmEmail;
	
	//Enter ConfirmEmail Address in the My profile
	public ADV_SignUp enterConfirmEmail(String confirm_Email) {
		type(confirmEmail, confirm_Email);
		return this;
	}
	
	@FindBy(how=How.ID,using="password")
	private WebElement password;
	
	//Enter Password in the My profile
	public ADV_SignUp enterPassword( String pwd) {
		type(password, pwd);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="phone_number")
	private WebElement phoneNum;
	
	//Enter Phone Number in the My profile
	public ADV_SignUp enterPhonenum(String num) {
		type(phoneNum, num);
		return this;
	}
	
	@FindBy(how=How.ID,using="confirm_phone_number")
	private WebElement confirmPhoneNum;
	
	//Enter Confirm Phone Number in the My profile
	public ADV_SignUp enterConfirmPhoneNum(String confirmNum) {
		type(confirmPhoneNum, confirmNum);
		return this;
	}
	
	@FindBy(how=How.ID,using="dob")
	private WebElement dateofBirth;
	

	@FindBy(how=How.ID,using="pickup_select_dropdown")
	private WebElement pickup;
	
	//Enter Rental Location Airport Codes
	public ADV_SignUp enterPickUpLocationCode(String pickcode) {
		type(pickup, pickcode);
		return this;
	}
	
	@FindBy(how=How.ID,using="dropoff_select_dropdown")
	private WebElement dropOff;
	
	//Enter Return Location Airport Codes
	public ADV_SignUp enterDropoffLocationCode(String dropcode) {
		dropOff.clear();
		type(dropOff, dropcode);
		return this;	
	}
	
	@FindBy(how=How.ID,using="carClassSelector")
	private WebElement carClass;
	
	//Select a car from the list of cars in the "CarClass" Dropdown
	public ADV_SignUp selectCar(String carValue) {
		selectDropDownUsingText(carClass, carValue);
		return this;
	}
	
	@FindBy(how=How.ID,using="frequent_flyer_airline")
	private WebElement frequentairline;
	
	//Select a Airline from the frequentFlyerAirline
	public ADV_SignUp selectAirline(String airlineText) {
		selectDropDownUsingText(frequentairline, airlineText);
		return this;
	}
	
	@FindBy(how=How.ID,using="frequent_flyer_number")
	private WebElement frequentNumber;
	
	//Enter a FrequentFlyerAirline Number
	public ADV_SignUp enterFrequentNumber(String airlineNum) {
		type(frequentNumber, airlineNum);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//label[text()='Additional Driver']")
	private WebElement additionalDriver;
	
	//Validate of Additional Driver option
	public ADV_SignUp validateAdditionalDriverDisplayed() {
		verifyDisplayed(additionalDriver);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@value='1'][@name='additional_driver']")
	private WebElement additionalDriver_Yes;
	
	//Enable Additional Driver Option
	public ADV_SignUp clickAdditionalDriver_Yes() {
		click(additionalDriver_Yes);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//label[@text()='Child Seat']")
	private WebElement childSeat;
	
	//Validate ChildSeat Option
	public ADV_SignUp  validateChildSeatDisplayed() {
		verifyDisplayed(childSeat);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@value='1'][@name='child_seat']")
	private WebElement childSeat_Yes;
	
	//Enable ChildSeat Option
	public ADV_SignUp clickChildSeat_Yes() {
		click (childSeat_Yes);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//label[@text()='Stroller']")
	private WebElement stroller;
	
	//Validate Stroller Option
	public ADV_SignUp validateStrollerDisplayed() {
		verifyDisplayed(stroller);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@value='1'][@name='stroller']")
	private WebElement stroller_Yes;
	
	//Enable Stroller Option
	public ADV_SignUp clickStroller_Yes() {
		click(stroller_Yes);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//label[@text()='Hand Controls Left']")
	private WebElement handControlleft;
	
	//Validate HandControlLeft Option
	public ADV_SignUp validateHandControlLeftDisplayed() {
		verifyDisplayed(handControlleft);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@value='1'][@name='hand_controls_left']")
	private WebElement handControlLeft_Yes;
	
	//Enable HandControlLeft Option
	public ADV_SignUp clickHandControlLeft_Yes() {
		click(handControlLeft_Yes);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//label[@text()='Hand Controls Right']")
	private WebElement handControlRight;
	
	//Validate HandControlRight Option
	
	public ADV_SignUp validateHandControlRightDisplayed() {
		verifyDisplayed(handControlRight);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@value='1'][@name='hand_controls_right']")
	private WebElement handControlRight_Yes;
	
	//Enable Hand Control Right Option
	public ADV_SignUp clickHandControlRight_Yes() {
		click(handControlRight_Yes);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="//label[@text()='GPS/Mobile Technology']")
	private WebElement gpsMtech;
	
	
	//Validate GPS or Mobile Technology Option
	
	public ADV_SignUp validateGPSMobiletechDisplayed() {
		verifyDisplayed(gpsMtech);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@value='1'][@name='gps']")
	private WebElement gpsMtech_Yes;
	
	//Enable GPS or Mobile Tech option
	
	public ADV_SignUp clickGpsMtech_Yes() {
		click(gpsMtech_Yes);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//label[@text()='Ski Rack']")
	private WebElement skiRack;
	
	//Validate SkiRack option
	
	public ADV_SignUp validateSkiRackDisplayed() {
		verifyDisplayed(skiRack);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@value='1'][@name='skirack']")
	private WebElement skirack_Yes;
	
	//Enable Ski Rack option
	
	public ADV_SignUp clickSkiRack_Yes() {
		click(skirack_Yes);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='pay_later_total']")
	private WebElement payLater;
	
	//Verify Pay later Enabled by default
	
	public ADV_SignUp validatePaylaterEnabled() {
		verifySelected(payLater);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='pay_now_total']")
	private WebElement payNow;
	
	//Enable Pay now option
	
	public ADV_SignUp clickPayNowButton() {
		click(payNow);
		return this;
	}
	
	@FindBy(how=How.ID,using="name_on_card_1")
	private WebElement nameOnCard_1;
	
	//Enter name on the card Field 1
	public ADV_SignUp enterNameOnCard(String name) {
		type(nameOnCard_1, name);
		return this;
	}
	
	@FindBy(how=How.ID,using="credit_card_1")
	private WebElement creditCardNo;
	
	//Enter card No 
	public ADV_SignUp enterCardNo(String num) {
		type(creditCardNo, num);
		return this;
	}
	
	@FindBy(how=How.ID,using="expiry_month_1")
	private WebElement expiryMonth_1;
	//Expiry Month Selection
	public ADV_SignUp selectExpiryMonth_Card1(String val) {
		selectDropDownUsingText(expiryMonth_1, val);
		return this;
	}
	
	@FindBy(how=How.ID,using="expiry_year_1")
	private WebElement expiryYear_1;
	
	//Select Expiry year for Card 1
	
	public ADV_SignUp selectExpiryYear_Card1(int inx) {
		selectDropDownUsingIndex(expiryYear_1, inx);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='add-more-card-btn-container']/div[2]/a")
	private WebElement addAnotherCard;
	
	//Click Add Another Card Link
	public ADV_SignUp clickaddAnotherCard() {
		click(addAnotherCard);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='aez-form-item--with-btn']/span)[3]")
	private WebElement plusIcon_AddCard;
	
	//Click plus Icon Add Card
	public ADV_SignUp clickplusIcon_AddCard() {
		click(plusIcon_AddCard);
		return this;
	}
	
	@FindBy(how=How.ID,using="name_on_card_2")
	private WebElement nameOnCard_2;
	
	//Enter Name o the second card
	
	public ADV_SignUp enterNameOnCard_2(String name) {
		type(nameOnCard_2, name);
		return this;
	}
	
	@FindBy(how=How.ID,using="credit_card_2")
	private WebElement cardNo_card2;
	
	//Enter Card No for second card
	
	public ADV_SignUp enterCardNo_card2(String cardNo) {
		type(cardNo_card2, cardNo);
		return this;
	}
	
	@FindBy(how=How.ID,using="expiry_month_2")
	private WebElement expiryMonth_card2;
	
	//Select Expiry Month for second card
	
	public ADV_SignUp selectExpiryMonth_card2(String text) {
		selectDropDownUsingText(expiryMonth_card2, text);
		return this;
	}
	
	@FindBy(how=How.ID,using="expiry_year_2")
	private WebElement expiryYear_Card2;
	
	//Select Expiry year for the second card
	
	public ADV_SignUp selectExpiryYear_card2(String year) {
		selectDropDownUsingText(expiryMonth_card2, year);
		return this;
	}
	
	@FindBy(how=How.ID,using="street_address1")
	private WebElement streetAddress1;
	
	//Enter Street Address 1 in the Renter Address Field
	
	public ADV_SignUp enterStreetAddress1(String address) {
		type(streetAddress1,address);
		return this;
	}
	
	@FindBy(how=How.ID,using="street_address2")
	private WebElement streetAddress2;
	
	//Enter Street Address 2 in the Renter Address Field
	
	public ADV_SignUp enterStreetAddress2(String address2) {
		type(streetAddress2,address2);
		return this;
	}
	
	@FindBy(how=How.ID,using="postal_code")
	private WebElement postalCode;
	
	//Enter Postal code in the Renter Address Field
	
	public ADV_SignUp enterPostalCode(String code) {
		type(postalCode, code);
		return this;
	}
	
	@FindBy(how=How.ID,using="city")
	private WebElement city;
	
	//Enter City name in the renter address Field
	
	public ADV_SignUp enterCityName(String cityName) {
		type(city, cityName);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="state")
	private WebElement state;
	
	//Select State in the Renter Address 
	
	public ADV_SignUp selectState(String stateText) {
		selectDropDownUsingText(state, stateText);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="country")
	private WebElement country;
	
	//Select country in the Renter Address
	
	public ADV_SignUp selectCountry(String countryText) {
		selectDropDownUsingText(country, countryText);
		return this;
	}
	
	@FindBy(how=How.ID,using="use_profile_address")
	private WebElement use_ProfileAddress;
	
	
	//Verify Selected Same as Renter Address Above
	
	public ADV_SignUp validateSelectionofUse_Profile_Address() {
		verifySelected(use_ProfileAddress);
		return this;
	}
	
	//Disable selection of Use profile Address
	
	public ADV_SignUp disable_Use_profileAddress() {
		click(use_ProfileAddress);
		return this;
	}
	
	@FindBy(how=How.ID,using="billing_street_address_1")
	private WebElement billingStreetAddress1;
	
	//Enter the Billing Street address 1
	
	public ADV_SignUp enterBillingAddress1(String bAddress1) {
		type(billingStreetAddress1, bAddress1);
		return this;
	}
	
	@FindBy(how=How.ID,using="billing_street_address_2")
	private WebElement billingStreetAddress2;
	
	//Enter the billing Street Address 2
	public ADV_SignUp enterBillingAddress2(String bAddress2) {
		type(billingStreetAddress2,bAddress2);
		return this;
	}
	
	@FindBy(how=How.ID,using="billing_postal_code")
	private WebElement billingPostalCode;
	
	//Enter the Billing Postal code
	
	public ADV_SignUp enterBillingPostalCode(String bcode) {
		type(billingPostalCode, bcode);
		return this;
	}
	
	@FindBy(how=How.ID,using="billing_city")
	private WebElement bCity;
	
	//Enter the Billing City Name
	
	public ADV_SignUp enterBillingCityName(String bCityName) {
		type(bCity,bCityName);
		return this;
	}
	
	@FindBy(how=How.ID,using="billing_state")
	private WebElement billState;
	
	//Select Billing State 
	
	public ADV_SignUp selectBillingState(String bstateText) {
		selectDropDownUsingText(billState, bstateText);
		return this;
	}
	
	@FindBy(how=How.ID,using="billing_country")
	private WebElement billCountry;
	
	//Select Billing Country
	
	public ADV_SignUp selectBillingCountry(String bcountry) {
		selectDropDownUsingText(billCountry, bcountry);
		return this;
	}
	
	@FindBy(how=How.ID,using="read_location_policy")
	private WebElement termsAndConditionsCheckBox;
	
	//Enable Terms and Conditions Check Box
	
	public ADV_SignUp selectTermsAndConditionsCheckBox() {
		click(termsAndConditionsCheckBox);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Submit']")
	private WebElement submitButton;
	
	
	//Click SignUp form Submit Button
	
	public void clickSubmit() {
		click(submitButton);
	}
	
}
