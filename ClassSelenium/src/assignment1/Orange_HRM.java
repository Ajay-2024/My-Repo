package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// To Maximize the window
		driver.manage().window().maximize();

		// Dynamic Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Enter/type Username as 'admin'
		driver.findElement(By.name("username")).sendKeys("Admin");

		// Enter/type Password as 'admin123'
		driver.findElement(By.name("password")).sendKeys("admin123");

		// Click on Login button
		driver.findElement(By.tagName("button")).click();

		// Closing of browser
		driver.close();

	}

}
