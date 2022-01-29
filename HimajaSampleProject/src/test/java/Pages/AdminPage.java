package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminPage {

	WebDriver driver;

	// Constructor that will be automatically called as soon as the object of the
	// class is created
	public AdminPage(WebDriver driver) {
		this.driver = driver;
	}

	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Admin')])[1]")
	public WebElement admin;

	@FindBy(how = How.ID, using = "menu_menu_admin_UserManagementadmin_viewAdminModule")
	public WebElement userManagement;

	@FindBy(how = How.ID, using = "menu_admin_viewSystemUsers")
	public WebElement users;

	// Method to click login button
	public void clickAdmin() {
		Actions a = new Actions(driver);
		a.moveToElement(admin).build().perform();
		// ap.admin.click();
	}

}
