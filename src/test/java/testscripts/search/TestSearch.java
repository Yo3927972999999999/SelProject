package testscripts.search;

import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.pages.HomePage;
import com.automation.pages.SearchDetailsPage;

public class TestSearch extends BaseTest {

	@Test
	public void TestSearch() throws InterruptedException
	{
		HomePage homePage = new HomePage(driver);
		homePage.getSearchLink().click();
		SearchDetailsPage sdPage = new SearchDetailsPage(driver);
		Thread.sleep(3000);
		sdPage.getSearchTextField().sendKeys("shoes");
		
		
	}
}
