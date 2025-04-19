package testscripts.joinus;

import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.pages.HomePage;

public class TestJoinus extends BaseTest {
	
	@Test
	public void clickOnJoinUsLink()
	{
		HomePage homePage = new HomePage(driver);
		homePage.getJoinUs().click();
	}
	
	
	

}
