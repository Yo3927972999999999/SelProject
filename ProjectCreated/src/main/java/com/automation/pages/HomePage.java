package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//button[text()='New & Featured']")
	private WebElement newAndFeatureModule;
	
	@FindBy(linkText = "Men")
	private WebElement menLink;
	
	@FindBy(id = "nav-search-icon")
	private WebElement searchLink;
	
	

	public WebElement getSearchLink() {
		return searchLink;
	}

	

	

	public WebElement getNewAndFeatureModule() {
		return newAndFeatureModule;
	}

	public WebElement getMenLink() {
		return menLink;
	}

	public WebElement getWomenLink() {
		return womenLink;
	}
	@FindBy(linkText = "Women")
	private WebElement womenLink;
	
	@FindBy(linkText = "SNKRS")
	private WebElement snkrsLink;

	public WebElement getSnkrsLink() {
		return snkrsLink;
	}

	
	

	public WebElement getSaleLink() {
		return saleLink;
	}
	@FindBy(linkText = "Sale")
	private WebElement saleLink;
	
	@FindBy(linkText = "Kids")	
	private WebElement kidsLink;
	
	
	public WebElement getKidsLink() {
		return kidsLink;
	}

	@FindBy(xpath = "//p[text()='Help']")
    private WebElement helpLink;
	
	

	public WebElement getHelpLink() {
		return helpLink;
	}
	
	@FindBy(className = "css-79q9fn")
	private WebElement bagIcon;
	
	public WebElement getBagIcon() {
		return bagIcon;
	}
	
    public WebElement getClickOnSignInButton() {
		return clickOnSignInButton;
	}

	
	@FindBy(xpath = "//p[text()='Sign In']")
	private WebElement clickOnSignInButton;
	
	public WebElement getJoinUs() {
		return joinUs;
	}

	

	
	@FindBy(xpath = "//p[text()='Join Us']")
	private WebElement joinUs;
	
	
	@FindBy(xpath = "//p[text()='Find a Store']")
	private WebElement searchAStoreLink;
	
	public WebElement getSearchAStoreLink() {
		return searchAStoreLink;
		
		
		
	

}
}



