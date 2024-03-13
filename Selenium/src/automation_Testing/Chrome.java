package automation_Testing;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver(); // We can directly open website without executable files.
		driver.get("https://www.amazon.in"); // Opens the amazon website
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
