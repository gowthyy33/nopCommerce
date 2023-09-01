package actionClass;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v113.browser.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import webElement.LoginWebElement;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class LoginAction {
	WebDriver driver;

	// RegisterAction brow = new RegisterAction();
	LoginWebElement logMethod = new LoginWebElement(driver);
	static ExtentReports report ;
	static ExtentTest test;
	
	  
	  
	  
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
	public void passCreds() throws InterruptedException, IOException {
		logMethod = new LoginWebElement(driver);
		
		//properties
		FileInputStream fileInput = new FileInputStream("./src/test/java/actionClass/cred.properties");
        Properties properties = new Properties();
        properties.load(fileInput);
        
        
        String gmail = properties.getProperty("username");
        String pass = properties.getProperty("password");
		
		
		
		 logMethod.emailLogin().sendKeys(gmail); 
		 Thread.sleep(3000);
		 logMethod.passwordLogin().sendKeys(pass); 
		 Thread.sleep(3000);
		 
}
	
	@Test (priority = 2)
	public void login() throws InterruptedException {
		logMethod = new LoginWebElement(driver);
		logMethod.loginBtn().click();
		Thread.sleep(3000);
		String expTitle = "nopCommerce demo store";
		String gotTitle = driver.getTitle();
		
		assertEquals(expTitle, gotTitle); 
	
		
	}
	
	
	//logout code
	@Test(priority=3 ,enabled=false)
	public void logout() {
		
		logMethod = new LoginWebElement(driver);
		logMethod.logout().click();
		
		//login check report
	}
	
	
	@AfterTest
	public void quitBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
}