package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Methods.LoginPageMethods;
import Sample.DriverExtensions;

public class Login  extends DriverExtensions{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*DriverExtensions ds=new DriverExtensions();
		
		ds.launchBrowser("chrome");*/
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/himaj/Desktop/16th Feb 2022/Softwares/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		LoginPageMethods lpm=new LoginPageMethods(driver);
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		lpm.enterUserName();
		
		lpm.enterPassword();
		
		lpm.clickLoginButton();
		
		driver.close();
		
	}

}
