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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	public WebDriver driver;

	@BeforeSuite
	public void launchBrowser() {

		File file = new File("C:\\Users\\himaj\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		System.setProperty("webdriver.edge.driver", file.getAbsolutePath());

		driver = new EdgeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

	}

	@BeforeMethod
	public void maximizeBrowser() {

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}

	@DataProvider(name = "Values")
	public Object[][] enterValuesInAFields() {

		Object[][] fields = new Object[2][2];
		// Enter data to row 0 column 0
		fields[0][0] = "1234";
		fields[0][1] = "123";

		fields[1][0] = "Himaja";
		fields[1][1] = "Himaja@123";

		return fields;

	}

	@Test(dataProvider = "Values")
	public void EnterField2(String field1, String field2) {
		
		driver.findElement(By.id("field1")).clear();

		driver.findElement(By.id("field1")).sendKeys(field1);
		
		driver.findElement(By.id("field2")).clear();

		driver.findElement(By.id("field2")).sendKeys(field2);
	}

	@AfterSuite
	public void closeBrowser() {

		driver.close();
	}

}
