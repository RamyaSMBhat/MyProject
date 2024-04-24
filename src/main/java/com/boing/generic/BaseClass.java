package com.boing.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.generic.pom.LoginPage;

public class BaseClass {
	
	public static WebDriver driver;

	@BeforeClass(groups={"smokeTest","regressionTest"})
	public void openBrowser()
	{
//		public void openBrowser(String browser)
//		if(browser.equals("chrome")) {
//			driver=new ChromeDriver();
//		}else if(browser.equals("edge")) {
//			driver=new EdgeDriver();
//		}else if(browser.equals("firefox")) {
//			driver=new FirefoxDriver();
//		}
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("Opening the browser",true);
	}
	
	@BeforeMethod(groups={"smokeTest","regressionTest"})
	public void login() throws IOException
	{
		Reporter.log("Login the browser",true);
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("un");
		String pw = f.getPropertyData("pwd");
		driver.get(url);
		LoginPage l=new LoginPage(driver);
		l.setLoginBtn();
		l.setLogin(un, pw);
		
	}
	
//	@AfterMethod(groups={"smokeTest","regressionTest"})
//	public void logout()c
//	{
//		HomePage h=new HomePage(driver);
//		h.setLogout();
//		Reporter.log("logout the browser",true);
//	}
	
	@AfterClass(groups={"smokeTest","regressionTest"})
	public void closebrowser()
	{
		driver.quit();
		Reporter.log("closing the browser",true);
	}
}


