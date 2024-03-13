package assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//Open the Web site
		driver.get("https://demo.vtiger.com");
		
		//To Maximize the window
		driver.manage().window().maximize();
		
		//Get the title of Web
		System.out.println(driver.getTitle());
		
		//Get the length of Web title
		System.out.println(driver.getTitle().length());
		
		//Get current URL of Web site
		System.out.println(driver.getCurrentUrl());
		
		//Get Page source code
		System.out.println(driver.getPageSource());
		
		//Get Page source length
		System.out.println(driver.getPageSource().length());
		
		//Close the browser/ Web site
		driver.close();
	}

}
