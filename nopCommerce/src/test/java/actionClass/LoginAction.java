package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v113.browser.Browser;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import webElement.LoginWebElement;

public class LoginAction {
	WebDriver driver;

	// RegisterAction brow = new RegisterAction();
	LoginWebElement logMethod = new LoginWebElement(driver);

	
	  
	  @SuppressWarnings("deprecation")
	  
	  @BeforeTest
	  public void invokeBrowser() {
		  	logMethod = new LoginWebElement(driver);
			ChromeOptions co = new ChromeOptions();
			co.setBrowserVersion("116");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	  }
	 

	@Test(priority = 0)
	public void loginclick() throws InterruptedException {

		logMethod = new LoginWebElement(driver);
		driver.get("https://demo.nopcommerce.com/");
		logMethod.loginMenu().click();

	}
	
	@Test(priority = 1)
	public void passCreds() throws InterruptedException {
		logMethod = new LoginWebElement(driver);
		logMethod.emailLogin().sendKeys("gowthy33@gmail.com");
		Thread.sleep(3000);
		logMethod.passwordLogin().sendKeys("Gow12345");
		Thread.sleep(3000);
	}
	
	@Test (priority = 2)
	public void login() {
		logMethod = new LoginWebElement(driver);
		logMethod.loginBtn().click();
		
	}
	
	
	//logout code
	@Test(priority=3)
	public void logout() {
		logMethod = new LoginWebElement(driver);
		logMethod.logout().click();
	}
	
	
	@AfterTest
	public void quitBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
}