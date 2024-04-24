package com.generic.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(id="activateSession")
	private WebElement activateSessionbtn;
	
	@FindBy(id="searchInput")
	private WebElement searchOrBulkUploadtxt;
	
	@FindBy(id="boxSearch")
	private WebElement searchBtn;
	
	@FindBy(id="clearSearch")
	private WebElement clearSearchBtn;
	
	@FindBy(xpath="//span[text()='ADD PART']")
	private WebElement addPartBtn;
	
	@FindBy(xpath="//button[contains(text(),'VIEW CART')]")
	private WebElement viewCartBtn;
	
	@FindBy(xpath="//span[text()='QUANTITY']/..//input[@id='special_in_qty']")
	private WebElement quantitytxt;
	
	public WebElement getQuantitytxt() {
		return quantitytxt;
	}

	public WebElement getViewCartBtn() {
		return viewCartBtn;
	}

	public WebElement getAddPartBtn() {
		return addPartBtn;
	}

	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getActivateSessionbtn() {
	return activateSessionbtn;
	}

	public WebElement getSearchOrBulkUploadtxt() {
	return searchOrBulkUploadtxt;
	}

	public WebElement getSearchBtn() {
	return searchBtn;
	}

	public WebElement getClearSearchBtn() {
	return clearSearchBtn;
	}


}
