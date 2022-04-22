package Sample;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File screenshot;

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/himaj/Desktop/16th Feb 2022/Softwares/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		//fileu
	}

}
