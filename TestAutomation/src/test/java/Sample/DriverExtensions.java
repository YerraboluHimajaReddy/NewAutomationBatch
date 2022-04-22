package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverExtensions {

   public WebDriver driver; 

	public void launchBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:/Users/himaj/Desktop/16th Feb 2022/Softwares/chromedriver_win32/chromedriver.exe");

			driver = new ChromeDriver();
		} 
		else if (browserName.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\himaj\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");

			driver = new EdgeDriver();
			
		} else if (browserName.equalsIgnoreCase("internetexplorer")) {

			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\himaj\\Downloads\\IEDriverServer_x64_4.0.0 (1)\\IEDriverServer.exe");

			driver = new InternetExplorerDriver();
		}

	}

}
