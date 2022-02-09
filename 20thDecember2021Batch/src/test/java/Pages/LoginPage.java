package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	//Locator for login button
	public By username = By.id("txtUsername");
	public By password = By.id("txtPassword");
	public By login_Button = By.id("btnLogin");
	public By forgot_password = By.linkText("Forgot your password?");
	
//	//Method to click login button
//	public void clickLogin() {
//		driver.findElement(LoginBtn).click();
//	}


}
