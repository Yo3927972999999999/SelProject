package testscripts.kids;

import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.pages.HomePage;

public class KidsTest extends BaseTest{
	
	@Test
	public void clickOnKidsLink()
	{
		HomePage homePage = new HomePage(driver);
		homePage.getKidsLink().click();
	}

}
