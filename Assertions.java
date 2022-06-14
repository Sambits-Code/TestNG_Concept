package com.sambit.NewMaven;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions 
{
	WebDriver driver;
	/*@Test (priority = 0)
	public void CloseBrowser() 
	{
		driver.close();
		Reporter.log("Driver Closed After Testing");
	}*/
	
	@Test (priority = -1)
	public void OpenBrowser() 
	{
			driver =WebDriverManager.chromedriver().create();
			System.out.println("Launching Google Chrome browser"); 
		
			Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
	        Reporter.log("Launching Google Chrome Driver version 81 for this test"); 
	        driver.get("https://www.amazon.com");
	        Reporter.log("The website used as automating for this test", true);
	        
	        String expectedTitle = " Automation helps For Testers";
	        String originalTitle = driver.getTitle();
	        if(expectedTitle!=originalTitle)
	        {
	        	System.out.println("Failed" + "Bhala se practise Kare");
	        }
	        else
	        {
	        	System.out.println("Passed" +originalTitle);
	        }
	        Assert.assertEquals(originalTitle, expectedTitle);
	        
	        
  }
}

