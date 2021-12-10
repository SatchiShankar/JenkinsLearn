package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public WebDriver getDriver() {
		if (!Selenium.driver.get().toString().contains("null"))
			return Selenium.driver.get();
		else {
			
			 Selenium.driver.set(new ChromeDriver());
			 return Selenium.driver.get();
		}
}
	
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.out.println("BeforeMethod");
	  getDriver().get("https://www.google.com/");
	  Thread.sleep(5000);
  }

  @AfterMethod
  public void afterMethod() {
	  getDriver().quit();
  }


   @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
