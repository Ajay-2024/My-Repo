package test_Cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import page_Objects.Login_Page;

public class TC_LoginTest_001 extends Base_Class {

	@Test
	public void loginTest() {

		// Opening of Url by calling get ()
		//driver.get(baseUrl);   // Shifted to Base_Class when we use to open desired browser
		log.info("Url is opened. ");

		// Now to call methods of Login_Page Class we have to create an object
		Login_Page page = new Login_Page(driver);

		// username and password taken from Base_Class
		page.enterUsername(username);
		log.info("Enter the username");

		page.enterPassword(password);
		log.info("Enter the password");

		page.clickLogin();

		// Debugging: Print out the current URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is : " + currentUrl);

		System.out.println("\n*************************************");
		// Assertion
		if (driver.getCurrentUrl().equals("https://demo.guru99.com/V1/html/Managerhomepage.php")) {
			Assert.assertTrue(true);
			log.info("Login Test is passed");

		} else {
			// Debugging: Print a message if assertion fails
			System.out.println("Test failed dut to wrong Url. ");
			Assert.assertTrue(false);
			log.info("Login Test is failed");

		}
	}
}
