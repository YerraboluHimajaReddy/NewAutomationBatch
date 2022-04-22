package Sample;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgGroups extends DriverExtensions {

	@BeforeSuite
	public void launchApplication() {

		launchBrowser("chrome");

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/login.php");
	}

	@Test(groups = {"smoke"})

	public void enterUsername() {

		driver.findElement(By.id("email")).sendKeys("Himaja");

	}

	@Test(groups = {"smoke"})
	public void enterpassword() {

		driver.findElement(By.id("pass")).sendKeys("bdfhjgjdsvbmes");
	}
	
	@Test(groups = {"regression"})

	public void clickLogin() {

		driver.findElement(By.id("loginbutton")).click();

	}

	@AfterSuite
	public void logout() {

		driver.close();
	}

}
