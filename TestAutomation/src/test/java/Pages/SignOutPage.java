package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignOutPage {
	
	WebDriver driver;
	
	public SignOutPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements (driver,this); 
	}
	
	@FindBy(how=How.ID, using = "aboutDisplayLink")
	public WebElement about;
	
	@FindBy(how=How.XPATH, using = "//a[contains(text(),'Support')]")
	public WebElement support;	
	
	@FindBy(how=How.XPATH, using = "//a[contains(text(),'Logout')]")
	public WebElement logout;	
	
	public void clickLogout() {
		
		logout.click();
	}

}
