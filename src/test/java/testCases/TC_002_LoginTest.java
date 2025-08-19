package testCases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {
	

		@Test(groups= {"sanity","master"})
		public void verify_login()
		{
			logger.info("**** Starting TC_002_LoginTest  ****");
			logger.debug("capturing application debug logs....");
			try
			{
			//Home page
			HomePage hp=new HomePage(driver);
			Thread.sleep(5000);
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			//WebElement MyAccount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("clickMyAccount")));
			//MyAccount.click();
			hp.clickMyAccount();
			logger.info("clicked on myaccount link on the home page..");
			Thread.sleep(5000);
			hp.clickLogin(); //Login link under MyAccount
			logger.info("clicked on login link under myaccount..");
			
			
			//Login page
			LoginPage lp=new LoginPage(driver);
			logger.info("Entering valid email and password..");
			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clickLogin(); //Login button
			logger.info("clicked on ligin button..");
			
			//My Account Page
			MyAccountPage macc=new MyAccountPage(driver);
					
			boolean targetPage=macc.isMyAccountPageExists();
			
			Assert.assertEquals(targetPage, true,"Login failed");
			}
			catch(Exception e)
			{
				Assert.fail();
			}
			
			logger.info("**** Finished TC_002_LoginTest  ****");
		}
	}