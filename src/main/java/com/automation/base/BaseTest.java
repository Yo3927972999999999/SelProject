package com.automation.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
	public WebDriver driver;
	
	@BeforeMethod
	public void LoginintoApplication()
	{
		System.out.println("Login into application done successfully");
	}
	
	@AfterMethod
	public void logoutFromApplication()
	{
		System.out.println("logout from application done successfully");
	}
	
	@BeforeClass
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.get("https://www.nike.com/in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
