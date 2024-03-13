package assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com ");
		driver.manage().window().maximize();
		
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		System.out.println("Actual Home page Title : " + actualTitle);
		System.out.println("Home page validation status? " + actualTitle.equals(expectedTitle));
		
		driver.close();

	}

}
