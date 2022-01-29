package Waits;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_type1 {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\himaj\\Desktop\\Selenium With Java\\SEelenium_20thDEc\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://testautomationpractice.blogspot.com/");

		// selenium static wait / implicit wait
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		System.out.println("Title of the webpage is :" + driver.getTitle());

		// Explicit wait

		// Syntax: WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);

		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();

		WebDriverWait wait = new WebDriverWait(driver, 2);

		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();

		driver.close();
	}

}
