package synchronization_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait_Example2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//Sync- implicit wait- After this driver will get 0-30 sec(max) for action, NoSuchElement exception
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://online.actitime.com/tcs/login.do");
		driver.findElement(By.name("username")).sendKeys("admin01");//0-30sec
		driver.findElement(By.name("pwd")).sendKeys("admin01");//0-30sec
		driver.findElement(By.id("loginButton")).click();//0-30sec
		
		driver.close();
		
	}

}
