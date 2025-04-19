package testscripts.sale;

import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.pages.HomePage;

public class SaleTest extends BaseTest {
	
	@Test
	public void clickOnSaleLink()
	{	
	HomePage homePage = new HomePage(driver);
	homePage.getSaleLink().click();

}
}
