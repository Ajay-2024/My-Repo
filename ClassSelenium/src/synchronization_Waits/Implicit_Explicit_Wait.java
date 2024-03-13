package synchronization_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_Explicit_Wait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//Sync- implicit wait- After this driver will get 0-30 sec(max) for action, NoSuchElement exception
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://online.actitime.com/tcs/login.do");
		driver.findElement(By.name("username")).sendKeys("admin01");//0-30sec
		driver.findElement(By.name("pwd")).sendKeys("admin01");//0-30sec
		driver.findElement(By.id("loginButton")).click();//0-30sec
		
		String expectedHomepageTitle = "actiTIME - Enter Time-Track";
		//Sync - explicit wait (conditional wait) WebDriverWait & FluentWait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));		
		//now implement required condition for wait
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));		
				//or
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logoutLink"))));	
		
		String actualHomepageTitle=driver.getTitle();
		
		System.out.println("Expected Title : " + expectedHomepageTitle);
		System.out.println("Actual Title : " + actualHomepageTitle);
		System.out.println("Home page validation status? "+ actualHomepageTitle.equals(expectedHomepageTitle));

	}

}
