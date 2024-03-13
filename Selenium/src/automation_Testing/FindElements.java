package automation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		// Opening browser using find element
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://gmail.com");
		driver1.manage().window().maximize();

		WebElement username = driver1.findElement(By.id("identifierId")); // Finding using id locator
		username.sendKeys("shivmangal451@gmail.com");
		// Finding element Next button using xpath locator
		driver1.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();

		driver1.quit();

	}
}
