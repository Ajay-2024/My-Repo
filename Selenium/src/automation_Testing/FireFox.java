package automation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
		// Opening Firefox browser
		WebDriver driver = new FirefoxDriver();
		driver.get("https://gmail.com");

		// To maximize the window
		driver.manage().window().maximize();

		// Finding element using id locator
		WebElement username = driver.findElement(By.id("identifierId"));
		username.sendKeys("shivmangal451@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div[1]/div/div/button/span")).click();

		// driver.manage().window().fullscreen();

	}

}
