package automation_Testing;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_ChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); //Opens the Facebook website
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
