package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
	
	WebDriver driver;
	
	public ForgotPasswordPage(WebDriver driver){
		
		this.driver=driver;		
	}
	
	public By orangeHRMusername_textbox=By.id("securityAuthentication_userName");
	public By resetPassword_button=By.id("btnSearchValues");
	public By cancel_Button=By.id("btnCancel");	

}
