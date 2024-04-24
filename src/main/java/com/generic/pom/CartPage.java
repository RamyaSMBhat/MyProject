package com.generic.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	@FindBy(xpath="//span[text()='UPDATE ALL']")
	private WebElement updateAllbtn;
	
	@FindBy(id="poNumber")
	private WebElement poNumbertxt;
	
	@FindBy(xpath="//span[contains(text(),' Empty Cart ')]")
	private WebElement emptyCartbtn;
	
	@FindBy(id="createSaveQuote")
	private WebElement saveQuotebtn;
	
	@FindBy(id="advancePurchase")
	private WebElement purchasebtn;
	
	@FindBy(xpath="//span[contains(text(),'I accept Boeing Distribution’s ')]/..//span[@class='pmd-checkbox-label']")
	private WebElement termsAndConditionsChkbx;
	
	@FindBy(xpath="//div[text()='SHIPPING METHOD'][1]/..//button[@autocomplete='off']")
	private WebElement editShippingMethod;
	
	@FindBy(id="carrier") //use select class because tag is created using select tag
	private WebElement carrierSelectDd;
	
	@FindBy(id="carrierSpeed")
	private WebElement selectSpeed;
	
	@FindBy(id="selectAccount")
	private WebElement selectAccount;
	
	@FindBy(id="saveAdvanceShippingDetails")
	private WebElement okShippingDetailsBtn;
	
	@FindBy(xpath="//button[@id='saveAdvanceShippingDetails']/..//button[text()='CANCEL']")
	private WebElement cancelShippingDetailsBtn;
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUpdateAllbtn() {
		return updateAllbtn;
	}

	public WebElement getPoNumbertxt() {
		return poNumbertxt;
	}

	public WebElement getEmptyCartbtn() {
		return emptyCartbtn;
	}

	public WebElement getSaveQuotebtn() {
		return saveQuotebtn;
	}

	public WebElement getPurchasebtn() {
		return purchasebtn;
	}

	public WebElement getTermsAndConditionsChkbx() {
		return termsAndConditionsChkbx;
	}

	public WebElement getEditShippingMethod() {
		return editShippingMethod;
	}

	public WebElement getCarrierSelectDd() {
		return carrierSelectDd;
	}

	public WebElement getSelectSpeed() {
		return selectSpeed;
	}

	public WebElement getSelectAccount() {
		return selectAccount;
	}

	public WebElement getOkShippingDetailsBtn() {
		return okShippingDetailsBtn;
	}

	public WebElement getCancelShippingDetailsBtn() {
		return cancelShippingDetailsBtn;
	}
	
	
	
	
	

}
