package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.LoginPage;

public class LoginPageMethods {

	WebDriver driver;
	
	LoginPage lp=new LoginPage(driver);
	
	//Constructor that will be automatically called as soon as the object of the class is created
		public LoginPageMethods(WebDriver driver) {
			this.driver=driver;
		}

	// Method to click login button
	public void enterUsername() {
		driver.findElement(lp.userName).sendKeys("Admin");		
	}

	public void enterPassword() {
		driver.findElement(lp.password).sendKeys("admin123");
	}

	public void clickLoginButton() {
		driver.findElement(lp.loginButton).click();
	}

	public void clickForgotPassword() {
		driver.findElement(lp.forgotPassword).click();
	}

}
