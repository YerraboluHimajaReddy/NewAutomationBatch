package Methods;

import org.openqa.selenium.WebDriver;

import Pages.LoginPage;

public class LoginPageMethods {
	
	WebDriver driver;
	
	LoginPage lp=new LoginPage(driver);
	
	public LoginPageMethods(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void enterUsername() {
		driver.findElement(lp.username).sendKeys("Admin");
	}
	
	public void enterPassword() {
		driver.findElement(lp.password).sendKeys("admin123");
	}
	
	//Method to click login button
	public void clickLogin() {
		driver.findElement(lp.login_Button).click();
	}
	
	public void forgotPassowrd() {
		driver.findElement(lp.forgot_password).click();
	}


}
