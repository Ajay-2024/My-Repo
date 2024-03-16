package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {

	WebDriver driver;

	//Make a Constructor of Login_Page Class as public so we can access it outside the Class
	public Login_Page(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String uname) {
		driver.findElement(By.name("uid")).sendKeys(uname);
		;
	}

	public void enterPassword(String pass) {
		driver.findElement(By.name("password")).sendKeys(pass);
	}

	public void clickLogin() {
		driver.findElement(By.name("btnLogin")).click();
	}

}
