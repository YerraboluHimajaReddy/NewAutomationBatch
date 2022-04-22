package Assertions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	public WebDriver driver;

	@BeforeSuite
	public void lanuchBrowser() throws IOException {

		File file = new File("C:/Users/himaj/Desktop/16th Feb 2022/Softwares/chromedriver_win32/chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	}

	@Test(priority = 1)
	public void titleOfThePage() {

		String expectedTitle = driver.getTitle();
		String actualTitle = "Automation";
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actualTitle, expectedTitle);
		sa.assertAll();
		driver.findElement(By.id("field2")).sendKeys("Himaja");

	}

	@AfterSuite
	public void logout() {

		driver.close();

	}
}
