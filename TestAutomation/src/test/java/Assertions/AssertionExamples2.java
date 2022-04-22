package Assertions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionExamples2 {

	public static void main(String args[]) {

		File file = new File("C:/Users/himaj/Desktop/16th Feb 2022/Softwares/chromedriver_win32/chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		String expectedTitle = driver.getTitle();
		String actualTitle = "Automation Testing Practice";
		Assert.assertEquals(actualTitle, expectedTitle);

		driver.findElement(By.id("field2")).sendKeys("Himaja");

		driver.close();

	}

}
