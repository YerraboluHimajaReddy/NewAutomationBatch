package Sample;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgAnnotation extends DriverExtensions {


	@BeforeSuite
	public void launchApplication() {
		

		launchBrowser("edge");

		driver.manage().window().maximize();

		driver.get(
				"https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525806177%7Ce%7Cfacebook%20login%7C&placement=&creative=550525806177&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D1007740%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwloCSBhAeEiwA3hVo_REY46hzdw_f27pInr402jAmX3dDBIF2cTyoYGrhDoQ0xMhdOOLD4BoClsUQAvD_BwE");

	}

	@BeforeClass
	public void waittime() {

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());
	}

	@BeforeMethod()

	public void method1() {

		System.out.println("======================");
	}
	
	@Test(priority = 2)	
	public void enterFirstName() {
		
		driver.findElement(By.name("firstname")).sendKeys("Himaja");
	}
	
	@Test(priority = 1)	
	public void enterLastName() {
		
		driver.findElement(By.name("lastname")).sendKeys("Yerrrabolu");
	}
	
	@Test(dependsOnMethods = "enterLastName", invocationCount = 3)	
	public void enterEmail() {
		
		driver.findElement(By.name("reg_email__")).sendKeys("Yerrrabolu@gmail.com");
		
		/*Yerrrabolu@gmail.com
		Yerrrabolu@gmail.com
		Yerrrabolu@gmail.com*/
	}

	/*@AfterMethod()

	public void method2() {

		System.out.println(" after method ======================");
	}
	
	@AfterClass 
	
	public void classAfter() {
		System.out.println(" After class ======================");

	}*/
	
	@AfterSuite
	
	public void logout() {
		
		driver.close();
	}

}
