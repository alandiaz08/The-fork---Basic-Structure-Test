package test;

import org.testng.annotations.Test;

import driver.WebDriverManager;
import pages.HomePage;
import pages.RestProfilePage;
import pages.SearchPage;

public class TestOne extends WebDriverManager{
	@Test
	public void test() {
		HomePage home = new HomePage(driver);
		home.searchRestaurant();
		SearchPage bookRest = new SearchPage(driver);
		bookRest.bookAndSelectRest();
		RestProfilePage restProfile = new RestProfilePage(driver);
		restProfile.bookRest();
	}
}
