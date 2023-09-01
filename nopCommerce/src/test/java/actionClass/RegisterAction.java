package actionClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import webElement.RegisterWebElement;



public class RegisterAction {
	WebDriver driver = new ChromeDriver();
	RegisterWebElement regMethod = new RegisterWebElement(driver); ;

	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void invokeBrowser() {
		ChromeOptions co = new ChromeOptions();
		co.setBrowserVersion("116");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	}
	
	
	@Test(priority=1)
	public void genderSelection() throws InterruptedException {
		//regMethod = new RegisterWebElement(driver);
		driver.get("https://demo.nopcommerce.com/");
		regMethod.registerMain().click();
		Thread.sleep(2000);
		//regMethod.genderFemale().click();
		regMethod.genderMale().click();
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	public void enterName() throws InterruptedException {
		//regMethod = new RegisterWebElement(driver);
		regMethod.firstName().sendKeys("Gowtham");
		regMethod.lastName().sendKeys("K");
		Thread.sleep(3000);
		
	}
	
	@Test(priority=3)
	public void dateOfBirth() throws InterruptedException {
		//regMethod = new RegisterWebElement(driver);
		Select daySel = new Select(regMethod.date());
		Select monthSel = new Select(regMethod.month());
		Select yearSel = new Select(regMethod.year());
		
		daySel.selectByValue("11");
		Thread.sleep(2000);
		monthSel.selectByValue("1");
		Thread.sleep(2000);
		yearSel.selectByValue("2001");
		Thread.sleep(2000);
	}
	
	
	@Test(priority=4)
	public void emailInput() throws InterruptedException {
		//regMethod = new RegisterWebElement(driver);
		regMethod.emailReg().sendKeys("gowthy33@gmail.com");
		Thread.sleep(3000);
	}
	
	
	@Test(priority=5)
	public void companyName() throws InterruptedException {
		//regMethod = new RegisterWebElement(driver);
		regMethod.companyName().sendKeys("ITC infotech");	
		Thread.sleep(3000);
	}
	
	
	@Test(priority=6)
	public void newsletter() throws InterruptedException {
		//regMethod = new RegisterWebElement(driver);
		regMethod.newsletter().click();
		Thread.sleep(2000);
	}
	
	@Test(priority=7)
	public void passSet() throws InterruptedException {
		//regMethod = new RegisterWebElement(driver);
		regMethod.passwordSet().sendKeys("Gow12345");
		Thread.sleep(3000);
		regMethod.passwordCnf().sendKeys("Gow12345");
		Thread.sleep(2000);
		
		
	}
	
	@Test(priority=8) 
	public void regUser() throws InterruptedException {
		//regMethod = new RegisterWebElement(driver);

		regMethod.registerBtn().click();
		Thread.sleep(5000);
	}
	
	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}
	
	
	
	
	
	
	

}
