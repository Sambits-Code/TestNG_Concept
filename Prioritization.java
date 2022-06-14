package com.sambit.NewMaven;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prioritization 
{
	WebDriver driver; 
	@Test (priority = 0)
	public void CloseBrowser() 
	{
		
		driver.close();
		System.out.println("Closing Google Chrome browser");
	}

	@Test (priority = -1)
	public void OpenBrowser() 
	{
		driver =WebDriverManager.chromedriver().create();
		System.out.println("Launching Google Chrome browser"); 
		driver.get("https://www.amazon.com");
	}
	@Test
	public void AccountTest()
	{
		System.out.println("Some tests for Customer Account");
	}
}
