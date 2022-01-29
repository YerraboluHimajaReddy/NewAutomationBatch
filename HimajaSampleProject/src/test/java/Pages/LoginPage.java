package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locator for login button
	public By userName = By.id("txtUsername");
	
	public By password=By.id("txtPassword");
	
	public By loginButton=By.id("btnLogin");
	
	public By forgotPassword=By.linkText("Forgot your password?");
	
	
//	//Method to click login button
//	public void enterUsername() {
//		driver.findElement(userName).sendKeys("Admin");;
//	}
//	
//	public void enterPassword() {
//		driver.findElement(password).sendKeys("admin123");;
//	}
//	
//	public void clickLoginButton() {
//		driver.findElement(loginButton).click();
//	}
//	
//	public void clickForgotPassword() {
//		driver.findElement(forgotPassword).click();
//	}


}
