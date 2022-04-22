package Methods;

import org.openqa.selenium.WebDriver;

import Pages.ForgotPasswordPage;
import Pages.LoginPage;

public class ForgotPasswordPageMethods {

	WebDriver driver;

	ForgotPasswordPage fp = new ForgotPasswordPage(driver);

	public ForgotPasswordPageMethods(WebDriver driver) {

		this.driver = driver;
	}

	public void enterOrangeHRMusername() {

		driver.findElement(fp.orangeHRMusername_textbox).sendKeys("Admin");
	}

	public void clickResetPassword() {

		driver.findElement(fp.resetPassword_button).click();
	}

	public void clickCancel() {

		driver.findElement(fp.cancel_Button).click();
	}

}
