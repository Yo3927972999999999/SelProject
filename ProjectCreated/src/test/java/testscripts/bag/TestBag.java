package testscripts.bag;

import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.pages.HomePage;

public class TestBag extends BaseTest{
	
	@Test
	public void clickOnBagLink()
	{	
	HomePage homePage = new HomePage(driver);
	homePage.getBagIcon().click();
}
}
