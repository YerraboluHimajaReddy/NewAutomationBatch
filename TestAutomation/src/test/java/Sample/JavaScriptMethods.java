package Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/himaj/Desktop/16th Feb 2022/Softwares/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Vertical scroll - down by 500 pixels

		js.executeScript("window.scrollBy(0,1000)");

		// for scrolling till the bottom of the page we can use the code like

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		// scroll into element

		WebElement element = driver.findElement(By.xpath("//h2[text()='HTML Table']"));

		js.executeScript("arguments[0].scrollIntoView()", element);

		// To navigate to a different page using Javascript

		js.executeScript("window.location='https://www.gmail.com';");

		driver.close();

	}

}
