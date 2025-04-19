package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchDetailsPage {
    
	WebDriver driver;
	 public SearchDetailsPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(id= "gn-search-input")
	 private WebElement searchTextField;
	 
	

	public WebElement getSearchTextField() {
		return searchTextField;
	}
}
