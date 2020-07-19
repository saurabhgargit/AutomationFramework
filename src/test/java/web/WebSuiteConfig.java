package web;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;

import global.DriverManager;
import global.Libraries;

public class WebSuiteConfig extends Libraries {
	
	
	public void setBrowserProperties(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(240, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	public WebDriver getWebDriver() throws MalformedURLException {
		WebDriver driver;
		try {
			driver = DriverManager.getInstance().getDriver();
		} catch (SessionNotCreatedException s) {
			driver = DriverManager.getInstance().getDriver();
		}
		setBrowserProperties(driver);
		return driver;
	}

}
