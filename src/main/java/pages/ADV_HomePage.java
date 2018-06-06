package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wrapperMethods.SeMethods;

public class ADV_HomePage extends SeMethods {
	
	
public ADV_HomePage() {
	PageFactory.initElements(driver, this);
}

public String text[];

//SignUp pop up promo offer

@FindBy(how=How.CLASS_NAME,using="popmake-close")
private WebElement popclose;

public ADV_HomePage clickPopClose() {
	click(popclose);
	return this;
}

//Email Sent Message -- Forgot Password Confirmation link
@FindBy(how=How.CLASS_NAME,using="aez-success__message")
private WebElement emailSuccessmsg;

public ADV_HomePage validateEmailPasswordResetMessage() {
	for(int i=1;i<=2;i++) {
	 text[i] = driver.findElementByXPath("//div[@class='aez-success__message']/span["+i+"]").getText(); 
	}
	return this;
}

//Check Availability Button
@FindBy(how=How.CLASS_NAME,using="aez-check-available-btn")
private WebElement checkAvailability;


public ADV_HomePage validateCheckAvailabilityDisplayed() {
	verifyDisplayed(checkAvailability);
	return this;
}

//See U.S. Locations Button
@FindBy(how=How.XPATH,using="//a[text()='See U.S. Locations']")
private WebElement US_loc;

public ADV_Locations clickSeeUSLocation() {
	click(US_loc);
	return new ADV_Locations();
}


//See International Locations

@FindBy(how=How.XPATH,using="//a[text()='See International Locations']")
private WebElement Internation_Loc;


public ADV_Locations clickSeeInternationalLocation() {
	click(Internation_Loc);
	return new ADV_Locations();
}



}
