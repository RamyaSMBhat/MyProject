package com.generic.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement loginBtn;
	
	@FindBy(id="c-username")
	private WebElement uNametbx;
	
	@FindBy(id="c-password")
	private WebElement pNametbx;
	
	@FindBy(id="logInPopup")
	private WebElement lgbtn;
	
	@FindBy(id="showForgotPassword")
	private WebElement forgotUNorPwd;
	
	@FindBy(xpath = "//button[@class='btn pmd-ripple-effect lgn-register']")
	private WebElement registerBtn;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public void setLoginBtn() {
		loginBtn.click();
	}
	
	public void setLogin(String un, String pw) {
		uNametbx.sendKeys(un);
		pNametbx.sendKeys(pw);
		lgbtn.click();
	}
	
}
