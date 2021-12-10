package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@SuppressWarnings("deprecation")
public class Selenium {

	public static ThreadLocal<WebDriver> driver= new ThreadLocal<WebDriver>() {
	      @Override
	      protected WebDriver initialValue()
	      {
	         return new ChromeDriver(); // can be replaced with other browser drivers
	      }
	   };   

	
}
