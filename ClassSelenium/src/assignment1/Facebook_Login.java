package assignment1;

import java.time.Duration;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args) throws InterruptedException {
		//using user inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email/phone number : ");
		String number = sc.next();
		System.out.println("EnterPassword : ");
		String pass = sc.next();
		
		WebDriver driver = new ChromeDriver();
		// Opening Facebook Login
		driver.get("https://www.facebook.com/");
		// Maximize the web page
		driver.manage().window().maximize();
		
		//Dynamic Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Enter email
		driver.findElement(By.id("email")).sendKeys(number);
	
		// Enter password
		driver.findElement(By.id("pass")).sendKeys(pass);
		
		driver.findElement(By.id("pass")).clear();
		
		// click on Login button
		driver.findElement(By.name("login")).click();
		
		driver.close();

	}

}

//Thread.sleep() is a hard coded(static) wait. But we need Dynamic wait like Implicit wait, Explicit wait and Fluent wait etc.
