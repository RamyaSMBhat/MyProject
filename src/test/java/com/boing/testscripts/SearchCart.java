package com.boing.testscripts;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.boing.generic.BaseClass;
import com.generic.pom.CartPage;
import com.generic.pom.HomePage;

public class SearchCart extends BaseClass{
	
	@Test(priority=1)
	public void testsearchCartPage() throws InterruptedException {
		HomePage h=new HomePage(driver);
		String msg = "activateSession";
		if(msg.equalsIgnoreCase("ActivateSession")) {
			h.getActivateSessionbtn().click();
		}
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(h.getSearchOrBulkUploadtxt()));
		h.getSearchOrBulkUploadtxt().sendKeys("AN4-7");
		Thread.sleep(4000);
		h.getSearchBtn().click();
		Thread.sleep(4000);
		h.getQuantitytxt().sendKeys("0");
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(40));
		wait1.until(ExpectedConditions.visibilityOf(h.getAddPartBtn()));
		h.getAddPartBtn().click();
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(40));
		wait2.until(ExpectedConditions.visibilityOf(h.getViewCartBtn()));
		h.getViewCartBtn().click();
		Thread.sleep(4000);
	}

	@Test(priority=2)
	public void testPurchase() throws InterruptedException {
		CartPage c=new CartPage(driver);
		c.getUpdateAllbtn().click();
		Thread.sleep(4000);
		c.getPoNumbertxt().sendKeys("WNS4502");
		Thread.sleep(4000);
		c.getEditShippingMethod().click();
		Thread.sleep(4000);
		Select s1=new Select(c.getCarrierSelectDd());
		s1.selectByValue("FedEx");
		Select s2=new Select(c.getSelectSpeed());
		s2.selectByValue("FedEx International Economy");
		Select s3=new Select(c.getSelectAccount());
		s3.selectByValue("1234567890");
		Thread.sleep(4000);
		c.getOkShippingDetailsBtn().click();
		Thread.sleep(4000);
		c.getTermsAndConditionsChkbx().click();
		Thread.sleep(4000);
		c.getPurchasebtn().click();		
	}
	
}
