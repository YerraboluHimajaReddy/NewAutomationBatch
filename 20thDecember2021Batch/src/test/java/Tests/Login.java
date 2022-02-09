package Tests;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Methods.LoginPageMethods;

public class Login {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File(
				"C:\\Users\\himaj\\Desktop\\Selenium With Java\\SEelenium_20thDEc\\chromedriver_win32\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

		WebDriver driver = new ChromeDriver();
		
		LoginPageMethods lpm=new LoginPageMethods(driver);
		
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		lpm.enterUsername();
		
		lpm.enterPassword();
		
		lpm.clickLogin();
		
		driver.close();
		
		


	}

}
