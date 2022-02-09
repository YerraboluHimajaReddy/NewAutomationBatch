package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.ForgotPasswordPage;
import Pages.LoginPage;

public class ForgotPasswordPageMethods {
	
	WebDriver driver;
	
	ForgotPasswordPage fp=new ForgotPasswordPage(driver);
	
	public ForgotPasswordPageMethods(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void enterOrangeHRMUsername() {
		driver.findElement(fp.OrangeHRM_username).sendKeys("Admin");
	}
	
	//Method to click login button
	public void clickResetPassowrd() {
		driver.findElement(fp.resetPassword_Button).click();
	}
	
	public void clickCancel() {
		driver.findElement(fp.cancel_Button).click();
	}


}
