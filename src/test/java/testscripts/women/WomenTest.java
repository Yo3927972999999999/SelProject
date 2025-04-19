package testscripts.women;

import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.pages.HomePage;

public class WomenTest extends BaseTest {
    
	@Test
	public void clickOnWomenLink()
	{
		HomePage homePage = new HomePage(driver);
		homePage.getWomenLink().click();
	}
}
