package synchronization_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait_Example1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//Sync- implicit wait- After this driver will get 0-30 sec(max) for action, NoSuchElement exception
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");//0-30sec
		driver.findElement(By.name("password")).sendKeys("admin123");//0-30sec
		driver.findElement(By.className("orangehrm-login-button")).click();//0-30sec


	}

}

//To get import of ChromeDriver, WebDriver etc use shortcut --> Ctrl + Shift + o + Enter