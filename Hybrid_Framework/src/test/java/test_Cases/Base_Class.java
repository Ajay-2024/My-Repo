package test_Cases;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Read_conifgProperties;

public class Base_Class {

	/*
	 * // Providing assigning hard-coded values to variables public String baseUrl =
	 * "https://demo.guru99.com/V1/index.php"; public String username =
	 * "mngr559492"; public String password = "syjebet";
	 */

	// TO get without hard-coded values, we have to create config.properties file
	// and load all variables into it. Then create another class to load this file.

	// To call these variables from Read_configProperties class we have to create
	// its object
	Read_conifgProperties reco = new Read_conifgProperties();

	// Calling of methods from Read_conifgProperties Class
	public String baseUrl = reco.getBaseUrl();
	public String username = reco.getUsername();
	public String password = reco.getPassword();

	public static WebDriver driver;

	// To adding/configure logs to/into a test case
	public static Logger log = LogManager.getLogger(Base_Class.class);

	/*
	 * @BeforeClass 
	   public void setup() {
	 * System.setProperty("webdriver.chrome.driver", reco.getChromepath());
	 * //WebDriverManager.chromedriver().setup();
	 * log.info("chromedriver setup is completed. "); 
	 * driver = new ChromeDriver(); }
	 */

	// Now to run the Test Case in desired browser
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", reco.getChromepath());
			driver = new ChromeDriver();
			
		} else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", reco.getFirefoxpath());
			driver = new FirefoxDriver();
		}

		// Opening of Url by calling get ()
		driver.get(baseUrl);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
		log.info("Quitting the chrome browser");
	}

}
