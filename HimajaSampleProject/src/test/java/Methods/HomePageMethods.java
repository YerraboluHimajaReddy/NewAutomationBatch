package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Pages.LoginPage;

public class HomePageMethods {

	WebDriver driver;
	
	HomePage hp=new HomePage(driver);
	
	//Constructor that will be automatically called as soon as the object of the class is created
		public HomePageMethods(WebDriver driver) {
			this.driver=driver;
		}

	
	public void clickWelcomePaul() {
		driver.findElement(hp.welcomePaul).click();
	}
}
