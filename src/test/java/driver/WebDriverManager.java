package driver;

import java.time.LocalDate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebDriverManager {
	 protected WebDriver driver;
	 LocalDate time = LocalDate.now(); 
	 long startTime;
	 long delta;
	 public void deltaTime(){
		 long currentTime = System.currentTimeMillis();
		 delta = currentTime - startTime;
	 }
	 
	 @BeforeMethod
	 public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver", "resources/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	 		driver.navigate().to("https://www.thefork.com.ar/");
	    }	
	 
	 	//ITrestREsult sirve para mostrar los resultados en forma de Int donde 1 test ok y 2 es test no ok
	 @AfterMethod
	 public void tearDown(ITestResult result) {
		 System.out.println("El test "+result.getMethod().getDescription()+"(1= Paso satisfactoriamente - 2= No paso satisfactoriamente) resultó: "+result.getStatus());
		 driver.close();
		 driver.quit();
	 }
}

