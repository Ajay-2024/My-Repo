package Abstract_Class;

public abstract class WebDriver {

	public abstract void click(); // Abstract method don't have method body { }

	public abstract void sendKeys(String str);
	
	public void clear() { // Concrete/normal method
		
	}

	public static void main(String[] args) {
		
		// WebDrive driver = new WebDriver(); // We can't create an object of abstract class WebDriver

	}

}
/* It is voluntary/ not mandatory to override click() and sendKeys() from parent class WebDriver in ChromeDriver and FirefoxDriver.
 * To make it mandatory to override these methods, we use Abstract methods.
 * To have abstract methods, these methods must be present inside abstract class only.
 * Normal/concrete class can not contain abstract methods.
 * 
 * We can't create an object of abstract class
 */


