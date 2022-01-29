package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
	
WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public ForgotPasswordPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locator for login button
	public By ForgotPassword_userName = By.id("securityAuthentication_userName");
	
	public By cancelButton=By.id("btnCancel");
	
	public By resetPasswordButton=By.id("btnSearchValues");


}
