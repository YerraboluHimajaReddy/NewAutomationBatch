package TestNg;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgExample3 {

	public WebDriver driver;

	@BeforeSuite
	public void launchBrowser() {

		File file = new File(
				"C:\\Users\\himaj\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		System.setProperty("webdriver.edge.driver", file.getAbsolutePath());

		driver = new EdgeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

	}

	@BeforeMethod
	public void maximizeBrowser() {
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}
	
	@Test(dependsOnMethods = "EnterField1", enabled = false)
	public void EnterField2() {
				
		driver.findElement(By.id("field2")).sendKeys("Yerrabolu Himaja");
	}
	
	
	@Test(invocationCount =5)
	public void EnterField1() {
		
		driver.findElement(By.id("field1")).clear();
		
		driver.findElement(By.id("field1")).sendKeys("Himaja Yerrabolu");
	}
	
	
	
	@AfterSuite
	public void closeBrowser() {
		
		driver.close();
	}

}
