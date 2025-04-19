package testscripts.snkrs;

import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.pages.HomePage;

public class SnkrsTest extends BaseTest {
	
	@Test
	public void clickOnSnkrsLink()
	{
		HomePage homePage = new HomePage(driver);
		homePage.getSnkrsLink().click();
	}

}
