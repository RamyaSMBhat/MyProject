package com.boing.testscripts;

import java.awt.Window;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.boing.generic.BaseClass;
import com.boing.generic.FileLib;
import com.generic.pom.HomePage;

public class Search extends BaseClass {
	
	public static HomePage h;
	public static FileLib f;
	
	public static void searchClick() throws InterruptedException {
		h.getSearchOrBulkUploadtxt().sendKeys("partname");
		h.getSearchBtn().click();
		Thread.sleep(2000);
		
	}
	
	public static void addCart() throws InterruptedException {
		h.getAddPartBtn().click();
		
		
	}
	public static void viewCart() {
		h.getViewCartBtn().click();
	}
	
	public static void scrollAction() {
		JavascriptExecutor j=(JavascriptExecutor) driver;	
		j.executeAsyncScript("Window.scrollTo(0,500)");
	}                     
	
	
	@Test
	public void testSearch() throws InterruptedException, EncryptedDocumentException, IOException {
		
		Reporter.log("test", true);
		h=new HomePage(driver);
		f=new FileLib();
		String partName = f.getExcelData("partname", 0, 1);
		String msg = "activateSession";
		String errorInCart = "You searched for"+ partName+ ",the highlighted requirements are not available.\r\n"
				+ "We are displaying the inventory we do have.";
		try {
		if(msg.equalsIgnoreCase("ActivateSession")) {
			h.getActivateSessionbtn().click();
			Thread.sleep(4000);
			Search.scrollAction();
			Search.searchClick();
			String qty = h.getQuantitytxt().getText();
			int actualQty=Integer.parseInt(qty);
//			if(errorInCart.equalsIgnoreCase("You searched for" +partName+ ",the highlighted requirements are not available"
//					+"We are displaying the inventory we do have"))
//			{
//				Reporter.log("added" +partName+ "item is not available in inventory", true);
//			}
//			else {
//				Search.addCart();
//			}
			if(actualQty==1){
				h.getQuantitytxt().sendKeys("10");
				addCart();
				Thread.sleep(2000);
			}
			else
			{
				addCart();
			}
		}
		else {
			
			Search.searchClick();
			Search.addCart();
			Thread.sleep(2000);
			Search.viewCart();
		}
		}
		catch(StaleElementReferenceException e)
		{
			
		}
		catch(Exception e) {
			
		}
	}

}
