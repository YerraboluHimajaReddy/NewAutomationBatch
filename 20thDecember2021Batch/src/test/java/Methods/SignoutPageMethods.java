package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.HomePage;
import Pages.SignoutPage;

public class SignoutPageMethods {

	WebDriver driver;

	SignoutPage sp = new SignoutPage(driver);

	public SignoutPageMethods(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickAbout() {
		sp.about.click();
	}

	public void clickSupport() {
		sp.support.click();
	}

	public void clickLogout() {
		sp.logout.click();
	}

}
