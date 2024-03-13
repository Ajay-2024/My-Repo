package synchronization_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait_Example3 {

	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		//Keys.ENTER used to enter the search box for searching Selenium. We can also use Keys.RETURN
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		
		//To open Downloads section of Selenium
		driver.findElement(By.className("l")).click();
		
	}

}
