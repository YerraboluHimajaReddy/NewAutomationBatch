package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.ForgotPasswordPage;
import Pages.LoginPage;

public class ForgotPasswordMethods {

	WebDriver driver;
	
	ForgotPasswordPage lp=new ForgotPasswordPage(driver);
	
	//Constructor that will be automatically called as soon as the object of the class is created
		public ForgotPasswordMethods(WebDriver driver) {
			this.driver=driver;
		}

	// Method to click login button
	public void enterHRMUsername() {
		driver.findElement(lp.ForgotPassword_userName).sendKeys("Admin");		
	}

	public void clickCancel() {
		driver.findElement(lp.cancelButton).click();
	}
	
	public void resetPassword() {
		driver.findElement(lp.resetPasswordButton).click();
	}

}
