package Tests;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Methods.ForgotPasswordPageMethods;
import Methods.HomePageMethods;
import Methods.LoginPageMethods;
import Methods.SignoutPageMethods;
import Pages.ForgotPasswordPage;
import Pages.HomePage;
import Pages.SignoutPage;

public class Login_And_Logout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File(
				"C:\\Users\\himaj\\Desktop\\Selenium With Java\\SEelenium_20thDEc\\chromedriver_win32\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

		WebDriver driver = new ChromeDriver();

		LoginPageMethods lpm = new LoginPageMethods(driver);

		HomePageMethods hpm = PageFactory.initElements(driver, HomePageMethods.class);

		HomePage hp = PageFactory.initElements(driver, HomePage.class);

		SignoutPage spm = PageFactory.initElements(driver, SignoutPage.class);

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		lpm.enterUsername();

		lpm.enterPassword();

		lpm.clickLogin();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		hp.clickWelcomPaul();

		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

		spm.clickLogout();

		driver.close();

	}

}
