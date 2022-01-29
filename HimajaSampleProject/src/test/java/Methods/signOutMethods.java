package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignOutPage;

public class signOutMethods {

	WebDriver driver;
	
	SignOutPage sp=new SignOutPage(driver);
	
	//Constructor that will be automatically called as soon as the object of the class is created
		public signOutMethods(WebDriver driver) {
			this.driver=driver;
		}

	
	public void clickLogout() {
		driver.findElement(sp.logout_button).click();
	}
}
