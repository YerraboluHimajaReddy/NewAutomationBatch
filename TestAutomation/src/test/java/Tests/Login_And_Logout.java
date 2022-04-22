package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Methods.LoginPageMethods;
import Pages.HomePage;
import Pages.SignOutPage;
import Sample.DriverExtensions;

public class Login_And_Logout  extends DriverExtensions{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/himaj/Desktop/16th Feb 2022/Softwares/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		LoginPageMethods lpm=new LoginPageMethods(driver);
		
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		
		SignOutPage sp=PageFactory.initElements(driver, SignOutPage.class);
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		lpm.enterUserName();
		
		lpm.enterPassword();
		
		lpm.clickLoginButton();
		
		hp.clickWelcomePaul();
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		sp.clickLogout();
		
		driver.close();
		
	}

}
