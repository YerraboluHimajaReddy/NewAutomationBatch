package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Methods.ForgotPasswordPageMethods;
import Methods.LoginPageMethods;

public class ForgotPassowrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/himaj/Desktop/16th Feb 2022/Softwares/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		LoginPageMethods lpm=new LoginPageMethods(driver);
		
		ForgotPasswordPageMethods fpm=new ForgotPasswordPageMethods(driver);
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		lpm.clickForgotPassword();
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		fpm.enterOrangeHRMusername();
		
		fpm.clickResetPassword();
		
		driver.close();
		
	}

}
