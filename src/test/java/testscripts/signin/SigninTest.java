package testscripts.signin;

import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.pages.HomePage;

public class SigninTest extends BaseTest{
	
	@Test
	public void clickOnSignInButton()
	{
		HomePage homePage = new HomePage(driver);
		homePage.getClickOnSignInButton().click();
	}

}
