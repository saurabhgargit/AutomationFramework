package global;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager extends Base {
	
	
	private static DriverManager driverManager = new DriverManager();
	
	
	public static DriverManager getInstance() {
		return driverManager;
	}
	
	
	public WebDriver getDriver() throws MalformedURLException {
		startChromeDriver();
		return new ChromeDriver();
	
	}
	
	public static void startChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
	}
	
	
	

}
