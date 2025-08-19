package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//input[@name='firstname']")
WebElement txtFirstName;
@FindBy(xpath="//input[@name='lastname']")
WebElement txtLastName;
@FindBy(xpath="//input[@name='email']")
WebElement txtEmail;
@FindBy(xpath="//input[@name='telephone']")
WebElement txtTelephone;
@FindBy(xpath="//input[@name='password']")
WebElement txtPassword;
@FindBy(xpath="//input[@name='confirm']")
WebElement txtConfirmPassword;
@FindBy(xpath="//input[@name='agree']")
WebElement chkdPolicy;
@FindBy(xpath="//input[@type='submit']")
WebElement btnContinue;
@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
WebElement msgConfirmation;

public void setFirstName(String fname)
{
	txtFirstName.sendKeys(fname);
}
public void setLastName(String lname) {
	txtLastName.sendKeys(lname);

}

public void setEmail(String email) {
	txtEmail.sendKeys(email);

}

public void setTelephone(String tel) {
	txtTelephone.sendKeys(tel);

}

public void setPassword(String pwd) {
	txtPassword.sendKeys(pwd);

}

public void setConfirmPassword(String pwd) {
	txtConfirmPassword.sendKeys(pwd);

}

public void setPrivacyPolicy() {
	chkdPolicy.click();

}

public void clickContinue() {
	//sol1 
	btnContinue.click();
	
	//sol2 
	//btnContinue.submit();
	
	//sol3
	//Actions act=new Actions(driver);
	//act.moveToElement(btnContinue).click().perform();
				
	//sol4
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click();", btnContinue);
	
	//Sol 5
	//btnContinue.sendKeys(Keys.RETURN);
	
	//Sol6  
	//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
	
}
public String getConfirmationMsg()
{
	try {
		return (msgConfirmation.getText());
	}catch(Exception e) {
		return(e.getMessage());
	}
}

	


}//vidya
