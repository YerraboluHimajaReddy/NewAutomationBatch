package Methods;
import org.openqa.selenium.WebDriver;
import Pages.HomePage;

public class HomePageMethods {

	WebDriver driver;

	HomePage hp = new HomePage(driver);

	public HomePageMethods(WebDriver driver) {

		this.driver = driver;
	}

	public void clickWelcomPaul() {
		hp.welcomepaul.click();
	}

}
