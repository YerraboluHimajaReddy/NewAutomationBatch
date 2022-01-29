package ExtentReports;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsExample1 {

	public WebDriver driver;

	@Test
	public void launch() throws IOException {
		// TODO Auto-generated method stub
		File file = new File(
				"C:\\Users\\himaj\\Desktop\\Selenium With Java\\SEelenium_20thDEc\\chromedriver_win32\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(screenshotFile, new File(
				"C:\\Users\\himaj\\Desktop\\Selenium With Java New Batch\\HimajaSampleProject\\src\\test\\java\\Screenshots\\AfterlaunchAutomationPracticeExtentReports.png"));

		System.out.println(" title of the page :" + driver.getTitle());

	}

	@Test
	public void extent() {

		ExtentReports report;
		
		report = new ExtentReports(System.getProperty("user.dir") + "/test-output/STMExtentReport.html", true);

		// or
		// report = new ExtentReports
		// (System.getProperty("C:\\Users\\Sony\\Desktop\\Selenium With
		// Java\\Selenium\\Selenium Advanced Concepts\\Extent Reports")
		// +"/STMExtentReport.html",true);

		report.startTest("ExtentReportsExample1");
		// test.log(LogStatus.INFO, "Extent report info");

		// test.log(LogStatus.INFO, "Extent report info");

		// report.endTest(test);
		report.flush();

	}
	
	@Test
	
	public void method1() {
		
		driver.findElement(By.id("field2")).sendKeys("Himaja");
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

//	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
//
//		ExtentReports report;
//		// ExtentTest test=null;
//
//		report = new ExtentReports(System.getProperty("user.dir") + "/test-output/STMExtentReport.html", true);
//
//		// or
//		// report = new ExtentReports
//		// (System.getProperty("C:\\Users\\Sony\\Desktop\\Selenium With
//		// Java\\Selenium\\Selenium Advanced Concepts\\Extent Reports")
//		// +"/STMExtentReport.html",true);
//
//		report.startTest("ExtentReportsExample1");
//		// test.log(LogStatus.INFO, "Extent report info");
//
//		// test.log(LogStatus.INFO, "Extent report info");
//
//		// report.endTest(test);
//		report.flush();
//
//	}

}
