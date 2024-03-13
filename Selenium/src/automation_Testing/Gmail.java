package automation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().length());
		/*
		// Finding using id locator
		WebElement email = driver.findElement(By.id("identifierId")); 
		email.sendKeys("shivmangal451@gmail.com");
		// Finding element Next button using xpath locator
		WebElement button = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
		button.click();
		*/
		//Above operations can be done by Method chaining without using WebElement reference
		driver.findElement(By.id("identifierId")).sendKeys("shivmangal451@gmail.com"); 
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
	
		//Closing of browser
		driver.close();

	}

}
