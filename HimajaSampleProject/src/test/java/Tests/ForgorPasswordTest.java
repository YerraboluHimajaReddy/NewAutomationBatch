package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Methods.ForgotPasswordMethods;
import Methods.LoginPageMethods;
import Pages.LoginPage;

public class ForgorPasswordTest {

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\himaj\\Desktop\\Selenium With Java\\SEelenium_20thDEc\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		LoginPageMethods lp = new LoginPageMethods(driver);

		ForgotPasswordMethods fp = new ForgotPasswordMethods(driver);

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		lp.clickForgotPassword();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		fp.enterHRMUsername();

		fp.clickCancel();

		driver.close();

	}
}
