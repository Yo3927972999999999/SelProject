package testscripts.gethelp;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automation.base.BaseTest;

import com.automation.pages.HomePage;

public class TestGetHelp extends BaseTest {
	
	 @Test
	 public void testGetHelp() 
	 {
		 HomePage homePage = new HomePage(driver);
		 homePage.getHelpLink().click();
		 
		 
	 }
	
	

}
