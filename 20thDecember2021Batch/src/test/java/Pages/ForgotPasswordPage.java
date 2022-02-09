package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
	
	WebDriver driver;
	
	public ForgotPasswordPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	//Locator for login button
	public By OrangeHRM_username = By.id("securityAuthentication_userName");
	public By resetPassword_Button = By.id("btnSearchValues");
	public By cancel_Button = By.id("btnCancel");
}
