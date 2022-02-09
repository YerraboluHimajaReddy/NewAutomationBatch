package Tests;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Methods.ForgotPasswordPageMethods;
import Methods.LoginPageMethods;
import Pages.ForgotPasswordPage;

public class ForgotPassword {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File(
				"C:\\Users\\himaj\\Desktop\\Selenium With Java\\SEelenium_20thDEc\\chromedriver_win32\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

		WebDriver driver = new ChromeDriver();
		
		LoginPageMethods lpm=new LoginPageMethods(driver);
		
		ForgotPasswordPageMethods fpm=new ForgotPasswordPageMethods(driver);
		
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");	
		
		lpm.forgotPassowrd();
		
		fpm.enterOrangeHRMUsername();
		
		fpm.clickCancel();
		
		//driver.close();
		
		


	}

}
