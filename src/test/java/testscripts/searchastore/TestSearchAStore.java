package testscripts.searchastore;

import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.pages.FindAStorePage;
import com.automation.pages.HomePage;

public class TestSearchAStore extends BaseTest {
	
	
	@Test
	public void testsearchAStore()
	{
		HomePage homePage = new HomePage(driver);
		homePage.getSearchAStoreLink().click();
		FindAStorePage fsPage = new FindAStorePage(driver);
		fsPage.getSearchStoreTextField().sendKeys("Pune");
		
	}

}
