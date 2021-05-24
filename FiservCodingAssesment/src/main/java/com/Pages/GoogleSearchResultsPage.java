package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchResultsPage {

	private WebDriver driver;
	
	private By searchResults = By.cssSelector("div.Z0LcW.XcVN5d a");
	private By resultsFetched = By.id("result-stats");
	
	public GoogleSearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getSearchResultsText() {
		return driver.findElement(searchResults).getText();
	}
	
	public boolean validateResultsFetched() {
		return driver.findElement(resultsFetched).isDisplayed();
	}
	
}
