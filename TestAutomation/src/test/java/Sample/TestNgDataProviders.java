package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataProviders extends DriverExtensions {

	@BeforeSuite
	public void launchApplication() {

		launchBrowser("chrome");

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/login.php");
	}

	@DataProvider(name = "facebookTest")

	public Object[][] facebookData() {
		
		Object[][] facebookData = new Object[3][2];

		facebookData[0][0] = "himajareddyyerrabolu";
		facebookData[0][1] = "himaja";
		facebookData[1][0] = "himajareddyyerrabolu@gmail.com";
		facebookData[1][1] = "himajareddy";
		facebookData[2][0] = "himajareddy@gmailyerrabolu";
		facebookData[2][1]="himajareddyyerrabolu#bfjksgs";
		
		return facebookData;

	}
	
	@Test(dataProvider ="facebookTest" )
	
	public void verifyFacebookLogin(String username, String password) {
		
		//driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(username);
		//driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
	}

	@AfterSuite
	public void logout() {

		driver.close();
	}

}
