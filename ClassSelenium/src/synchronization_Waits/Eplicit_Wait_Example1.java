package synchronization_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Eplicit_Wait_Example1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		String expectedTitle = "Google";
		 
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		
		System.out.println("Expected Title : " + expectedTitle);

		System.out.println("Actual Title : " + driver.getTitle());
		
		Object actualTitle = driver.getTitle();
		System.out.println("Home page validation status? " + actualTitle.equals(expectedTitle));

	
	}

}
