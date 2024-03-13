package synchronization_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait_Example4 {

	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String expectedTitle = "Google";
		
		System.out.println("Expected Title : " + expectedTitle);

		System.out.println("Actual Title : " + driver.getTitle());
		
		Object actualTitle = driver.getTitle();
		System.out.println("Home page validation status? " + actualTitle.equals(expectedTitle));
		
	}

}
