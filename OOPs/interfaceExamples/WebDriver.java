package interfaceExamples;

public interface WebDriver {

	public void click();
	
	public void sendKeys(String s);
	
}

class FirefoxDriver implements WebDriver { // Inheritance can be done by implements instead of extends.

	public void click() {

	}

	public void sendKeys(String s) {

	}

}




