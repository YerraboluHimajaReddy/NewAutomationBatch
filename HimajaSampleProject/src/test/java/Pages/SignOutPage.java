package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOutPage {
	
WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public SignOutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locator for login button
	public By logout_button = By.xpath("//a[contains(text(),'Logout')]");
}
