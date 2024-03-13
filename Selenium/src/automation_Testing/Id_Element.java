package automation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Element {

	public static void main(String[] args) {
		// Opening browser using find element
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://accounts.google.com");
		driver1.manage().window().maximize();
		WebElement username = driver1.findElement(By.id("initialView")); // Finding using id locator

	}

}
