package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BaseTest{
	@FindBy(name="q")
	private WebElement txtSearch;
	
	@FindBy(name="btnK")
	private WebElement btnSearch;
	
	public HomePage(WebDriver selenium) {
		super();
		PageFactory.initElements(selenium, this);
	}

	public void searchContent(String s) throws InterruptedException {
		txtSearch.sendKeys(s);
		Thread.sleep(3000);
		btnSearch.click();
	}
	
}
