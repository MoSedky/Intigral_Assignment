package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class PropertyManager {
    private static PropertyManager instance;
    private static final Object lock = new Object();
    private static String propertyFilePath = System.getProperty("user.dir")+
            "\\src\\test\\resources\\configuration.properties";
    private static String url;
    private static String Username;
    private static String Password;
    private static String Country;
    private static WebDriver Driver;
    private static String Driver_Url;

    //Create a Singleton instance. We need only one instance of Property Manager.
    public static PropertyManager getInstance () {
        if (instance == null) {
            synchronized (lock) {
                instance = new PropertyManager();
                instance.loadData();
            }
        }
        return instance;
    }

    //Get all configuration data and assign to related fields.
    private void loadData() {
        //Declare a properties object
        Properties prop = new Properties();
        //Set ChromeDriver path and properties
        prop.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+
                        Driver_Url);

        //Read configuration.properties file
        try {
            prop.load(new FileInputStream(propertyFilePath));
            //prop.load(this.getClass().getClassLoader().getResourceAsStream("configuration.properties"));
        } catch (IOException e) {
            System.out.println("Configuration properties file cannot be found");
        }

        //Get properties from configuration.properties
        url = prop.getProperty("Url");
        Username = prop.getProperty("Username");
        Password = prop.getProperty("Password");
        Country=prop.getProperty("Country");
        Driver = new ChromeDriver();
    }

    public WebDriver getdriver(){
        return Driver;
    }

    public String getURL () {
        return url;
    }

    public String getUsername () {
        return Username;
    }

    public String getPassword () {
        return Password;
    }

    public String getCountry () {
        return Country;
    }

    public String getDriver_Url(){return Driver_Url;}
}
