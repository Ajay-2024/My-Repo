package synchronization_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Eplicit_Wait_Example2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		
		//Keys.ENTER used to enter the search box for searching Selenium. We can also use Keys.RETURN
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("l"))).click();
	
	}

}
