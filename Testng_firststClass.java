package com.sambit.NewMaven;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng_firststClass 
{
	WebDriver driver ;
	SoftAssert softass= new SoftAssert();
  @Test
  public void f() 
  {
    	    String baseUrl = "https://www.facebook.com/";
	        System.out.println("Launching Google Chrome browser"); 
	        ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
//			System.setProperty("webdriver.chrome.driver","C:\\JAVA\\WORKSPACE\\chromedriver.exe");
//			WebDriver driver =new ChromeDriver(options);
			driver =WebDriverManager.chromedriver().create();
	        driver.get(baseUrl);
	        String testTitle = "Check for weather browser is launching or not";
	        String originalTitle = driver.getTitle();
	        softass.assertEquals(originalTitle, testTitle);
	        softass.assertAll();
  }
	        @BeforeMethod
  public void beforeMethod()
 {
      System.out.println("Starting Testing On Chrome Browser");
 }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.close();
		System.out.println("Finished Test On Chrome Browser");
  }
}


