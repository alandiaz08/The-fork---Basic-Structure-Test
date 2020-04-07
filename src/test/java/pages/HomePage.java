package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.WebDriverManager;

public class HomePage extends WebDriverManager{
	private WebDriver driver;
	private By searchRestField;
	private By searchWhereField;
	private By searchButton;
	private By crossButton;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		searchRestField = By.xpath("/html/body/div[1]/div/main/div[1]/div/div/div[2]/div/div/div[1]/div/div[1]/span/span/label/span/span/input");
		searchWhereField = By.xpath("/html/body/div[1]/div/main/div[1]/div/div/div[2]/div/div/div[2]/div/div[1]/span/span/label/span/span/input");
		searchButton = By.xpath("//*[@id=\"root\"]/div/main/div[1]/div/div/div[2]/div/div/div[3]/button");
		crossButton = By.xpath("/html/body/div[1]/div/main/div[1]/div/div/div[2]/div/div/div[2]/div/div[1]/span/span/span[2]/button/svg/use//path");
	}
	
	public void searchRestaurant() {
		//driver.findElement(searchRestField).sendKeys(rest);
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[1]/div/div")).click();
		//driver.findElement(crossButton).click();
		//WebDriverWait wait = new WebDriverWait(driver,15);
		//wait.until(ExpectedConditions.elementToBeClickable(searchWhereField));
		//driver.findElement(searchWhereField).sendKeys(country);
		driver.findElement(searchButton).click();
	}
}
