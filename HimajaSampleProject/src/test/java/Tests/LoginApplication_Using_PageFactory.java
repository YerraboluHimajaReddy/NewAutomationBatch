package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Methods.AdminPageMethods;
import Methods.HomePageMethods;
import Methods.LoginPageMethods;
import Methods.signOutMethods;
import Pages.AdminPage;
import Pages.LoginPage;

public class LoginApplication_Using_PageFactory {

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\himaj\\Desktop\\Selenium With Java\\SEelenium_20thDEc\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		LoginPage lp = new LoginPage(driver);

		LoginPageMethods lpm = new LoginPageMethods(driver);

		HomePageMethods hpm = new HomePageMethods(driver);

		signOutMethods sm = new signOutMethods(driver);

		// Instantiating Login & Profile page using initElements()
		AdminPageMethods apm = PageFactory.initElements(driver, AdminPageMethods.class);
		
		AdminPage ap = PageFactory.initElements(driver, AdminPage.class);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());

		lpm.enterUsername();

		lpm.enterPassword();

		lpm.clickLoginButton();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		
		ap.clickAdmin();
		
		apm.clickuserManagement();
		
		apm.clickUsers();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());


		hpm.clickWelcomePaul();

		sm.clickLogout();
		
		System.out.println(driver.getTitle());


		//driver.close();

	}
}
