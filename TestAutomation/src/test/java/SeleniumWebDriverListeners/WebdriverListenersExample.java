package SeleniumWebDriverListeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebdriverListenersExample extends ListenersExample {

	//public static void main(String[] args) 
	@Test
	public void Login()
	{
		// TODO Auto-generated method stub

		WebdriverListenersExample we = new WebdriverListenersExample();

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/himaj/Desktop/16th Feb 2022/Softwares/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://testautomationpractice.blogspot.com/");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		System.out.println("Title of the webpage is :" + driver.getTitle());
		
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();

		we.beforeAlertAccept(driver);

		driver.switchTo().alert().accept();

		we.afterAlertAccept(driver);
		
		WebElement date = driver.findElement((By.id("datepicker")));

		we.beforeClickOn(date, driver);

		date.click();

		we.afterClickOn(date, driver);

		driver.close();

	}

}
