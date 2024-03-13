package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtigercrm {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");

		// To Maximize the window
		driver.manage().window().maximize();

		// Removing existing text from Username field
		driver.findElement(By.id("username")).clear();

		// Enter/type Username as 'admin'
		driver.findElement(By.id("username")).sendKeys("admin");

		// Removing existing text from Password field
		driver.findElement(By.name("password")).clear();

		// Enter/type Password as 'admin'
		driver.findElement(By.name("password")).sendKeys("admin");

		driver.findElement(By.tagName("button")).click();

		// Close the browser
		driver.quit();

	}

}
