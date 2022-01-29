package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Methods.HomePageMethods;
import Methods.LoginPageMethods;
import Methods.signOutMethods;
import Pages.LoginPage;

public class LoginApplication {

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\himaj\\Desktop\\Selenium With Java\\SEelenium_20thDEc\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		LoginPage lp = new LoginPage(driver);

		LoginPageMethods lpm = new LoginPageMethods(driver);

		HomePageMethods hpm = new HomePageMethods(driver);

		signOutMethods sm = new signOutMethods(driver);

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		lpm.enterUsername();

		lpm.enterPassword();

		lpm.clickLoginButton();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		hpm.clickWelcomePaul();

		sm.clickLogout();

		driver.close();

	}
}
