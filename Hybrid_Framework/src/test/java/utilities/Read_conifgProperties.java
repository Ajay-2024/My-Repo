package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_conifgProperties {

	// Creating object of Properties class
	private Properties properties;

	// Creating a constructor
	public Read_conifgProperties() {
		
		properties = new Properties();
        try {
            // Load the properties file
            String configFilePath = "D:\\Ajay\\Workspace\\Hybrid_Framework\\Configuration\\config.properties";
            FileInputStream fileInputStream = new FileInputStream(configFilePath);
            properties.load(fileInputStream);
            fileInputStream.close(); // Close the FileInputStream
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception as needed
        }
    }

    public String getBaseUrl() {
        return properties.getProperty("baseUrl");
    }

    public String getUsername() {
        return properties.getProperty("username");
    }

    public String getPassword() {
        return properties.getProperty("password");
    }
    
    public String getChromepath() {
        return properties.getProperty("chromepath");
    }

	public String getFirefoxpath() {
		return properties.getProperty("firefoxpath");
	}

}
