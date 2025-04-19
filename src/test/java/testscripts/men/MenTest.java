package testscripts.men;

import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.pages.HomePage;

public class MenTest extends BaseTest {
	
	@Test
	public void clickOnMenLink()
	{
		HomePage homePage = new HomePage(driver);
		homePage.getMenLink().click();
		
	}
}
