package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage {

	private WebDriver driver;

	private By searchTextField = By.name("q");
	private By searchButton = By.name("btnK");
	private By search = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");

	public GoogleHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public GoogleHomePage enterSearchText(String searchText) {
		driver.findElement(searchTextField).clear();
		driver.findElement(searchTextField).sendKeys(searchText);
		return this;
	}

	public GoogleSearchResultsPage clickSearchButton() {
		driver.findElement(search).click();
		return new GoogleSearchResultsPage(driver);
	}

}
