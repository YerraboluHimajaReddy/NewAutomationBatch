package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import Pages.AdminPage;
import Pages.LoginPage;

public class AdminPageMethods {

	WebDriver driver;

	AdminPage ap = new AdminPage(driver);

	// Constructor that will be automatically called as soon as the object of the
	// class is created
	public AdminPageMethods(WebDriver driver) {
		this.driver = driver;
	}

//	// Method to click login button
//	public void clickAdmin() {
//		Actions a=new Actions(driver);
//		a.moveToElement(ap.admin).build().perform();
//		//ap.admin.click();
//	}

	public void clickuserManagement() {
		ap.userManagement.click();
	}

	public void clickUsers() {
		ap.users.click();
	}

}
