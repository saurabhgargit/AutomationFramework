package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import global.Libraries;

public class HomePage extends Libraries {
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(id="loginbutton")
	WebElement loginBtn;
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public UserHomePage doLogin(String id, String pass) {
		
		System.out.println("Doing Login");
		
		username.clear();
		username.sendKeys(id);
		password.clear();
		password.sendKeys(pass);
		loginBtn.click();
		System.out.println("clicked login button");
		
		return new UserHomePage(driver);
		
	}
	
	
	

}
