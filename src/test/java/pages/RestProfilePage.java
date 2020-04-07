package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Helpers;

public class RestProfilePage {
	private WebDriver driver;
	private By bookRestButton;
	private By cantPersonButton;
	private By dateButton;
	private By serviceButton;
	private By hourButton;
	private By continueButton;
	private By reservationButton;
	public RestProfilePage(WebDriver driver) {
		this.driver = driver;
		bookRestButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div[3]/div[4]/div/div/div/div/div/div/div/div[1]/div/div/div/div[2]/a");
		cantPersonButton = By.xpath("//*[@id=\"p\"]/div/div/div/div/div/div/div[2]/div/div/button");
		dateButton = By.xpath("//*[@id=\"d\"]/div/div/div[2]/button/span[1]/span/span[1]/span");
		serviceButton = By.xpath("//*[@id=\"s\"]/div/div/div[3]/button/span[1]");
		hourButton = By.xpath("//*[@id=\"s\"]/div/div/div/div/div/div/div[3]/div/div/button/time");
		continueButton = By.xpath("//*[@id=\"booking-modal\"]/div/div[2]/section/div[2]/section/div/div/form/div[5]/button");
		reservationButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div[2]/div/div[3]/button");
		
	}
	
	public void bookRest() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(reservationButton));
		driver.findElement(reservationButton).click();
		/*wait.until(ExpectedConditions.presenceOfElementLocated(bookRestButton));
		driver.findElement(bookRestButton).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(cantPersonButton));
		driver.findElement(cantPersonButton).click();
		driver.findElement(dateButton).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(serviceButton));
		driver.findElement(serviceButton).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(hourButton));
		driver.findElement(hourButton).click();
		driver.findElement(continueButton).click();*/
			
	}
	
}
