package web.login;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import web.WebSuiteConfig;

public class VerifyLoginWithValidCredentials extends WebSuiteConfig {
	
	
	
	@Test
	public void loginWithValidCred() throws MalformedURLException {
		
		WebDriver driver = getWebDriver();
		
		launchSite(driver);
		
		HomePage hp = new HomePage(driver);
		hp.doLogin("saurabhgarg.it@gmail.com", "password");
		
		
		
		
		
	}

}
