package TestNg;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgExample2 {

	public WebDriver driver;

	@BeforeSuite
	public void launchBrowser() {

		File file = new File(
				"C:\\Users\\himaj\\Desktop\\Selenium With Java\\SEelenium_20thDEc\\chromedriver_win32\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

		driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

	}

	@BeforeMethod
	public void maximizeBrowser() {
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}
	
	@Test(priority = 1)
	public void EnterField2() {
				
		driver.findElement(By.id("field2")).sendKeys("Yerrabolu Himaja");
	}
	
	
	@Test(priority = 2)
	public void EnterField1() {
		
		driver.findElement(By.id("field1")).clear();
		
		driver.findElement(By.id("field1")).sendKeys("Himaja Yerrabolu");
	}
	
	
	
	@AfterSuite
	public void closeBrowser() {
		
		driver.close();
	}

}
