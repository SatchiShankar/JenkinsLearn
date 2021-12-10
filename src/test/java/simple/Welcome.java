package simple;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pages.BaseTest;
import com.pages.HomePage;


public class Welcome extends BaseTest {
WebDriver driver;
	@Test
	public void searchContent() throws InterruptedException {
		HomePage hp=new HomePage(getDriver());
		hp.searchContent("Testing");
		System.out.println("Hello");
	}

}
