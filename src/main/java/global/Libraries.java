package global;

import org.openqa.selenium.WebDriver;

public class Libraries {
	
	public void launchSite(WebDriver driver) {
		System.out.println("Launching Site");
		driver.get("https://www.facebook.com");
	}

}
