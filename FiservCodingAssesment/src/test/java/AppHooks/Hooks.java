package AppHooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.managers.DriverManager;
import com.utils.PropertiesReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

private DriverManager driverManager;
private WebDriver driver;
private PropertiesReader propertiesReader;
private Properties prop;


@Before(order=0)
public void getProperty() {
	propertiesReader = new PropertiesReader();
	prop = propertiesReader.init();
	
}

@Before(order = 1)
public void start() {
	String browser_name = prop.getProperty("browser");
	driverManager = new DriverManager();
	driver = driverManager.init(browser_name);
}

@After(order = 1) 
public void tearDown() {
	driver.quit();
}
	
}
