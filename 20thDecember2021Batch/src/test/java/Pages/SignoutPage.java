package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignoutPage {

	WebDriver driver;

	public SignoutPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "aboutDisplayLink")
	public WebElement about;

//	Second, by directly using locator(id, XPath, CSS, etc.)  You can explore more about the methods to find elements using Selenium.
	@FindBy(xpath = "//a[contains(text(),'Support')]")
	public WebElement support;

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	public WebElement logout;
	
	public void clickLogout() {
		logout.click();
	}

}
