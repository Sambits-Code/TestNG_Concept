package com.sambit.NewMaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTestng 
{
private static WebDriver driver;
@DataProvider(name = "Authentication")
public static Object[][] credentials() 
{
	return new Object[][] { { "sambitdash10@gmail.com", "Sambit$95" }, { "sandeepdas92@gmail.com", "Sandeep$1403" }};

}
@Test(dataProvider = "Authentication")
public void test(String sUsername, String sPassword) {
	driver = WebDriverManager.chromedriver().create();
    //driver = new ChromeDriver();

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    driver.get("https://www.amazon.in");

    driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-flyout-anchor']/div[13]/div[2]/a[1]/span[1]")).click();

    // Argument passed will be used here as String Variable

    driver.findElement(By.id("ap_email")).sendKeys("sambitdash10@gmail.com");

    driver.findElement(By.id("continue")).click();
    
    driver.findElement(By.id("ap_password")).sendKeys("Sambit$07");

    driver.findElement(By.id("signInSubmit")).click();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    driver.findElement(By.xpath("//a[@id='nav-item-signout']")).click();

    driver.quit();

}



  @Test(dataProvider = "dp")
  public void f(Integer n, String s)
  {
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    		{
    			new Object[] { 1, "a" },
    			new Object[] { 2, "b" },
    		};
  }
  
}
