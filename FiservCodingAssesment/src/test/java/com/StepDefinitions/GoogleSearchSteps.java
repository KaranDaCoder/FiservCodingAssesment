package com.StepDefinitions;

import org.junit.Assert;

import com.Pages.GoogleHomePage;
import com.Pages.GoogleSearchResultsPage;
import com.managers.DriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GoogleSearchSteps {

	private GoogleHomePage googleHomePage = new GoogleHomePage(DriverManager.getDriverInstance());
	private GoogleSearchResultsPage googleSearchResultsPage = new GoogleSearchResultsPage(
			DriverManager.getDriverInstance());

	@Given("I am on the Google Home page")
	public void i_am_on_the_google_home_page() {
		DriverManager.getDriverInstance().get("https://www.google.com/");
	}

	@Given("I see the title as {string}")
	public void i_see_the_title_as(String expectedTitle) {
		String actualTitle = googleHomePage.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Then("I type {string} in search text")
	public void i_type_in_search_text(String countryName) {
		googleHomePage.enterSearchText(countryName);
	}

	@Then("click on search button")
	public void click_on_search_button() {
		googleHomePage.clickSearchButton();
	}

	@Then("I must be navigated to results page")
	public void i_must_be_navigated_to_results_page() {
		Assert.assertTrue(googleSearchResultsPage.validateResultsFetched());
	}

	@Then("I must see {string} on the results page")
	public void i_must_see_on_the_results_page(String expectedCapital) {
		String actualCapital = googleSearchResultsPage.getSearchResultsText();
		Assert.assertEquals(expectedCapital, actualCapital);
	}

	@Then("I type {string}<Country>\" in search text")
	public void i_type_country_in_search_text(String string) {

	}
}
