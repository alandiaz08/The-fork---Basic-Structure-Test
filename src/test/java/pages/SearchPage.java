package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	private WebDriver driver;
	private By dateButton;
	private By hourButton;
	private By cantPersonButton;
	private By nameRestSelected;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		dateButton = By.xpath("//*[@id=\"panel1\"]/div[2]/div/div/button[2]/span/span[2]");
		hourButton = By.xpath("//*[@id=\"panel2\"]/div[2]/div/div/div[43]/button");
		cantPersonButton = By.xpath("//*[@id=\"panel3\"]/div[2]/div/div/div/div[3]/button");
		nameRestSelected = By.xpath("//*[@id=\"root\"]/div/div[4]/div[3]/div/div/div[1]/div/div[3]/div/div[2]/div[1]/div[2]/div[1]/div/h2/a");
	}
	
	public void bookAndSelectRest() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(dateButton));
		driver.findElement(dateButton).click();
		driver.findElement(hourButton).click();
		driver.findElement(cantPersonButton).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(nameRestSelected));
		driver.findElement(nameRestSelected).click();
		
	}

}
