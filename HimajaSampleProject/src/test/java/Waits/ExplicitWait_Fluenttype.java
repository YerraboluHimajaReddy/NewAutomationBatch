package Waits;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Fluenttype {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\himaj\\Desktop\\Selenium With Java\\SEelenium_20thDEc\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://testautomationpractice.blogspot.com/");

		System.out.println("Title of the webpage is :" + driver.getTitle());

		// Explicit wait

		/*
		 * Syntax: Wait wait = new FluentWait(WebDriver reference) .withTimeout(timeout,
		 * SECONDS) .pollingEvery(timeout, SECONDS) .ignoring(Exception.class);
		 */

//		Wait wait = new FluentWait(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(3, TimeUnit.SECONDS)
//				.ignoring(Exception.class);
//
//		WebElement date = (WebElement) wait.until(new Function<WebDriver, WebElement>() {
//
//			public WebElement apply(WebDriver driver) {
//				return driver.findElement(By.id("datepicker"));
//			}
//		});
		// click on the selenium link
		//date.click();

		// driver.close();
	}

}
