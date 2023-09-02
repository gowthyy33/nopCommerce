package actionClass;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import webElement.LoginWebElement;

public class ForgetPassword {
	
	static WebDriver driver;
	static LoginWebElement logMethod = new LoginWebElement(driver);
	
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
	
	@Test (priority=0)
	public void forgetPassClick() throws InterruptedException {
		LoginWebElement logMethod = new LoginWebElement(driver);

		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		Thread.sleep(2000);
		logMethod.forgetPassword().click();
	}
	
	@Test(priority = 1)
	public void enterRecoveryMail() throws IOException, InterruptedException {
		
		LoginWebElement logMethod = new LoginWebElement(driver);
		
		FileInputStream file = new FileInputStream("./src/test/java/actionClass/cred.properties");
		
		Properties prop = new Properties();
		prop.load(file);
		
		String mailID = prop.getProperty("username");
	
		Thread.sleep(2000);
		
		logMethod.recoveryMail().sendKeys(mailID);
		
		Thread.sleep(2000);
	}
	
	
	@Test(priority=2)
	public void recoverBtn() {
		LoginWebElement logMethod = new LoginWebElement(driver);
		
		logMethod.recoverBtn().click();
		
		WebElement sMsg = driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p"));
		
		String recMsg = sMsg.getText();
		
		String compMsg = "Email with instructions has been sent to you.";
		
		assertEquals(recMsg, compMsg);
	}
	@AfterTest
	public void quitBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	
}
